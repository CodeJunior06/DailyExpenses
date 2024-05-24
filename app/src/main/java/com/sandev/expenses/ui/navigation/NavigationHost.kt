package com.sandev.expenses.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sandev.expenses.ui.screen.LoginScreen
import com.sandev.expenses.ui.screen.SplashScreen

@Composable
fun NavigationHost(){
    val navController  = rememberNavController()
    NavHost(navController = navController, startDestination = Destinations.LoginScreen.route ){
        composable(Destinations.SplashScreen.route){
            SplashScreen(){

            }
        }
        composable(Destinations.LoginScreen.route){
            LoginScreen()
        }
        composable(Destinations.RegisterScreen.route){

        }
    }

}