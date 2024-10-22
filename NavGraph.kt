package com.example.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Home,
        route = root
    ) {
        HomeNavGraph(navController = navController)
        NewNavGraph(navController = navController)
    }
}