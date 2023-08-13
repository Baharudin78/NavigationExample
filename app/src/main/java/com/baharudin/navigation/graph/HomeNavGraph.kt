package com.baharudin.navigation.graph

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.baharudin.navigation.screen.home.menu.DashboardScreen
import com.baharudin.navigation.screen.home.menu.ProfileScreen
import com.baharudin.navigation.screen.home.menu.SettingSceen

@Composable
fun HomeNavGraph(navHostController: NavHostController, paddingValues: PaddingValues) {
    NavHost(
        navController = navHostController,
        route = Graph.HOME,
        startDestination = BottomBarItem.Dashboard.route
    ){
        composable(route = BottomBarItem.Dashboard.route){
            DashboardScreen()
        }

        composable(route = BottomBarItem.Profile.route){
            ProfileScreen()
        }

        composable(route = BottomBarItem.Setting.route){
            SettingSceen()
        }
    }
}