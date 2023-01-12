package com.modern.androidmodernui.effect_handler

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver

@Composable
fun DisposableEffectDemo() {
    val lifeCycleOwner = LocalLifecycleOwner.current

    DisposableEffect(key1 = lifeCycleOwner) {
        val observer = LifecycleEventObserver { _, event ->
            if (event == Lifecycle.Event.ON_PAUSE) {
                println("On Pause Called")
            }
            when (event) {
                Lifecycle.Event.ON_CREATE -> println("On Create Called")
                Lifecycle.Event.ON_START -> println("On Start Called")
                Lifecycle.Event.ON_RESUME -> println("On Resume Called")
                Lifecycle.Event.ON_PAUSE -> println("On Pause Called")
                Lifecycle.Event.ON_STOP -> println("On Stop Called")
                Lifecycle.Event.ON_DESTROY -> println("On Destroy Called")
                else -> println("Event Not Called")
            }
        }
        lifeCycleOwner.lifecycle.addObserver(observer)

        onDispose {
            println("On Dispose Called")
            lifeCycleOwner.lifecycle.removeObserver(observer)
        }
    }
}