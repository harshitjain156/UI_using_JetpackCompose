package com.example.ui_using_jetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Design() {
    Column(modifier = Modifier
        .fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.banner),
            contentDescription = "Banner",
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = "Score",
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 20.dp, 0.dp, 0.dp),
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "0/4",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .absolutePadding(30.dp, 140.dp, 30.dp, 1.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "You choose", fontSize = 16.sp)
            Text(text = "Android choose", fontSize = 16.sp)
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .absolutePadding(35.dp, 1.dp, 40.dp, 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Rock", fontSize = 32.sp, fontWeight = FontWeight.Bold)
            Text(text = "Paper", fontSize = 32.sp, fontWeight = FontWeight.Bold)
        }

        Row(modifier = Modifier.fillMaxWidth().padding(10.dp,100.dp,10.dp,20.dp), horizontalArrangement = Arrangement.SpaceBetween) {
            Button(onClick = {}, contentPadding = PaddingValues(40.dp), shape = RoundedCornerShape(10)
            ) {
                Text(text = "Rock")
            }
            Button(onClick = {}, contentPadding = PaddingValues(40.dp), shape = RoundedCornerShape(10)
            ) {
                Text(text = "Paper")
            }
            Button(onClick = {}, contentPadding = PaddingValues(30.dp,40.dp), shape = RoundedCornerShape(10)
            ) {
                Text(text = "Scissors")
            }
        }
        Text(
            text = "#Jetpack Compose",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            textAlign = TextAlign.Center,
        )

    }

}