package com.baharudin.navigation.screen.auth.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.baharudin.navigation.graph.AuthScreen
import com.baharudin.navigation.graph.Graph

@Composable
fun TextRegisterComponent(
    modifier: Modifier = Modifier,
    navHostController: NavHostController
) {
    Column(
        modifier = modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Lupa Password",
            fontSize = 18.sp,
            style = TextStyle(color = MaterialTheme.colorScheme.primary),
            modifier = Modifier.clickable {
                navHostController.navigate(AuthScreen.ForgotPassword.route)
            }
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Daftar Disini",
            fontSize = 18.sp,
            style = TextStyle(color = MaterialTheme.colorScheme.primary),
            modifier = Modifier.clickable {
                navHostController.navigate(AuthScreen.Register.route)
            }
        )
    }
}

@Composable
@Preview
fun TextRegisterComponentPreview() {
    TextRegisterComponent(navHostController = rememberNavController())
}