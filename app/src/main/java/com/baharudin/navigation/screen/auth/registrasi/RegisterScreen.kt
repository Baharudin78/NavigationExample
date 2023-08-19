package com.baharudin.navigation.screen.auth.registrasi

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.baharudin.navigation.screen.component.LinearGradient
import com.baharudin.navigation.ui.theme.rubikFont
import com.baharudin.navigation.R
import com.baharudin.navigation.graph.AuthScreen
import com.baharudin.navigation.graph.Graph
import com.baharudin.navigation.screen.auth.component.OauthAlternativeComponent
import com.baharudin.navigation.screen.auth.component.TextFooterClickableComponent
import com.baharudin.navigation.screen.component.ButtonComponent
import com.baharudin.navigation.screen.component.OutlinedTextFieldComponent

@Composable
fun RegisterScreen(
    navHostController: NavHostController
) {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        val boxRef = createRef()
        Box(
            modifier = Modifier
                .fillMaxSize()
                .constrainAs(boxRef) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    end.linkTo(parent.end)
                    start.linkTo(parent.start)
                }
        ) {
            LinearGradient(modifier = Modifier.fillMaxSize())
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Registrasi",
                    fontFamily = rubikFont,
                    fontSize = 32.sp,
                    color = MaterialTheme.colorScheme.secondary,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(top = 40.dp)
                )
                Text(
                    text = "Silahkan daftar untuk menikmati fiturnya",
                    fontFamily = rubikFont,
                    fontSize = 14.sp,
                    color = MaterialTheme.colorScheme.secondary,
                    modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(15.dp))

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
                    var username by remember { mutableStateOf("") }
                    var password by remember { mutableStateOf("") }

                    OutlinedTextFieldComponent(
                        placeholders = "Username",
                        values = username,
                        onValueChanges = { username = it },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    OutlinedTextFieldComponent(
                        placeholders = "Email",
                        values = username,
                        onValueChanges = { username = it },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
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
                        navHostController.navigate(AuthScreen.Login.route)
                    }, text = "Daftar")
                }
                Spacer(modifier = Modifier.height(15.dp))

                TextFooterClickableComponent(
                    modifier = Modifier
                        .clickable {
                            navHostController.popBackStack()
                            navHostController.navigate(AuthScreen.Login.route)
                        },
                    text = "Sudah punya akun? Masuk"
                )
            }
        }
    }
}

@Composable
@Preview(showSystemUi = true, showBackground = true)
fun RegisterScreenPreview() {
    RegisterScreen(navHostController = rememberNavController())
}
