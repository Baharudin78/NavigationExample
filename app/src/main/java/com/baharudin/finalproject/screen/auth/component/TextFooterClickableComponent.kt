package com.baharudin.finalproject.screen.auth.component

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

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