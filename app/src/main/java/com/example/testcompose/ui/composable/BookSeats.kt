package com.example.testcompose.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BookSeats() {
    Column() {
        SeatsRow()
        SeatsRow()
        SeatsRow()
        SeatsRow()
        SeatsRow()
    }
}

@Preview(showSystemUi = true)
@Composable
fun BookSeatsPreview() {
    BookSeats()
}