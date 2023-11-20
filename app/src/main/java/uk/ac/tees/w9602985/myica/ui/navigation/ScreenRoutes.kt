package uk.ac.tees.w9602985.myica.ui.navigation

sealed class ScreenRoutes(val route: String) {
    object BottomBar : ScreenRoutes("/bottombar")
    object Detail : ScreenRoutes("/detail/{movieId}")

}