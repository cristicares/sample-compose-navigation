package com.cristikers.samples.navigation.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.cristikers.samples.navigation.ui.detail.DetailScreen
import com.cristikers.samples.navigation.ui.home.HomeScreen
import com.cristikers.samples.navigation.ui.navigation.MainDestinations.ARGUMENT_DETAIL_ID
import com.cristikers.samples.navigation.ui.navigation.MainDestinations.detailScreen
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
            PetsScreen(
                onBackIconClick = { navController.popBackStack() }
            )
        }
        composable(route = "$detailScreen/{$ARGUMENT_DETAIL_ID}") {
            // val param = it.arguments?.getBoolean(ARGUMENT_BOOLEAN) ?: false
           DetailScreen(petId = ARGUMENT_DETAIL_ID)
        }
    }
}

object MainDestinations {
    const val homeScreen = "home"
    const val petsScreen = "pets"
    const val detailScreen = "detail"

    const val ARGUMENT_DETAIL_ID = "petId"
}