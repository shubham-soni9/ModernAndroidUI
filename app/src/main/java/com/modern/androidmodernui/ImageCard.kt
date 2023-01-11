package com.modern.androidmodernui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ImageCardItem() {
    val painter = painterResource(id = R.drawable.ic_sample_four)
    Box(
        modifier = Modifier
            .fillMaxWidth(0.5f)
            .fillMaxHeight(0.3f)
            .padding(12.dp)
    ) {
        ImageCard(
            title = "This is the styled image card...",
            painter = painter
        )
    }
}

@Composable
fun ImageCard(title: String, painter: Painter) {
    Card(
        shape = RoundedCornerShape(10.dp)
    ) {
        Box {
            Image(
                painter = painter, contentDescription = title, contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent, Color.Black
                            ), startY = 300f
                        )
                    )
            )
            Text(
                text = title,
                style = TextStyle(color = Color.White, fontSize = 16.sp),
                modifier = Modifier
                    .padding(8.dp)
                    .align(Alignment.BottomStart)
            )
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ImageCardPreview() {
    val painter = painterResource(id = R.drawable.ic_sample_four)
    ImageCard(
        title = "This is the image card with gradient style", painter = painter
    )
}