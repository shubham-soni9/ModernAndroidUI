package com.modern.androidmodernui.effect_handler

import androidx.compose.runtime.*
import kotlinx.coroutines.delay

@Composable
fun RememberUpdatedStateDemo(onTimeout: () -> Unit) {
    val updatedTimeoutState by rememberUpdatedState(newValue = onTimeout)
    LaunchedEffect(key1 = true) {
        delay(3000L)
        updatedTimeoutState()
    }
}