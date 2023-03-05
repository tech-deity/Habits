package com.example.habit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.habit.ui.HomeScreen
import com.example.habit.ui.theme.MeditationUIYouTubeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationUIYouTubeTheme{
                HomeScreen()
                }

            }
        }
    }


