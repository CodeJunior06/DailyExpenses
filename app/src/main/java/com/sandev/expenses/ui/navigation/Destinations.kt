package com.sandev.expenses.ui.navigation

sealed class Destinations (
    val route:String
){
    data object SplashScreen :Destinations("splashScreen")
    data object LoginScreen: Destinations("loginScreen")
    data object RegisterScreen :Destinations("registerScreen")
}