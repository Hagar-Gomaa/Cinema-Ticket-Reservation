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

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun setHeader() {
    val imageList = listOf(
        R.drawable.image,
        R.drawable.rectangle,
        R.drawable.image,
        R.drawable.rectangle,
    )

    val pagerState = rememberPagerState(initialPage = 1) { imageList.size }

    Column() {
        Box(modifier = Modifier.fillMaxWidth()) {
            BluredImage(imageList[1])
            Column(modifier = Modifier) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 48.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    ButtonItem(text = "Now Showing", color = Orange, borderColor =  Orange)
                    Spacer(
                        modifier = Modifier
                            .width(8.dp)
                    )
                    ButtonItem(text = "Coming Soon",color =  Color.Transparent,borderColor = Color.White.copy(alpha = .3f))
                }

               MoviesPager(imageList = imageList, pagerState = pagerState)
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 32.dp), verticalAlignment = Alignment.CenterVertically,horizontalArrangement = Arrangement.Center) {
                    Image(
                        painterResource(id = R.drawable.ic_access_time),
                        contentDescription = null
                    )
                    TextItem(text = "2h 23m", fontSize = 12.sp)
                }
                TextItem(modifier = Modifier.padding(top = 16.dp, bottom = 24.dp),text = "Fantastic Beasts: The Secrets of Dumbledore", fontSize = 24.sp)
                Row(
                    modifier = Modifier.fillMaxWidth().padding(all = 8.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(onClick = {}, modifier = Modifier
                        .height(29.dp)
                        , colors = ButtonDefaults.buttonColors(Color.Transparent), border =  BorderStroke( 1.dp,Color.Black.copy(alpha = .2f))){
                        Text(modifier = Modifier, fontSize = 12.sp, text = "Fantasy", color = Color.Black )
                    }

                    Button(onClick = {}, modifier = Modifier
                        .height(29.dp)
                        , colors = ButtonDefaults.buttonColors(Color.Transparent), border =  BorderStroke( 1.dp,Color.Black.copy(alpha = .2f))){
                        Text(modifier = Modifier, fontSize = 12.sp, text = "Adventure", color = Color.Black )
                    }                }
            }
        }
    }
}


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

@Composable
@Preview(showSystemUi = true)
fun Preview() {
    setHeader()
}