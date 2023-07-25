package com.example.testcompose.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testcompose.R


@Composable
fun SeatsRow() {
    Box(modifier = Modifier.fillMaxWidth()) {

        Row(modifier = Modifier.fillMaxWidth().padding(paddingValues = PaddingValues(horizontal = 16.dp, vertical = 8.dp)), horizontalArrangement = Arrangement.SpaceBetween) {
            SeatsItem(10f)
            SeatsItem(0f,8.dp)
            SeatsItem(-10f)

        }

    }
}

@Preview(showSystemUi = true)
@Composable
fun SeatsRowPreview() {
    SeatsRow()
}