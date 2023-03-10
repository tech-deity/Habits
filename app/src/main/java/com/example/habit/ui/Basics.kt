package com.example.habit.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Basics(){

    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Column{
            RowArrangement()
            ColumnArrangement()
        }

    }

}

//testing Row

@Composable
fun RowArrangement(){
    Row(
        modifier = Modifier
            .background(Color.Red)
            .fillMaxWidth()
            .padding(25.dp),
         verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly


    ){
            Text(text = "Text 1" ,
                style = TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
                )
            Text(text = "Text 2" , color = Color.White)
            Text(text = "Text 3" , color = Color.White)
            Text(text = "Text 3" , color = Color.White)
            Text(text = "Text 3" , color = Color.White)


    }
}


@Composable
fun ColumnArrangement(){
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally


    ) {
        val stylee = TextStyle( fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
        color = Color.Red,
        background = Color.Cyan )
        Text(text = "Text 1", style =stylee)
        Text(text = "Text 2", style =stylee)
        Text(text = "Text 3", style =stylee)
        Text(text = "Text 4", style =stylee)




    }
}

@Preview(name="Basic Preview", showSystemUi = true)
@Composable
fun PreviewBasics(){

    Basics()

}