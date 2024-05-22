package com.sandev.expenses

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.LottieComposition
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.sandev.expenses.ui.theme.DailyExpensesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DailyExpensesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SplashLottieAnimation(
                        modifier = Modifier.padding(innerPadding)
                    )
                    /*Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )*/
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
            .background(color = Color.Cyan)
            .padding(16.dp)
    )
}

@Composable
fun SplashLottieAnimation(modifier: Modifier = Modifier){
    val composition by rememberLottieComposition(spec = LottieCompositionSpec.Asset("anim1.json"))
    val progress by animateLottieCompositionAsState(composition = composition)

    LottieAnimation(
        composition,
        iterations =  5,
        modifier = modifier.fillMaxSize()
    )
}

@Preview(showBackground = true, showSystemUi = true, device = Devices.NEXUS_7)
@Composable
fun GreetingPreview() {
    DailyExpensesTheme {
        SplashLottieAnimation()
        /*Greeting("Santi")*/
    }
}