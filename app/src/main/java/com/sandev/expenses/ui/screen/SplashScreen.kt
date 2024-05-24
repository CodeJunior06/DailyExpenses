package com.sandev.expenses.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.sandev.expenses.ui.theme.DailyExpensesTheme

@Composable
fun SplashScreen(finish: () -> Unit){
    val composition by rememberLottieComposition(spec = LottieCompositionSpec.Asset("anim1.json"))
    val progress by animateLottieCompositionAsState(composition = composition)
    Column( modifier = Modifier.fillMaxSize()) {
        LottieAnimation(
            composition,
            iterations =  5,
        )
    }
}

@Preview(showBackground = true, showSystemUi = true, device = Devices.NEXUS_7)
@Composable
fun SplashPreview() {
    DailyExpensesTheme {
        SplashScreen {

        }
    }
}