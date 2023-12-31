package uk.ac.tees.w9602985.myica.feature.signup.data

data class SignUpUIState(
    var firstName: String = "",
    var lastName: String = "",
    var email: String = "",
    var password: String = "",
    var privacyPolicyAccepted: Boolean = false,
    var errorMsg: String? =null,

    var firstNameMsgError : String ="",
    var lastNameMsgError : String ="",
    var emailMsgError : String ="",
    var passwordMsgError : String ="",
    var privacyPolicyAcceptedMsgError : String ="",



    var firstNameError: Boolean = false,
    var lastNameError: Boolean = false,
    var emailError: Boolean = false,
    var passwordError: Boolean = false,
    var privacyPolicyError: Boolean = false

)