package com.example.testcompose.ui.composable


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testcompose.R
import com.example.testcompose.ui.screens.HomeScreen

@Composable

fun Characters(imageList: List<Int>) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(imageList) {
            Image(painterResource(id = it), modifier =Modifier.size(61.dp).clip(CircleShape), contentDescription =null)
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun HomePreview() {
    val imageList = listOf(
        R.drawable.image,
        R.drawable.rectangle,
        R.drawable.image,
        R.drawable.rectangle,
    )
    Characters(imageList)
}