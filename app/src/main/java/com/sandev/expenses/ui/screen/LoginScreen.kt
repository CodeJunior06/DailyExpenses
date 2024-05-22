package com.sandev.expenses.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sandev.expenses.R
import com.sandev.expenses.ui.component.TextFieldExpense
import com.sandev.expenses.ui.theme.DailyExpensesTheme

@Composable
fun LoginScreen() {
    val email by remember {
        mutableStateOf("")
    }

    val password by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
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
        TextFieldExpense(label = "Email", value = email) {

        }

        TextFieldExpense(label = "Password", value = password) {

        }
    }

}

@Preview(showBackground = true, showSystemUi = true, device = Devices.NEXUS_5X)
@Composable
fun LoginPreview() {
    DailyExpensesTheme {
        LoginScreen()
    }
}