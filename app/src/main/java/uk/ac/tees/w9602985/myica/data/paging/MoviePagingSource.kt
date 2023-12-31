package uk.ac.tees.w9602985.myica.data.paging

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import uk.ac.tees.w9602985.myica.data.models.Movie
import uk.ac.tees.w9602985.myica.data.network.TmdbService
import uk.ac.tees.w9602985.myica.utils.QueryType

class MoviePagingSource(
    private val tmdbService: TmdbService,
    private val apiKey: String, private val type:Int, private val query: String
) : PagingSource<Int, Movie>() {
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Movie> {
        return try {
            val page = params.key ?: 1
            val response = if (type == QueryType.POPULAR){
                tmdbService.getPopularMovies(apiKey, page)
            }else if (type == QueryType.UPCOMING){
                tmdbService.getUpcomingMovies(apiKey,page)
            }else if (type == QueryType.NOWPLAYING){
                tmdbService.getNowPlayingMovies(apiKey,page)
            } else {
                Log.e("search","MSK")
                tmdbService.searchMovie(apiKey,query,page)
            }

            Log.e(type.toString(),response.results.toString())
            LoadResult.Page(
                data = response.results,
                prevKey = if (page == 1) null else page - 1,
                nextKey = if (response.results.isEmpty()) null else page + 1
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, Movie>): Int? {
        return 1
    }
}

