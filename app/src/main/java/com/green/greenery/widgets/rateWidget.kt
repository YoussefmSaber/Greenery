package com.green.greenery.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.green.greenery.ui.theme.DarkGreen
import com.green.greenery.ui.theme.Grey
import com.green.greenery.ui.theme.fontFamily

@Composable
fun RateWidget() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = Icons.Rounded.Star,
            contentDescription = "Rate Icon",
            tint = Color(0xFFF88E24),
            modifier = Modifier.width(16.dp)
        )
        Text(
            "4.5", fontSize = 10.sp, color = DarkGreen,
            fontFamily = fontFamily,
            fontWeight = FontWeight.SemiBold
        )
        Box(modifier = Modifier.width(4.dp))
        Text(
            "(100 reviews)", fontSize = 10.sp, color = Grey,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Normal
        )
    }
}