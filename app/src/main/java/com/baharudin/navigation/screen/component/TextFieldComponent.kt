package com.baharudin.navigation.screen.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun OutlinedTextFieldComponent(
    placeholders: String,
    values: String,
    onValueChanges: (String) -> Unit,
    modifier: Modifier = Modifier,
    keyboardOptions: KeyboardOptions,
    visualTransformation: PasswordVisualTransformation = PasswordVisualTransformation()
) {
    OutlinedTextField(
        value = values,
        onValueChange = onValueChanges,
        placeholder = { Text(text = placeholders) },
        shape = RoundedCornerShape(16.dp),
        colors = TextFieldDefaults.outlinedTextFieldColors(containerColor = Color.White),
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp),
        keyboardOptions = keyboardOptions,
        visualTransformation = visualTransformation
    )
}