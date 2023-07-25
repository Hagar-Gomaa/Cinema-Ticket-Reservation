package com.example.testcompose.ui.screens

import CircleShapeExample
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testcompose.R
import com.example.testcompose.ui.composable.Characters
import com.example.testcompose.ui.composable.Geners
import com.example.testcompose.ui.composable.MovieRating
import com.example.testcompose.ui.composable.TextItem
import com.example.testcompose.ui.composable.TimeHeader
import com.example.testcompose.ui.theme.Orange

@Composable
fun MovieDetails() {
    val imageList = listOf(
        R.drawable.image,
        R.drawable.image,
        R.drawable.image,
        R.drawable.image,
        R.drawable.image,
        R.drawable.image,
        R.drawable.rectangle,
    )
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painterResource(id = R.drawable.image), modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(.46f), contentDescription = null, contentScale = ContentScale.Crop
        )
        Icon(
            painterResource(id = R.drawable.close_circled), modifier = Modifier
                .align(Alignment.TopStart)
                .padding(paddingValues = PaddingValues(16.dp, 32.dp))
                .clip(
                    CircleShape
                )
                .background(Color.White.copy(alpha = (.3f))),
            contentDescription = null
        )
        TimeHeader(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(paddingValues = PaddingValues(16.dp, 32.dp))
                .clip(
                    RoundedCornerShape(12.dp)
                )
                .background(Color.White.copy(alpha = (.3f)))
        )
        Box(
            modifier = Modifier.fillMaxWidth().fillMaxHeight(.43f)) {
            CircleShapeExample(  modifier = Modifier.size(53.dp).align(
                Alignment.Center))
            Icon(
                painterResource(id = R.drawable.play_button), modifier = Modifier.align(
                    Alignment.Center
                ), contentDescription = null
            )

        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(.6f)
                .align(Alignment.BottomCenter)
                .clip(
                    RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp)
                )
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 32.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                MovieRating("6.8", "/10", "IMDb")
                MovieRating("63%", null, "Rotten Tomatoes")
                MovieRating("4", "/10", "IGN")


            }
            TextItem(
                modifier = Modifier.padding(top = 16.dp),
                text = "Fantastic Beasts: The Secrets of Dumbledore",
                fontSize = 24.sp
            )
            Geners(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(PaddingValues(vertical = 24.dp))
            )
            Characters(imageList = imageList)
            TextItem(
                modifier = Modifier.padding(PaddingValues(vertical = 16.dp, horizontal = 16.dp)),
                text = "Professor Albus Dumbledore knows the powerful, dark wizard Gellert Grindelwald is moving to seize control of the wizarding world. Unable to stop him alone, he entrusts magizoologist Newt Scamander to lead an intrepid team of wizards and witches. They soon encounter an array of old and new beasts as they clash with Grindelwald's growing legion of followers.",
                fontSize = 12.sp
            )
//            ButtonItem(text = "Booking", color = Orange, borderColor = Orange )
            Button(
                onClick = {},
                modifier = Modifier
                    .width(147.dp)
                    .align(Alignment.CenterHorizontally),
                colors = ButtonDefaults.buttonColors(Orange)
            ) {
                Icon(painterResource(id = R.drawable.card), contentDescription = null)
                TextItem(
                    modifier = Modifier.padding(start = 8.dp),
                    text = "Booking",
                    fontSize = 16.sp
                )
            }

        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun MovieDetailsPreview() {
    MovieDetails()
}