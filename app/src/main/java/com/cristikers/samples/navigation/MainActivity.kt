package com.cristikers.samples.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.cristikers.samples.navigation.ui.navigation.SampleNavHost
import com.cristikers.samples.navigation.ui.theme.SampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SampleApp()
        }
    }
}

@Composable
fun SampleApp() {
    SampleTheme {
        val navController = rememberNavController()

        Scaffold(
            topBar = { },
            bottomBar = { },
            modifier = Modifier.padding(10.dp)
        ) { innerPadding ->

            SampleNavHost(
                navController = navController,
                modifier = Modifier.padding(innerPadding)
            )

        }
    }
}
