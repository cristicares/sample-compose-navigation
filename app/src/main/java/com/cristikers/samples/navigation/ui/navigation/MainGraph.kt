package com.cristikers.samples.navigation.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.cristikers.samples.navigation.ui.home.HomeScreen
import com.cristikers.samples.navigation.ui.navigation.MainDestinations.homeScreen
import com.cristikers.samples.navigation.ui.navigation.MainDestinations.petsScreen
import com.cristikers.samples.navigation.ui.pets.PetsScreen

const val MAIN_GRAPH = "main_graph"

fun NavGraphBuilder.mainGraph(
    navController: NavHostController
) {
    navigation(
        route = MAIN_GRAPH,
        startDestination = homeScreen
    ) {
        composable(route = homeScreen) {
            HomeScreen(
                onButtonClick = { navController.navigate(petsScreen) }
            )
        }
        composable(route = petsScreen) {
            PetsScreen()
        }
    }
}

object MainDestinations {
    const val homeScreen = "home"
    const val petsScreen = "pets"
}