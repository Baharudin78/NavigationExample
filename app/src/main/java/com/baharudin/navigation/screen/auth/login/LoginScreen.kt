package com.baharudin.navigation.screen.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.ModifierLocal
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
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
import com.baharudin.navigation.ui.theme.NavigationTheme
import com.baharudin.navigation.R
import com.baharudin.navigation.graph.Graph
import com.baharudin.navigation.screen.auth.component.CardLogin
import com.baharudin.navigation.screen.auth.component.TextRegisterComponent
import java.util.Stack

@Composable
fun LoginScreen(
    navHostController: NavHostController,
) {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.white))
    ) {
        val column = createRef()
        Column(
            modifier = Modifier
                .fillMaxSize()
                .constrainAs(column) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    end.linkTo(parent.end)
                    start.linkTo(parent.start)
                }
                .background(color = Color.White),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Selamat Datang",
                fontFamily = FontFamily.Default,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = 40.dp)
            )
            Text(
                text = "Silahkan masuk untuk menikmati fiturnya",
                fontFamily = FontFamily.Default,
                fontSize = 20.sp,
                modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(30.dp))

            CardLogin(modifier = Modifier.fillMaxWidth(), navHostController)
            Spacer(modifier = Modifier.height(30.dp))
            TextRegisterComponent(modifier = Modifier.fillMaxWidth(), navHostController)
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