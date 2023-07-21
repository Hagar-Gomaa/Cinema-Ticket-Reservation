package com.example.testcompose.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun MoviesViewPager(imageList: List<Int>, currentPage: Int) {
    HorizontalPager(
        modifier = Modifier.fillMaxWidth().height(
            398.dp).padding(top = 34.dp, start = 50.dp, end = 50.dp),count = imageList.size,
        state = rememberPagerState(initialPage = currentPage)
    ) { page ->
        HorizontalPagerItem(page = page, imageRes = imageList[page])
    }
}

@Composable
fun HorizontalPagerItem(page: Int, imageRes: Int) {
    Surface(modifier = Modifier,
        color = Color.Transparent
    ) {
        Image(
            painterResource(imageRes),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp).clip(RoundedCornerShape(34.dp))
                .graphicsLayer(
                translationX = .13f,
        clip = false
        )
           , contentScale = ContentScale.Crop
        )
    }
}

//@Preview
//@Composable
//fun ViewPagerPreview() {
//    val imageList = listOf(
//        R.drawable.ic_launcher_background,
//        R.drawable.ic_launcher_foreground,
//        R.drawable.ic_launcher_background,
//        R.drawable.ic_launcher_background,
//        // Add more image resource IDs as needed
//    )
//
//    val currentPage by remember { mutableStateOf(0) }
//
//    MoviesViewPager(imageList, currentPage)
//}