package com.modern.androidmodernui.effect_handler

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun RememberCoroutineDemo() {
    val scope = rememberCoroutineScope()

    Button(onClick = {
        scope.launch {
            delay(1000)
            println("Hello world by coroutine scope")
        }
    }) {
        Text(text = "Print Some Data")
    }
}
