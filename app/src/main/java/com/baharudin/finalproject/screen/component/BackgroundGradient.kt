package com.baharudin.finalproject.screen.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.*
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BackgroundGradient() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(

                )
            )
    )

}

@Stable
fun cornerGradient(
    colors: List<Color>,
    startX: Float = 0f,
    endX: Float = 0f,
    tileMode: TileMode = TileMode.Clamp
): Brush {
    return Brush.verticalGradient(
        colors = colors,
        startY = startX,
        endY = endX,
        tileMode = tileMode
    )
}

@Composable
fun LinearGradient(modifier: Modifier = Modifier) {
    val linearGradient = Brush.linearGradient(
        colors = listOf(
            Color.Green.copy(alpha = 0.5f),
            Color.White,
            Color.White,
            Color.White,
            Color.White,
            Color.White,
            Color.Blue.copy(alpha = 0.5f)
        ),
        start = Offset.Zero,
        end = Offset.Infinite
    )
    Box(
        modifier = modifier
            .background(linearGradient)
            .fillMaxSize()
    )
}


@Composable
@Preview
fun LinearGradientPreview() {
    LinearGradient()
}