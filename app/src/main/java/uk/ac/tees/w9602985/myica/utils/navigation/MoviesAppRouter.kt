package uk.ac.tees.w9602985.myica.utils.navigation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

sealed class Screen(){

    object LoginScreen : Screen()
    object SignUpScreen : Screen()
    object TermsAndConditionsScreen : Screen()
    object HomeScreen : Screen()

}

object MoviesAppRouter{

    var currentScreen: MutableState<Screen> = mutableStateOf(Screen.LoginScreen)

    fun navigateTo(destination : Screen){
        currentScreen.value = destination

    }
}