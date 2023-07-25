package com.example.testcompose.ui.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testcompose.R
import com.example.testcompose.ui.theme.Orange
import com.example.testcompose.ui.theme.c1
import com.example.testcompose.ui.theme.c2



@Composable
fun ButtonItem(modifier: Modifier = Modifier,text: String, color: Color, borderColor: Color) {
    Button(
        modifier =modifier ,
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(color),
        border = BorderStroke(1.dp, borderColor)
    )
    {
        TextItem(text = text, fontSize = 16.sp)
    }
}

@Composable
fun TextItem(modifier: Modifier = Modifier, text: String, fontSize: TextUnit) {
    Text(
        modifier = modifier,
        text = text,
        textAlign = TextAlign.Center,
        fontSize = fontSize,
        fontFamily = FontFamily(Font(R.font.kumbh_sans))
    )
}

@Composable
fun BluredImage(imageBlur: Int) {
    Image(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.50f)
        .blur(40.dp),
        contentScale = ContentScale.Crop,
        painter = painterResource(imageBlur),
        contentDescription = ""
    )
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.50f)
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color.Transparent, Color.Transparent, Color.White
                    )
                )
            )
    )
}

