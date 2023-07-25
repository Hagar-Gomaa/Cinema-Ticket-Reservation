package com.example.testcompose.ui.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Geners(modifier: Modifier=Modifier){
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center
    ) {
        Button(onClick = {}, modifier = Modifier
            .height(29.dp).padding(end = 4.dp)
            , colors = ButtonDefaults.buttonColors(Color.Transparent), border =  BorderStroke( 1.dp,
                Color.Black.copy(alpha = .2f))
        ){
            Text(modifier = Modifier, fontSize = 12.sp, text = "Fantasy", color = Color.Black )
        }
        Button(onClick = {}, modifier = Modifier
            .height(29.dp)
            , colors = ButtonDefaults.buttonColors(Color.Transparent), border =  BorderStroke( 1.dp,
                Color.Black.copy(alpha = .2f))
        ){
            Text(modifier = Modifier, fontSize = 12.sp, text = "Adventure", color = Color.Black )
        }                }


}