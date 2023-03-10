package com.example.habit.ui

import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode
import com.example.habit.R
import com.example.habit.ui.theme.PinkColor


val gradientGreenRed = Brush.horizontalGradient(
 0f to Color.Cyan, 1000f to Color.Magenta

)


val gradientBluePink = Brush.horizontalGradient(
 0f to Color.Blue, 1000f to PinkColor

)