package com.baharudin.finalproject.screen.auth.forgot_password

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.baharudin.finalproject.graph.AuthScreen
import com.baharudin.finalproject.screen.component.ButtonComponent
import com.baharudin.finalproject.screen.component.LinearGradient
import com.baharudin.finalproject.ui.theme.GreenPrimary
import com.baharudin.finalproject.ui.theme.GreyLight
import com.baharudin.finalproject.ui.theme.rubikFont
import com.composeuisuite.ohteepee.OhTeePeeInput
import com.composeuisuite.ohteepee.configuration.OhTeePeeCellConfiguration
import com.composeuisuite.ohteepee.configuration.OhTeePeeConfigurations

@Composable
fun KodeOTPScreen(
    navHostController: NavHostController
){
    var otpValue by remember { mutableStateOf("") }
    Box(modifier = Modifier.fillMaxSize()){
        LinearGradient(modifier = Modifier.fillMaxSize())
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Spacer(modifier = Modifier.height(100.dp))
            Text(
                text = "Masukkan 4 Digit Kode",
                fontFamily = rubikFont,
                fontSize = 20.sp,
                color = MaterialTheme.colorScheme.secondary,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = 16.dp, start = 16.dp)
            )

            Text(
                text = "Masukkan 4 digit kode yang dikirim yang dikirim ke email",
                fontFamily = rubikFont,
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.secondary,
                modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(50.dp))

            val defaultCellConfig = OhTeePeeCellConfiguration.withDefaults(
                borderColor = GreyLight,
                borderWidth = 1.dp,
                shape = RoundedCornerShape(16.dp),
                textStyle = TextStyle(
                    color = GreenPrimary
                )
            )

            val activeCellConfig = OhTeePeeCellConfiguration.withDefaults(
                borderColor = GreenPrimary,
                borderWidth = 1.dp,
                shape = RoundedCornerShape(16.dp),
                textStyle = TextStyle(
                    color = GreenPrimary
                )
            )

            OhTeePeeInput(
                modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                value = otpValue,
                onValueChange = { newValue, isValid ->
                    otpValue = newValue
                },
                configurations = OhTeePeeConfigurations.withDefaults(
                    cellsCount = 4,
                    emptyCellConfig = defaultCellConfig,
                    activeCellConfig = activeCellConfig,
                    cellModifier = Modifier
                        .padding(horizontal = 4.dp)
                        .size(48.dp),
                ),
            )

            Spacer(modifier = Modifier.height(20.dp))
            ButtonComponent(onClick = {
                navHostController.navigate(AuthScreen.ResetPassword.route)
            }, text = "Selanjutnya")

        }
    }
}