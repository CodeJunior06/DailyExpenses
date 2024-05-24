package com.sandev.expenses.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextFieldExpense(
    label: String,
    value: String,
    isPassword: Boolean = false,
    imageVector: ImageVector,
    res: (String) -> Unit
) {

    Column(
        modifier = Modifier
    ) {
        Text(
            text = label, modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 5.dp),
            style = TextStyle(color = Color.White, fontWeight = FontWeight.W800)
        )
        OutlinedTextField(
            value = value,
            onValueChange = res,
            modifier = Modifier.fillMaxWidth(),
            textStyle = TextStyle(color = Color.Yellow, fontSize = 20.sp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Yellow,
                cursorColor = Color.Yellow
            ),
            singleLine = true,
            visualTransformation = if (isPassword) PasswordVisualTransformation() else VisualTransformation.None,
            leadingIcon = {Icon(imageVector = imageVector, contentDescription = "ic_email", tint = Color.White)}
        )
    }
}
