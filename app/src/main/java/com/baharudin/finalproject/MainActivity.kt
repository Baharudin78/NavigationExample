package com.baharudin.finalproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.baharudin.finalproject.graph.RootNavGraph
import com.baharudin.finalproject.ui.theme.NavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationTheme {
               RootNavGraph(navHostController = rememberNavController())
            }
        }
    }
}
