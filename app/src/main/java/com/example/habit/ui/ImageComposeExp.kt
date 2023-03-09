package com.example.habit.ui


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview




@Composable
fun ImageTest(){



    Column(modifier = Modifier.fillMaxSize()
        .background(gradientBluePink)
    ) {

    }

}






@Preview(name = "Image in Jet Pack Compose", showSystemUi = true)
@Composable
fun PreviewImageTest(){
    ImageTest()
}