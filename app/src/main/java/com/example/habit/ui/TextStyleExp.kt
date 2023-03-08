package com.example.habit.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.habit.ui.theme.Ghothica1

@Composable
fun TextStyleExp(){
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Column (
            modifier = Modifier.padding(20.dp).fillMaxWidth().fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
                ){

            FirstC()


        }
    }
}

@Composable
fun FirstC(){
    Text(text = "HEllo World",

    style = TextStyle(
        shadow = Shadow(
            color = Color.Black,
            offset = Offset(5f, 5f),
            blurRadius = 5f
        ),
        color = Color.Blue,
        fontSize = 40.sp,
        fontFamily = Ghothica1,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Italic,
        letterSpacing = 0.5.em,
        background = Color.Magenta,

        textDecoration = TextDecoration.Underline
    )
        )
}

@Preview(showSystemUi = true)
@Composable
fun PreviewTextStyleExp(){
    TextStyleExp()

}