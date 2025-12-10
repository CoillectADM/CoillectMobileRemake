package com.example.coillectremake.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper

import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview

import com.example.coillectremake.layouts.SplashActivityLayout

class SplashActivity : AppCompatActivity() {
    private val SPLASH_DELAY: Long = 2000;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(
            ComposeView(this).apply {
                setContent {
                    SplashActivityLayout()
                }
            }
        )

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_DELAY)

    }
}