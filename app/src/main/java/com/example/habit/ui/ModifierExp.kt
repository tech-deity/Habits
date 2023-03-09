package com.example.habit.ui


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.painterResource
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
    Column(  horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(gradientGreenRed)
            .padding(22.dp)
    ) {

        Text(text = "Hey this texting is coming with padding of 22 dp ",

            modifier = Modifier
                .background(Color.Red)
                .alpha(0.9f)
                .padding(20.dp)
                .clip(RoundedCornerShape(25.dp))

                .border(2.dp, SolidColor(Color.Blue), RoundedCornerShape(20.dp)),

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
        onClick = {},
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Magenta),
        shape =
        //CutCornerShape(5)
        RoundedCornerShape(20.dp),


        elevation = ButtonDefaults.elevation(
            defaultElevation = 10.dp,
            pressedElevation = 15.dp,
            disabledElevation = 0.dp
        )


    ){
        Image(
            painterResource(id= R.drawable.ic_headphone)
            , contentDescription ="By HeadPhones",
            modifier = Modifier.size(20.dp))

        Text(text = "Simple ",
            color= Color.Black ,
            modifier = Modifier.padding(start=8.dp))
        Text(text = "Button",
            color= Color.White)
    }
}





@Preview(name = "Testing", showSystemUi = true)
@Composable
fun PreviewTesting(){
    Testing()
}
