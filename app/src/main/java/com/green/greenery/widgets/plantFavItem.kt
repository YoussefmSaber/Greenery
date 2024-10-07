package com.green.greenery.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.green.greenery.R
import com.green.greenery.ui.theme.BrokenWhite
import com.green.greenery.ui.theme.DarkGreen
import com.green.greenery.ui.theme.PineGreen
import com.green.greenery.ui.theme.fontFamily

@Preview(showBackground = true)
@Composable
fun PlantFavItem() {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardColors(
            contentColor = Color.Transparent,
            containerColor = BrokenWhite,
            disabledContentColor = DarkGreen,
            disabledContainerColor = BrokenWhite
        ),
    ) {
        ConstraintLayout(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            val (image, content, fav) = createRefs()

            Image(
                painter = painterResource(id = R.drawable.plant_temp),
                contentDescription = "plant image",
                modifier = Modifier
                    .constrainAs(image) {
                        start.linkTo(parent.start)
                        top.linkTo(parent.top)
                    }
                    .size(width = 64.dp, height = 124.dp)
            )

            Column(modifier = Modifier
                .constrainAs(content) {
                    start.linkTo(image.end, margin = 8.dp)
                    top.linkTo(parent.top)
                    end.linkTo(fav.start, margin = 8.dp)
                    width = Dimension.fillToConstraints
                }) {
                Box(modifier = Modifier.height(4.dp))
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Snake Plants",
                        color = DarkGreen,
                        fontSize = 16.sp,
                        fontFamily = fontFamily,
                        fontWeight = FontWeight.SemiBold
                    )
                    Text(
                        text = "$ 25.00",
                        color = DarkGreen,
                        fontSize = 16.sp,
                        fontFamily = fontFamily,
                        fontWeight = FontWeight.Bold
                    )
                }
                Box(modifier = Modifier.height(8.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    TagCard("Spathiphyllum")
                    Box(modifier = Modifier.width(4.dp))
                    TagCard("Indoor")
                }
                Box(modifier = Modifier.height(4.dp))
                RateWidget()
                Box(modifier = Modifier.height(4.dp))

                Text(
                    // Description of the plant
                    "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's ed it to make a type specimen book. ",
                    color = PineGreen,
                    fontSize = 12.sp,
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Normal,
                    maxLines = 4,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Justify
                )
            }
            IconButton(onClick = {}, modifier = Modifier
                .constrainAs(fav) {
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                }
                .size(24.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.filled_fav),
                    contentDescription = "favorite icon",
                )
            }

        }
    }
}