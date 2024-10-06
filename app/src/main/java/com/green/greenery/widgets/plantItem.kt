package com.green.greenery.widgets

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.scale
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.LayoutModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.green.greenery.R
import com.green.greenery.ui.theme.BrokenWhite
import com.green.greenery.ui.theme.DarkGreen
import com.green.greenery.ui.theme.Grey
import com.green.greenery.ui.theme.PurpleGrey40
import com.green.greenery.ui.theme.PurpleGrey80

@Preview(showBackground = true)
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
                    Text(text = "Snake Plants", color = DarkGreen)
                    Box(modifier = Modifier.height(4.dp))
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
                        Text("4.5", fontSize = 10.sp, color = DarkGreen)
                        Box(modifier = Modifier.width(4.dp))
                        Text("(100 reviews)", fontSize = 10.sp, color = Grey)
                    }
                    Box(modifier = Modifier.height(8.dp))
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()

                    ) {
                        Text("$ 25.00", fontSize = 16.sp, color = DarkGreen)
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