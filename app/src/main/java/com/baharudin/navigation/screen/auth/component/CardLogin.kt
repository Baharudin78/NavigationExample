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
        colors = CardDefaults.cardColors()
    ) {
        var username by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 16.dp, end = 16.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            ElevatedButton(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 16.dp, end = 10.dp),
                onClick = { /*TODO*/ }) {
                Image(painter = painterResource(id = R.drawable.google), contentDescription = "")
                Text(text = "Google", modifier = Modifier.padding(start = 10.dp))
            }

            ElevatedButton(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 10.dp, end = 16.dp),
                onClick = { /*TODO*/ }) {
                Image(painter = painterResource(id = R.drawable.facebooks), contentDescription = "")
                Text(text = "Facebook", modifier = Modifier.padding(start = 10.dp))
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Transparent)
                .padding(16.dp)
        ) {
            OutlinedTextField(
                value = username,
                placeholder = { Text(text = "Username") },
                onValueChange = { username = it },
                shape = RoundedCornerShape(30.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp)
                    .background(color = Color.White)
            )

            Spacer(modifier = Modifier.height(12.dp))

            OutlinedTextField(
                value = password,
                placeholder = { Text(text = "Password") },
                onValueChange = { password = it },
                shape = RoundedCornerShape(30.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp)
                    .background(color = Color.White),
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )

            Spacer(modifier = Modifier.height(12.dp))

            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                shape = RoundedCornerShape(16.dp),
                onClick = {
                    navHostController.navigate(Graph.HOME)
                }) {
                Text(text = "Login", color = Color.White)
            }

        }
    }

}

@Composable
@Preview
fun CardLoginPreview() {
    CardLogin(navHostController = rememberNavController())
}