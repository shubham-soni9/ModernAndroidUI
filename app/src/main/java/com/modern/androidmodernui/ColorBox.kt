package com.modern.androidmodernui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlin.random.Random

@Composable
fun ColorScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        var color by remember { mutableStateOf(Color.Green) }
        ColorBox(color = color) {
            color = it
        }
    }
}

@Composable
fun ColorBox(color: Color, updateColor: (Color) -> Unit) {
    Column {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(color)
        )
        Button(onClick = {
            updateColor(
                Color(
                    red = Random.nextFloat(),
                    green = Random.nextFloat(),
                    blue = Random.nextFloat(),
                    alpha = 1f
                )
            )
        }) {
            Text(text = "Switch")
        }
    }
}