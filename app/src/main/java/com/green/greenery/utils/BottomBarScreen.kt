package com.green.greenery.utils

import androidx.compose.ui.graphics.vector.ImageVector
import compose.icons.TablerIcons
import compose.icons.tablericons.Heart
import compose.icons.tablericons.Home2
import compose.icons.tablericons.ShoppingCart
import compose.icons.tablericons.User

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home : BottomBarScreen(
        route = "HOME",
        title = "Home",
        icon = TablerIcons.Home2
    )

    object Fav : BottomBarScreen(
        route = "FAV",
        title = "Likes",
        icon = TablerIcons.Heart
    )

    object Cart : BottomBarScreen(
        route = "CART",
        title = "Cart",
        icon = TablerIcons.ShoppingCart
    )

    object Profile : BottomBarScreen(
        route = "PROFILE",
        title = "Profile",
        icon = TablerIcons.User
    )
}
