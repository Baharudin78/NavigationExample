package com.baharudin.navigation.screen.auth.login

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.baharudin.navigation.ui.theme.NavigationTheme
import com.baharudin.navigation.R
import com.baharudin.navigation.graph.AuthScreen
import com.baharudin.navigation.screen.auth.component.CardLogin
import com.baharudin.navigation.screen.auth.component.TextFooterClickableComponent
import com.baharudin.navigation.screen.component.LinearGradient
import com.baharudin.navigation.ui.theme.rubikFont

@Composable
fun LoginScreen(
    navHostController: NavHostController,
) {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.white))
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
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Selamat Datang",
                    fontFamily = rubikFont,
                    fontSize = 32.sp,
                    color = MaterialTheme.colorScheme.secondary,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(top = 40.dp)
                )
                Text(
                    text = "Silahkan masuk untuk menikmati fiturnya",
                    fontFamily = rubikFont,
                    fontSize = 14.sp,
                    color = MaterialTheme.colorScheme.secondary,
                    modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(15.dp))
                CardLogin(modifier = Modifier.fillMaxWidth(), navHostController)
                Spacer(modifier = Modifier.height(15.dp))

                TextFooterClickableComponent(
                    modifier = Modifier
                        .clickable { navHostController.navigate(AuthScreen.ForgotPassword.route) },
                    text = "Lupa Password"
                )
                Spacer(modifier = Modifier.height(14.dp))
                TextFooterClickableComponent(
                    modifier = Modifier
                        .clickable { navHostController.navigate(AuthScreen.Register.route) },
                    text = "Register"
                )

            }
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun PreviewLoginScreen() {
    NavigationTheme {
        LoginScreen(navHostController = rememberNavController())
    }
}