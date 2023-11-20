package uk.ac.tees.w9602985.myica.data.network

import androidx.room.Database
import androidx.room.RoomDatabase
import uk.ac.tees.w9602985.myica.data.models.Movie

@Database(entities = [Movie::class], version = 1, exportSchema = false)
abstract class FavoriteDatabase: RoomDatabase() {

    abstract fun daoInterface(): TmdbDao
}