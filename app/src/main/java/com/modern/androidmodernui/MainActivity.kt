package com.modern.androidmodernui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.modern.androidmodernui.ui.theme.AndroidModernUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidModernUITheme {
                // A surface container using the 'background' color from the theme
               LazyHomeScreen()
            }
        }
    }
}

@Composable
fun AddText(name: String) {
    Text(text = "$name!")
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    AndroidModernUITheme {
        AddText("Android")
    }
}