package com.baharudin.finalproject.screen.auth.forgot_password

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.baharudin.finalproject.graph.AuthScreen
import com.baharudin.finalproject.screen.component.ButtonComponent
import com.baharudin.finalproject.screen.component.LinearGradient
import com.baharudin.finalproject.screen.component.OutlinedTextFieldComponent
import com.baharudin.finalproject.ui.theme.rubikFont

@Composable
fun ForgotPasswordScreen(
    navHostController: NavHostController
) {
    var email by remember { mutableStateOf("") }
    Box(modifier = Modifier.fillMaxSize()){
        LinearGradient(modifier = Modifier.fillMaxSize())
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Spacer(modifier = Modifier.height(100.dp))
            Text(
                text = "Lupa Password",
                fontFamily = rubikFont,
                fontSize = 20.sp,
                color = MaterialTheme.colorScheme.secondary,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = 16.dp, start = 16.dp)
            )

            Text(
                text = "Masukkan email untuk menerima kode OTP",
                fontFamily = rubikFont,
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.secondary,
                modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(50.dp))
            OutlinedTextFieldComponent(
                placeholders = "Email",
                values = email,
                onValueChanges = { email = it },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
            )

            Spacer(modifier = Modifier.height(20.dp))
            ButtonComponent(onClick = {
                navHostController.navigate(AuthScreen.KodeOTPScreen.route)
            }, text = "Selanjutnya")

        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ForgotPasswordScreenPreview() {
    ForgotPasswordScreen(navHostController = rememberNavController())
}