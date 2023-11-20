package uk.ac.tees.w9602985.myica

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.compose.currentBackStackEntryAsState
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.AndroidEntryPoint
import uk.ac.tees.w9602985.myica.app.MoviesApp
import uk.ac.tees.w9602985.myica.theme.MoviesAppTheme
import uk.ac.tees.w9602985.myica.ui.navigation.BottomBarNavigation
import uk.ac.tees.w9602985.myica.ui.navigation.BottomBarRoutes
import uk.ac.tees.w9602985.myica.ui.navigation.rememberAppState
import uk.ac.tees.w9602985.myica.ui.viewmodels.MovieViewModel
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val movieViewModel: MovieViewModel by viewModels()
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirebaseApp.initializeApp(this)
            FirebaseAuth.getInstance().signOut()
            MoviesApp()
        }
    }
}


