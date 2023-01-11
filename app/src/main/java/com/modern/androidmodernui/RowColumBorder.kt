package com.modern.androidmodernui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun RowColumBorder() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.5f)
            .background(Color.Green)
            .border(width = 5.dp, color = Color.Black)
            .padding(5.dp)
            .border(width = 7.dp, color = Color.Red)
            .padding(7.dp)
            .border(width = 10.dp, color = Color.Yellow)
            .padding(10.dp)
    ) {
        AddText(name = "Section One")
        Spacer(modifier = Modifier.height(50.dp))
        AddText(name = "Section Two")
    }

}