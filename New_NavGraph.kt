package com.example.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation

fun NavGraphBuilder.NewNavGraph(navController : NavHostController) {
    navigation(startDestination = Screen.SignUp.route,
        route = Auth){
        composable(Screen.SignUp.route){
            SignUpScreen(navController)
        }
        composable(Screen.SignIn.route){
            SignInScreen(navController)
        }
    }
}