package com.kenstarry.snippets.modifiers

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kenstarry.snippets.R

@Composable
fun MyCard() {
    Card(
        modifier = Modifier
            .size(200.dp),
        shape = RoundedCornerShape(24.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Cyan),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.baseline_baby_changing_station_24),
                contentDescription = "baby changing station",
                modifier = Modifier
                    .fillMaxSize(0.5f)
            )
        }
    }
}

@Composable
fun MyCardAlt() {
    Box(
        modifier = Modifier
            .size(200.dp)
            .background(
                color = Color.Cyan,
                shape = RoundedCornerShape(24.dp)
            ),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.baseline_baby_changing_station_24),
            contentDescription = "baby changing station",
            modifier = Modifier
                .fillMaxSize(0.5f)
        )
    }
}

@Composable
fun MyCardAlt2() {
    Box(
        modifier = Modifier
            .clip(CircleShape)
            .size(200.dp)
            .background(Color.Cyan),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.baseline_baby_changing_station_24),
            contentDescription = "baby changing station",
            modifier = Modifier
                .fillMaxSize(0.5f)
        )
    }
}

@Preview
@Composable
fun MyCardPreview() {
    MyCard()
}

@Preview
@Composable
fun MyCardAltPreview() {
    MyCardAlt()
}

@Preview
@Composable
fun MyCardAlt2Preview() {
    MyCardAlt2()
}



































