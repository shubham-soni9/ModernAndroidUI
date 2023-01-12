package com.modern.androidmodernui.effect_handler

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.produceState
import kotlinx.coroutines.delay

@Composable
fun produceStateDemo(countUpto: Int): State<Int> {
    return produceState(initialValue = 0) {
        if (value < countUpto) {
            delay(500)
            value++
        }
    }
}