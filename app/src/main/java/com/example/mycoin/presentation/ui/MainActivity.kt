package com.example.mycoin.presentation.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.mycoin.presentation.ui.theme.MyCoinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyCoinTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}