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

@Composable
fun TextFooterClickableComponent(
    text: String,
    modifier: Modifier = Modifier,
) {

    Text(
        text = text,
        fontSize = 18.sp,
        style = TextStyle(color = MaterialTheme.colorScheme.primary),
        modifier = modifier
        )
}

@Composable
@Preview
fun TextRegisterComponentPreview() {
    TextFooterClickableComponent(text = "text")
}