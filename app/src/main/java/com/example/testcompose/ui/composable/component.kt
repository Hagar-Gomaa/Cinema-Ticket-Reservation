package com.example.testcompose.ui.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testcompose.R
import com.example.testcompose.ui.theme.Orange
import com.example.testcompose.ui.theme.c1
import com.example.testcompose.ui.theme.c2

@Composable
fun setHeader() {
    Column() {
        Box(modifier = Modifier.fillMaxWidth()) {
               Column(modifier = Modifier) {

               }
                GradientCanvas()
            Column(modifier = Modifier) {
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        , horizontalArrangement = Arrangement.Center
                ) {
                    ButtonItem("Now Showing", Orange, Orange)
                    Spacer(
                        modifier = Modifier
                            .fillMaxHeight()
                            .width(8.dp)
                    )
                    ButtonItem("Coming Soon", Color.Transparent, Color.White.copy(alpha = .3f))
                }
            }
            }
    }

}

@Composable
fun ButtonItem(text: String, color: Color,borderColor:Color) {
    Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(color), border = BorderStroke(1.dp,borderColor))
    {
        Text(text = text, fontSize = 16.sp,fontFamily = FontFamily(Font(R.font.kumbh_sans)) )
    }
}

@Composable
fun GradientCanvas(
    height: Dp = 293.dp
) {
    Box(
        modifier = Modifier
            .height(height)
            .fillMaxWidth()
    ) {
        Canvas(modifier = Modifier.fillMaxSize())
          {
            val gradient = Brush.horizontalGradient(
                colors = listOf(c1, c2),
                startX = 0f,
                endX = size.width
            )
            drawRect(brush = gradient)
        }
    }

}