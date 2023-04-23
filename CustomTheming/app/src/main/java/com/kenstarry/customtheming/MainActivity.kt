package com.kenstarry.customtheming

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kenstarry.customtheming.ui.custom.spacing
import com.kenstarry.customtheming.ui.theme.CustomThemingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomThemingTheme {

            }
        }
    }
}

@Composable
fun MyBox() {
    Box(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
            .padding(MaterialTheme.spacing.medium)
    ) {
        Text(text = "Hello there")
    }
}




























