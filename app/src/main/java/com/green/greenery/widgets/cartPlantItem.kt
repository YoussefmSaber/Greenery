package com.green.greenery.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.green.greenery.R
import com.green.greenery.ui.theme.BrokenWhite
import com.green.greenery.ui.theme.DarkGreen
import com.green.greenery.ui.theme.PineGreen
import compose.icons.TablerIcons
import compose.icons.tablericons.Minus
import compose.icons.tablericons.Plus

@Preview(showBackground = true)
@Composable
fun CartPlantItem() {
    Card(
        colors = CardColors(
            contentColor = Color.Transparent,
            containerColor = BrokenWhite,
            disabledContentColor = DarkGreen,
            disabledContainerColor = BrokenWhite
        ),
        modifier = Modifier.fillMaxWidth(0.9f)
    ) {
        ConstraintLayout(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()
        ) {
            val (image, content, addButton) = createRefs()
            Image(
                painter = painterResource(id = R.drawable.plant_temp),
                contentDescription = "plant image",
                modifier = Modifier
                    .constrainAs(image) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        bottom.linkTo(parent.bottom)
                    }
                    .size(width = 56.dp, height = 88.dp)
            )
            Column(
                modifier = Modifier
                    .constrainAs(content) {
                        top.linkTo(parent.top)
                        start.linkTo(image.end)
                        bottom.linkTo(parent.bottom)
                    }
                    .padding(start = 16.dp)
            ) {
                Text(text = "Snake Plants", color = PineGreen, fontSize = 20.sp)
                Box(Modifier.height(8.dp))
                Text(text = "$ 25.00", color = DarkGreen, fontSize = 16.sp)
            }
            Card(
                colors = CardColors(
                    contentColor = BrokenWhite,
                    containerColor = DarkGreen,
                    disabledContentColor = DarkGreen,
                    disabledContainerColor = PineGreen
                ),
                shape = RoundedCornerShape(6.dp),
                modifier = Modifier
                    .constrainAs(addButton) {
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                        end.linkTo(parent.end)
                    }
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(4.dp)
                ) {
                    IconButton(
                        onClick = {},
                        modifier = Modifier
                            .width(16.dp)
                            .height(16.dp)
                    ) {
                        Icon(
                            imageVector = TablerIcons.Minus,
                            contentDescription = "remove item"
                        )
                    }
                    Box(modifier = Modifier.width(8.dp))
                    Text(text = "1", fontSize = 16.sp)
                    Box(modifier = Modifier.width(8.dp))
                    IconButton(
                        onClick = {},
                        modifier = Modifier
                            .width(16.dp)
                            .height(16.dp)
                    ) {
                        Icon(
                            imageVector = TablerIcons.Plus,
                            contentDescription = "remove item"
                        )
                    }
                }
            }
        }
    }
}