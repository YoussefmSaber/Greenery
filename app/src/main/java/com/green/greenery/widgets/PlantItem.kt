package com.green.greenery.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.green.greenery.R
import com.green.greenery.ui.theme.BrokenWhite
import com.green.greenery.ui.theme.DarkGreen
import com.green.greenery.ui.theme.fontFamily

@Composable
fun PlantCard() {
    Card(
        colors = CardColors(
            containerColor = Color(0xBFF8F7F3),
            contentColor = Color.White,
            disabledContentColor = Color.White,
            disabledContainerColor = Color.Black
        )
    ) {
        ConstraintLayout(
            modifier = Modifier
                .width(150.dp)
        ) {
            val (fav, image, content) = createRefs()
            Icon(
                imageVector = Icons.Default.FavoriteBorder,
                contentDescription = "favorite icon",
                modifier = Modifier
                    .constrainAs(fav) {
                        top.linkTo(parent.top)
                        end.linkTo(parent.end)
                    }
                    .width(30.dp)
                    .padding(8.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.plant_temp),
                contentDescription = "plant image",

                modifier = Modifier
                    .constrainAs(image) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
                    .padding(16.dp)
                    .scale(1.7f)
            )
            Card(
                colors = CardColors(
                    contentColor = Color.Black,
                    containerColor = Color.White,
                    disabledContentColor = Color.White,
                    disabledContainerColor = Color.Black
                ),
                modifier = Modifier
                    .constrainAs(content) {
                        top.linkTo(image.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
                    .fillMaxWidth()
            ) {
                Column(Modifier.padding(8.dp)) {
                    Text(
                        text = "Snake Plants",
                        color = DarkGreen,
                        fontFamily = fontFamily,
                        fontWeight = FontWeight.SemiBold
                    )
                    Box(modifier = Modifier.height(4.dp))
                    RateWidget()
                    Box(modifier = Modifier.height(8.dp))
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()

                    ) {
                        Text(
                            "$ 25.00", fontSize = 16.sp, color = DarkGreen,
                            fontFamily = fontFamily,
                            fontWeight = FontWeight.Bold
                        )
                        Card(
                            shape = RoundedCornerShape(8.dp),
                            colors = CardColors(
                                contentColor = Color.Black,
                                containerColor = DarkGreen,
                                disabledContentColor = Color.White,
                                disabledContainerColor = Color.Black
                            ),
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.Add,
                                tint = BrokenWhite,
                                contentDescription = "add icon"
                            )
                        }
                    }
                }
            }
        }
    }
}