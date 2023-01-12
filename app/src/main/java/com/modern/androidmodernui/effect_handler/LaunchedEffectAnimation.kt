package com.modern.androidmodernui.effect_handler

import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.random.Random

@Composable
fun LaunchedEffectAnimation() {
    var counter by remember {
        mutableStateOf(0)
    }

    val count by animateIntAsState(targetValue = counter)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = count.toString(), color = Color.White, fontSize = 50.sp)
            Spacer(modifier = Modifier.size(25.dp))
            Button(onClick = { counter = Random.nextInt(100) }) {
                Text(text = "Change Value")
            }
            RememberCoroutineDemo()
        }
    }
}

