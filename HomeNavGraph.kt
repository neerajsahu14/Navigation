package com.example.navigation

import android.util.Log
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.navArgument


fun NavGraphBuilder.HomeNavGraph(navController : NavHostController) {
    navigation(
        startDestination = Screen.Home.route,
        route = Home
    ){
        composable(Screen.Home.route){
            HomeScreen(navController)
        }
        composable(
            route = Screen.Details.route,
            arguments = listOf(
                navArgument(Arg_ID) {
                    type = NavType.IntType
                },
                navArgument(Arg_NAME){
                    type = NavType.StringType
                }
            )
        ){
            DetailsScreen(navController)
        }

    }

}
