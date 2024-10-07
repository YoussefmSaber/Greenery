package com.green.greenery.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.green.greenery.screens.app.home.ScreenContent
import com.green.greenery.utils.BottomBarScreen.Cart
import com.green.greenery.utils.BottomBarScreen.Fav
import com.green.greenery.utils.BottomBarScreen.Home
import com.green.greenery.utils.BottomBarScreen.Profile

@Composable
fun HomeNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.HOME,
        startDestination = Home.route
    ) {
        composable(route = Home.route) {
            ScreenContent(name = Home.route,
                onClick = {
                    navController.navigate(Graph.DETAILS)
                })
        }
        composable(route = Fav.route) {
            ScreenContent(name = Fav.route,
                onClick = {})
        }
        composable(route = Cart.route) {
            ScreenContent(name = Cart.route) { }
        }
        composable(route = Profile.route) {
            ScreenContent(name = Profile.route) { }
        }
    }
}