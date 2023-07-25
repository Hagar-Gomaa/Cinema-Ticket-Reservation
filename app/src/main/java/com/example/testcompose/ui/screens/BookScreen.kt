package com.example.testcompose.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testcompose.R
import com.example.testcompose.ui.composable.BookSeats


@Composable
fun BookScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Icon(
            painterResource(id = R.drawable.close_circled), modifier = Modifier
                .padding(top = 32.dp, start = 16.dp)
                .clip(
                    CircleShape
                )
                .background(Color.White.copy(alpha = (.3f))),
            contentDescription = null
        )
        Image(
            painterResource(id = R.drawable.book_screen_image),
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(.18f)
                .padding(bottom = 8.dp),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        BookSeats()
        Image(
            painterResource(id = R.drawable.tickets_types),
            modifier = Modifier
                .fillMaxWidth()
                .padding(PaddingValues(horizontal = 32.dp, vertical = 16.dp)),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Card(modifier = Modifier.fillMaxSize() .clip(
            RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp)
        ),) {

            
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun BookScreenPreview() {
    BookScreen()
}