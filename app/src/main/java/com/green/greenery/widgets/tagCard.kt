package com.green.greenery.widgets

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.green.greenery.ui.theme.BrokenWhite
import com.green.greenery.ui.theme.DarkGreen
import com.green.greenery.ui.theme.fontFamily

@Preview
@Composable
fun TagCard(tagName: String = "Indoor") {
    Card(
        shape = RoundedCornerShape(2.dp),
        colors = CardColors(
            contentColor = BrokenWhite,
            containerColor = DarkGreen,
            disabledContentColor = BrokenWhite,
            disabledContainerColor = BrokenWhite
        )
    ) {
        Text(
            tagName,
            maxLines = 1,
            fontFamily = fontFamily,
            fontSize = 8.sp,
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp)
        )
    }
}
