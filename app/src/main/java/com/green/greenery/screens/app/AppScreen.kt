package com.green.greenery.screens.app

import android.util.Log
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.PratikFagadiya.smoothanimationbottombar.model.SmoothAnimationBottomBarScreens
import com.PratikFagadiya.smoothanimationbottombar.properties.BottomBarProperties
import com.PratikFagadiya.smoothanimationbottombar.ui.SmoothAnimationBottomBar
import com.green.greenery.navigation.HomeNavGraph
import com.green.greenery.ui.theme.BrokenWhite
import com.green.greenery.ui.theme.DarkGreen
import com.green.greenery.ui.theme.PineGreen
import com.green.greenery.ui.theme.fontFamily
import com.green.greenery.utils.BottomBarScreen.Cart
import com.green.greenery.utils.BottomBarScreen.Fav
import com.green.greenery.utils.BottomBarScreen.Home
import com.green.greenery.utils.BottomBarScreen.Profile

@Preview
@Composable
fun ApplicationScreen(navController: NavHostController = rememberNavController()) {
    val currentIndex = rememberSaveable {
        mutableIntStateOf(0)
    }
    val bottomNavigationItems = listOf(
        SmoothAnimationBottomBarScreens(
            Home.route,
            Home.title,
            Home.icon
        ),
        SmoothAnimationBottomBarScreens(
            Fav.route,
            Fav.title,
            Fav.icon
        ),
        SmoothAnimationBottomBarScreens(
            Cart.route,
            Cart.title,
            Cart.icon
        ),
        SmoothAnimationBottomBarScreens(
            Profile.route,
            Profile.title,
            Profile.icon
        ),
    )

    Scaffold(
        bottomBar = {
            SmoothAnimationBottomBar(
                navController,
                bottomNavigationItems = bottomNavigationItems,
                initialIndex = currentIndex,
                bottomBarProperties = BottomBarProperties(
                    fontFamily = fontFamily,
                    backgroundColor = Color.Transparent,
                    indicatorColor = PineGreen.copy(0.2f),
                    textActiveColor = DarkGreen,
                    iconTintActiveColor = DarkGreen,
                    iconTintColor = BrokenWhite,
                    fontWeight = FontWeight.SemiBold
                ),
                onSelectItem = {
                    Log.i("SELECTED_ITEM", "onCreate: Selected Item ${it.name}")
                })
        }
    ) { innerPadding ->
        innerPadding
        HomeNavGraph(navController)
    }
}