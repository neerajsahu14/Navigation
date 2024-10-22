package com.example.navigation
const val Arg_ID = "id"
const val Arg_NAME = "id"
const val Auth = "auth"
const val root = "root"
const val Home = "home_graph"
sealed class Screen(val route: String) {
    object Home : Screen(route = "home")
    object Details : Screen(route = "details?id={$Arg_ID}&name={$Arg_NAME}") {
        fun passIDAndNAME(id : Int =0 , name : String = "Neeraj"): String {
          return "details?id=$id&name=$name"
        }
    }
    object SignUp : Screen(route = "signup")
    object SignIn : Screen(route = "signin")

}