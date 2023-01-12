package com.modern.androidmodernui.effect_handler

import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect

@Composable
fun SideEffectDemo() {
    SideEffect {
        println("Called after every successfull recomposition")
    }
}