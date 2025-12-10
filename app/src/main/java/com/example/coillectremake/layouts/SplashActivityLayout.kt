package com.example.coillectremake.layouts

import com.example.coillectremake.R

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun SplashActivityLayout(): Unit {
    Box(
        modifier = Modifier.fillMaxSize().background(
            brush = Brush.verticalGradient(
                colors = listOf(
                    Color(0xFF00BCD4),
                    Color(0XFF4CAF50)
                )
            )
        )
    ) {
        Image(
            painter = painterResource(R.drawable.logo),
            contentDescription = "Logo cOillect",
            modifier = Modifier.size(220.dp).align(Alignment.TopCenter).padding(top = 252.dp)
        )
    }
}