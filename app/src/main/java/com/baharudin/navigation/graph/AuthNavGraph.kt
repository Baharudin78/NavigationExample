package com.baharudin.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.baharudin.navigation.screen.auth.forgot_password.ForgotPasswordScreen
import com.baharudin.navigation.screen.auth.LoginScreen
import com.baharudin.navigation.screen.auth.RegisterScreen

fun NavGraphBuilder.authNavGraph(navHostController: NavHostController) {
    navigation(
        route = Graph.AUTHENTICATION,
        startDestination = AuthScreen.Login.route
    ) {
        composable(route = AuthScreen.Login.route) {
            LoginScreen(navHostController)
        }
        composable(route = AuthScreen.Register.route) {
            RegisterScreen()
        }
        composable(route = AuthScreen.ForgotPassword.route) {
            ForgotPasswordScreen()
        }
    }
}

sealed class AuthScreen(val route: String) {
    object Login : AuthScreen(route = "LOGIN")
    object Register : AuthScreen(route = "REGISTER")
    object ForgotPassword : AuthScreen(route = "FORGOT_PASSWORD")
}