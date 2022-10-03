package com.example.ui_using_jetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui_using_jetpackcompose.ui.theme.UI_using_JetpackComposeTheme

@Composable
fun LoginPage(
    modifier: Modifier = Modifier
) {
    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        Box(
            modifier = Modifier
                .padding(20.dp)
        ) {
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .size(50.dp)
            ) {
                Icon(
                    imageVector = Icons.Outlined.ArrowBack,
                    contentDescription = stringResource(R.string.go_back),
                    modifier = Modifier
                        .size(30.dp)
                )
            }
        }

        Box(
            modifier = Modifier
                .padding(vertical = 40.dp)
                .fillMaxWidth()
        ) {
            // "https://www.freepik.com/free-vector/mobile-login-concept-illustration_4957412.htm#query=login&from_query=logins&position=0&from_view=search"
            // Image by storyset on Freepik
            Image(
                painter = painterResource(id = R.drawable.mobile_login_cristina),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.Center)
                    .size(300.dp)
            )
        }
        
        Text(
            text = "Welcome back!",
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.Bold,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(horizontal = 30.dp)
        )

        Text(
            text = "Log in to your account",
            fontWeight = FontWeight.Normal,
            fontSize = 20.sp,
            color = Color.Gray,
            modifier = Modifier
                .padding(
                    start = 36.dp,
                    top = 4.dp,
                    bottom = 20.dp
                )
        )

        EditTextField(
            value = email,
            onValueChange = { email = it },
            label = "Email address",
            isPassword = false
        )

        EditTextField(
            value = password,
            onValueChange = { password = it },
            label = "Password",
            isPassword = true
        )

        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFF30b394),
                contentColor = Color.White
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 30.dp,
                    vertical = 40.dp
                )
        ) {
            Text(
                text = stringResource(R.string.login),
                fontSize = 20.sp
            )
        }

    }
}

@Composable
fun EditTextField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    isPassword: Boolean
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = {
            Text(text = label)
        },
        singleLine = true,
        visualTransformation = if (!isPassword) VisualTransformation.None
            else PasswordVisualTransformation(),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp, vertical = 4.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun LoginPagePreview() {
    UI_using_JetpackComposeTheme {
        LoginPage()
    }
}