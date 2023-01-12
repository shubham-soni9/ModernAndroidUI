package com.modern.androidmodernui.effect_handler

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color

@Composable
fun DerivedStateDemo() {
    var counter by remember {
        mutableStateOf(0)
    }

    val counterText by remember {
        derivedStateOf { "Current Value is $counter" }
    }

    Button(onClick = { counter++ }) {
        Text(text = counterText, color = Color.White)
    }

}