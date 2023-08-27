package com.baharudin.finalproject.graph

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector


sealed class BottomBarItem(
    val route : String,
    val title : String,
    val icon : ImageVector
){
    object Dashboard : BottomBarItem(
        route = "DASHBOARD",
        title = "Home",
        icon = Icons.Default.Home
    )
    object Profile : BottomBarItem(
        route = "PROFILE",
        title = "Profile",
        icon = Icons.Default.Person
    )
    object Setting : BottomBarItem(
        route = "SETTING",
        title = "Setting",
        icon = Icons.Default.Settings
    )
}
