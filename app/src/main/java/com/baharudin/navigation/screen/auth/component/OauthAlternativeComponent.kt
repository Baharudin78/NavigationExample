package com.baharudin.navigation.screen.auth.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.baharudin.navigation.R

@Composable
fun OauthAlternativeComponent(
    modifier: Modifier = Modifier,
){
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 16.dp, start = 16.dp, end = 16.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        ElevatedButton(
            modifier = Modifier
                .weight(1f)
                .padding(start = 16.dp, end = 10.dp),
            onClick = { }) {
            Image(painter = painterResource(id = R.drawable.google), contentDescription = "")
            Text(text = "Google", modifier = Modifier.padding(start = 10.dp))
        }

        ElevatedButton(
            modifier = Modifier
                .weight(1f)
                .padding(start = 10.dp, end = 16.dp),
            onClick = { }) {
            Image(painter = painterResource(id = R.drawable.facebooks), contentDescription = "")
            Text(text = "Facebook", modifier = Modifier.padding(start = 10.dp))
        }
    }
}