package com.example.testcompose.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testcompose.R
import com.example.testcompose.ui.composable.BluredImage
import com.example.testcompose.ui.composable.ButtonItem
import com.example.testcompose.ui.composable.Geners
import com.example.testcompose.ui.composable.MoviesPager
import com.example.testcompose.ui.composable.TextItem
import com.example.testcompose.ui.theme.Orange

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen() {
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
          Geners(modifier = Modifier.fillMaxWidth())

            }
        }
    }
}
@Composable
@Preview(showSystemUi = true)
fun HomePreview() {
    HomeScreen()
}