package com.modern.androidmodernui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.tooling.preview.Preview
import com.modern.androidmodernui.effect_handler.SnapshotFlowDemo
import kotlinx.coroutines.launch

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun TextFieldWithSnackBar() {
    val scaffoldState = rememberScaffoldState()
    var textFieldState by remember { mutableStateOf("") }
    val scope = rememberCoroutineScope()
    val keyboardController = LocalSoftwareKeyboardController.current

    Scaffold(scaffoldState = scaffoldState) {
        SnapshotFlowDemo(scaffoldState)
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .background(Color.White),
            contentAlignment = Alignment.Center
        ) {
            Column() {
                TextField(
                    value = textFieldState,
                    onValueChange = {
                        textFieldState = it
                    },
                    label = { Text(text = "Enter Your Name") },
                    singleLine = true,
                    keyboardActions = KeyboardActions(onDone = {
                        keyboardController?.hide()
                    })
                )
                Button(modifier = Modifier.align(Alignment.End),
                    onClick = {
                        scope.launch {
                            scaffoldState.snackbarHostState.showSnackbar("Nice to meet you! $textFieldState")
                        }
                    }) {
                    Text(text = "Submit")
                }
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun TextFieldWithSnackBarPreview() {
    TextFieldWithSnackBar()
}