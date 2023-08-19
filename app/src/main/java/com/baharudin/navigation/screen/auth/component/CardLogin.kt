package com.baharudin.navigation.screen.auth.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.baharudin.navigation.R
import com.baharudin.navigation.graph.Graph
import com.baharudin.navigation.screen.component.ButtonComponent
import com.baharudin.navigation.screen.component.OutlinedTextFieldComponent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardLogin(
    modifier: Modifier = Modifier,
    navHostController: NavHostController
) {
    Card(
        modifier
            .fillMaxWidth()
            .padding(16.dp), shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        var username by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        OauthAlternativeComponent(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 16.dp, end = 16.dp),
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Transparent)
                .padding(16.dp)
        ) {
            OutlinedTextFieldComponent(
                placeholders = "Username",
                values = username,
                onValueChanges = { username = it },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )

            Spacer(modifier = Modifier.height(12.dp))

            OutlinedTextFieldComponent(
                placeholders = "Password",
                values = password,
                onValueChanges = { password = it },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                visualTransformation = PasswordVisualTransformation()
            )

            Spacer(modifier = Modifier.height(12.dp))

            ButtonComponent(onClick = {
                navHostController.navigate(Graph.HOME)
            }, text = "Login")

        }
    }

}

@Composable
@Preview
fun CardLoginPreview() {
    CardLogin(navHostController = rememberNavController())
}