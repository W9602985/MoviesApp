package uk.ac.tees.w9602985.myica.feature.login.data

sealed class LoginUIEvent {

    data class EmailChanged(val email: String) : LoginUIEvent()
    data class PasswordChanged(val password: String) : LoginUIEvent()
    object  LogInButtonClicked : LoginUIEvent()

}
