package com.example.habit.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.habit.R
import com.example.habit.ui.theme.Ghothica1


@Composable
fun LoginPage(){
    Box(

        modifier = Modifier
            .fillMaxSize()
            .background(gradientGreenRed)

    ){

        Column(
            modifier = Modifier.padding(20.dp).fillMaxWidth().fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            val username = remember { mutableStateOf(TextFieldValue()) }
            val password = remember { mutableStateOf(TextFieldValue()) }

            Text(text = "Login",
                        style = TextStyle(
                            fontSize = 40.sp,
                            fontFamily = FontFamily(
                                Font(R.font.loveloblack)

                            ))
                )
            
            Spacer(modifier = Modifier.height(20.dp))

            TextField(
                label = {Text(text = "UserName")},
                value = username.value,
                onValueChange = {username.value = it }
            )

            Spacer(modifier = Modifier.height(20.dp))

            TextField(
                label = {Text(text = "Password")},
                value = password.value,
                keyboardOptions = KeyboardOptions(keyboardType =KeyboardType.Password),
                onValueChange = {password.value = it }
            )


            Spacer(modifier = Modifier.height(20.dp))

            Box(modifier = Modifier.padding(40.dp, 0.dp, 40.dp, 0.dp)){
                Button(
                    onClick = {},
                    shape = RoundedCornerShape(50.dp),
                    modifier = Modifier.fillMaxWidth().height(50.dp)

                ){
                    Text(text = "Login")
                }
            }

        }

    }
}



@Composable
@Preview(showSystemUi = true,name="Login")
fun PreviewLoginPage(){
    LoginPage()
}