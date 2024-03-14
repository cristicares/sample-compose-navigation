package com.cristikers.samples.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.cristikers.samples.navigation.ui.home.HomeScreen
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
fun SampleApp(){
    SampleTheme {
        HomeScreen()
    }
}
