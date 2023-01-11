package com.modern.androidmodernui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.modern.androidmodernui.data.AppItem
import com.modern.androidmodernui.data.DataSource

@Composable
fun GridHomeList(title: String, appList: List<List<AppItem>>) {
    Column {
        HeaderHome(title = title)
        LazyRow(
            contentPadding = PaddingValues(16.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            itemsIndexed(appList) { index, items ->
                Column(
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    for (item in items) {
                        HorizontalAppItem(item)
                    }
                }
            }
        }
    }
}

@Composable
fun HeaderHome(title: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = title,
            color = Color.White,
            fontSize = 18.sp
        )
        Icon(
            imageVector = Icons.Filled.ArrowForward,
            tint = Color.White,
            contentDescription = ""
        )
    }
}

@Composable
fun SimpleHomeList(title: String, appList: List<AppItem>) {
    Column {
        HeaderHome(title = title)
        LazyRow(
            contentPadding = PaddingValues(16.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            itemsIndexed(appList) { index, item ->
                AndroidAppItem(item)
            }
        }
    }
}

@Composable
fun AndroidAppItem(item: AppItem) {
    Column {
        Image(
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(16.dp)),
            painter = painterResource(id = item.image),
            contentDescription = "Play Icon"
        )
        Text(
            modifier = Modifier.padding(top = 5.dp),
            text = item.title,
            color = Color.White,
            fontSize = 14.sp
        )
        Text(
            text = item.rating.toString(),
            color = Color.White,
            fontSize = 12.sp
        )
    }
}

@Composable
fun HorizontalAppItem(appItem: AppItem) {
    Row {
        Image(
            modifier = Modifier
                .size(50.dp)
                .clip(RoundedCornerShape(8.dp)),
            painter = painterResource(id = appItem.image),
            contentDescription = "Play Icon"
        )
        Spacer(modifier = Modifier.size(16.dp))
        Column(verticalArrangement = Arrangement.SpaceBetween) {
            Text(text = appItem.title, color = Color.White, fontSize = 14.sp)
            Text(
                text = appItem.smallDesc,
                overflow = TextOverflow.Ellipsis,
                color = Color.White,
                fontSize = 12.sp
            )
            Text(
                text = "${appItem.rating}*  ${appItem.size} MB",
                color = Color.White,
                fontSize = 10.sp
            )
        }
    }
}

@Composable
fun LazyHomeScreen() {
    val gridList = arrayListOf<List<AppItem>>()
    gridList.add(DataSource.getFirstList().subList(0, 3))
    gridList.add(DataSource.getFirstList().subList(0, 3))
    gridList.add(DataSource.getFirstList().subList(0, 3))



    val grid2List = arrayListOf<List<AppItem>>()
    grid2List.add(DataSource.getFirstList().subList(0, 3))
    grid2List.add(DataSource.getFirstList().subList(0, 3))
    grid2List.add(DataSource.getFirstList().subList(0, 3))

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(top = 16.dp)
    ) {
        LazyColumn {
            item {
                SimpleHomeList(
                    title = "Based on your recent activity",
                    appList = DataSource.getFirstList()
                )
            }
            item {
                SimpleHomeList(
                    title = "Lifestyle",
                    appList = DataSource.getFirstList()
                )
            }
            item {
                GridHomeList(title = "Health & Fitness", gridList)
            }
            item {
                SimpleHomeList(
                    title = "Suggested for you",
                    appList = DataSource.getFirstList()
                )
            }
            item {
                SimpleHomeList(
                    title = "Recommended for you",
                    appList = DataSource.getFirstList()
                )
            }
            item {
                GridHomeList(title = "Health & Fitness", grid2List)
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LazyColumnPreview() {
    LazyHomeScreen()
}