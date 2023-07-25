package com.example.testcompose.ui.composable


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.testcompose.R

@Composable
fun SeatsItem(rotateValue:Float, paddingTopValue: Dp=0.dp, firstSeatColor:Color=Color.White, secondSeatColor:Color=Color.White, seatContainerColor:Color=Color.Gray) {
    Box(modifier = Modifier.padding(top=paddingTopValue)) {
        Icon(
            painterResource(id = R.drawable.subtract),modifier = Modifier.rotate(rotateValue),
            contentDescription = null,
            tint = seatContainerColor
        )
        Row(modifier = Modifier.rotate(rotateValue), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Icon(
                painterResource(id = R.drawable.cinema_seat),
                modifier = Modifier.padding(start = 8.dp),
                contentDescription = null,
                tint = firstSeatColor
            )
            Icon(
                painterResource(id = R.drawable.cinema_seat),
                contentDescription = null,
                tint = secondSeatColor
            )

        }

    }
}

@Preview(showSystemUi = true)
@Composable
fun SeatsItemPreview() {
    SeatsItem(0f)
}