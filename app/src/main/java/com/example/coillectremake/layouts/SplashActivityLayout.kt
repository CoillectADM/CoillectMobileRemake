package com.example.coillectremake.layouts

import com.example.coillectremake.R

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
@Preview
fun SplashActivityLayout(): Unit {
    Box(
        modifier = Modifier.fillMaxSize().paint(
            painterResource(id = R.drawable.bgdegrade),
            contentScale = ContentScale.Crop,
            alignment = Alignment.Center

        )
    ) {
        Image(
            painter = painterResource(R.drawable.logo),
            contentDescription = "Logo cOillect",
            modifier = Modifier.size(220.dp,220.dp).align(Alignment.Center),
        )
    }
}