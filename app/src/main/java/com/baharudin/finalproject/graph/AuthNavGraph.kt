package com.baharudin.finalproject.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.baharudin.finalproject.screen.auth.forgot_password.ForgotPasswordScreen
import com.baharudin.finalproject.screen.auth.forgot_password.KodeOTPScreen
import com.baharudin.finalproject.screen.auth.forgot_password.ResetPasswordScreen
import com.baharudin.finalproject.screen.auth.login.LoginScreen
import com.baharudin.finalproject.screen.auth.registrasi.RegisterScreen

fun NavGraphBuilder.authNavGraph(navHostController: NavHostController) {
    navigation(
        route = Graph.AUTHENTICATION,
        startDestination = AuthScreen.Login.route
    ) {
        composable(route = AuthScreen.Login.route) {
            LoginScreen(navHostController)
        }
        composable(route = AuthScreen.Register.route) {
            RegisterScreen(navHostController)
        }
        composable(route = AuthScreen.ForgotPassword.route) {
            ForgotPasswordScreen(navHostController)
        }
        composable(route = AuthScreen.KodeOTPScreen.route) {
            KodeOTPScreen(navHostController)
        }
        composable(route = AuthScreen.ResetPassword.route) {
            ResetPasswordScreen(navHostController)
        }
    }
}

sealed class AuthScreen(val route: String) {
    object Login : AuthScreen(route = "LOGIN")
    object Register : AuthScreen(route = "REGISTER")
    object ForgotPassword : AuthScreen(route = "FORGOT_PASSWORD")
    object KodeOTPScreen : AuthScreen(route = "KODE_OTP")
    object ResetPassword : AuthScreen(route = "RESET_PASSWORD")
}