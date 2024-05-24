package com.sandev.expenses

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.sandev.expenses.ui.navigation.NavigationHost
import com.sandev.expenses.ui.theme.DailyExpensesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.dark(android.graphics.Color.BLACK)
        )

        setContent {
            DailyExpensesTheme {
                Scaffold(modifier = Modifier.fillMaxSize(), contentWindowInsets = WindowInsets.safeDrawing) { innerPadding ->
                    print(innerPadding)

                    // Show or hide the status bar based on the state
                    NavigationHost()
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true, device = Devices.NEXUS_7)
@Composable
fun GreetingPreview() {
    DailyExpensesTheme {

    }
}