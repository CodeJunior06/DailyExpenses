package com.sandev.expenses.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sandev.expenses.R
import com.sandev.expenses.ui.component.TextFieldExpense
import com.sandev.expenses.ui.theme.DailyExpensesTheme

@Composable
fun LoginScreen() {
    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black), verticalArrangement = Arrangement.Center
    ) {
        Image(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .padding(5.dp)
                .height(150.dp),
            painter = painterResource(id = R.drawable.logo_black),
            contentDescription = "Logo"
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 60.dp), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TextFieldExpense(label = "Email", imageVector =  Icons.Outlined.Email ,value = email) {
                email = it
            }

            TextFieldExpense(label = "Password", isPassword = true, imageVector = Icons.Outlined.Lock,value = password) {
                password = it
            }

            DivideAndOr()

            Redes()
        }

    }

}

@Composable
fun Redes() {
    Row (modifier = Modifier){
        Image(painter = painterResource(id = R.drawable.ic_facebook), contentDescription = "ic_facebook", modifier = Modifier.size(30.dp).weight(1F).align(Alignment.CenterVertically) )
        Image(painter = painterResource(id = R.drawable.ic_gmail), contentDescription = "ic_gmail", modifier = Modifier.size(30.dp).weight(1F) , contentScale = ContentScale.Fit)

    }
}

@Composable
fun DivideAndOr() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 10.dp)) {
        Divider(modifier = Modifier
            .fillMaxWidth()
            .weight(0.4F)
            .align(Alignment.CenterVertically), thickness = 2.dp
        )
        Text(
            text = "Or",
            style = TextStyle(color = Color.White, fontSize = 15.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.W500),
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.2F),
        )
        Divider(modifier = Modifier
            .fillMaxWidth()
            .weight(0.4F)
            .align(Alignment.CenterVertically), thickness = 2.dp
        )
    }
}


@Preview(showBackground = true, showSystemUi = true, device = Devices.NEXUS_5X)
@Composable
fun LoginPreview() {
    DailyExpensesTheme {
        LoginScreen()
    }
}