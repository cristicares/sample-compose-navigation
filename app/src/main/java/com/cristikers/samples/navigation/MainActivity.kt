package com.cristikers.samples.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cristikers.samples.navigation.ui.home.HomeScreen
import com.cristikers.samples.navigation.ui.pets.PetsScreen
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

            NavHost(
                navController = navController,
                startDestination = "home",
                modifier = Modifier.padding(innerPadding)
            ) {
                composable(route = "home") {
                    HomeScreen(
                        onButtonClick = { navController.navigate("pets") }
                    )
                }
                composable(route = "pets") {
                    PetsScreen()
                }
            }

        }
    }
}
