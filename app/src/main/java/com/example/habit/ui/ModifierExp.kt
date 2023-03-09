package com.example.habit.ui


import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.habit.R
@Composable
fun Testing(

){
    Column(modifier = Modifier.fillMaxSize()
        .background(gradientGreenRed)
        .padding(22.dp)
    ) {

        Text(text = "Hey this texting is coming with padding of 22 dp ",
            modifier = Modifier.background(Color.Red)
                .alpha(0.9f)
                .padding(20.dp)
                .clip(RoundedCornerShape(25.dp))
                .background(Color.LightGray)
                .border(2.dp, SolidColor(Color.Blue),RoundedCornerShape(20.dp)),

            style = TextStyle(

                textAlign = TextAlign.Center,
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue,
                fontFamily =  FontFamily(Font(R.font.loveloblack)
            )

        ))

        SimpleButton()







    }
}

@Composable
fun SimpleButton(){
    Button(
        onClick = {

        },
        

    ){

        Text(text = "Simple Button")
    }
}


@Preview(name = "Testing", showSystemUi = true)
@Composable
fun PreviewTesting(){
    Testing()
}
