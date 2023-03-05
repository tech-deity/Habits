package com.example.habit.ui

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.habit.BottomMenuContent
import com.example.habit.Features
import com.example.habit.standardQuadFromTo
import com.example.habit.ui.theme.*

@Composable
fun HomeScreen(){

    Box(modifier = Modifier
        .background(DeepBlue)
        .fillMaxSize())
    {
        Column{
            GreetingSection()

            ChipSection(chips= listOf("sweet sleep", "Insomnia" , "Depression"))

            CurrentMeditation()

            FeatureSection(features = listOf(

                Features(
                    title = "Sleep meditation",
                   com.example.habit.R.drawable.ic_headphone,
                    BlueViolet1,
                    BlueViolet2,
                    BlueViolet3
                ),
                Features(
                    title = "Tips for sleeping",
                    com.example.habit.R.drawable.ic_videocam,
                    LightGreen1,
                    LightGreen2,
                    LightGreen3
                ),
                Features(
                    title = "Night island",
                    com.example.habit.R.drawable.ic_headphone,
                    OrangeYellow1,
                    OrangeYellow2,
                    OrangeYellow3
                ),
                Features(
                    title = "Calming sounds",
                    com.example.habit.R.drawable.ic_music,
                    Beige1,
                    Beige2,
                    Beige3
                ),
                Features(
                    title = "Checking Test ",
                    com.example.habit.R.drawable.ic_play,
                    OrangeYellow1,
                    OrangeYellow2,
                    OrangeYellow3
                    )
                )
            )

        }
        BottomMenu(items = listOf(
            BottomMenuContent("Home",  com.example.habit.R.drawable.ic_headphone),
            BottomMenuContent("Meditate",  com.example.habit.R.drawable.ic_bubble),
            BottomMenuContent("Sleep",  com.example.habit.R.drawable.ic_moon),
            BottomMenuContent("Music",  com.example.habit.R.drawable.ic_music),
            BottomMenuContent("Profile",  com.example.habit.R.drawable.ic_profile),
            ), modifier = Modifier.align(Alignment.BottomCenter))

    }


}

@Composable
fun GreetingSection(
    name:String = "Vishal"
    )
{
    Row(horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)

        ){
        Column(
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Good Morning , $name",
                style = MaterialTheme.typography.h5,
                color = Color.White
            )
            Text(
                text = "We wish You have a Good Day dear",
                style = MaterialTheme.typography.body1,
                        color = Color.Cyan
            )

        }
        Icon(
            painter = painterResource(id = com.example.habit.R.drawable.ic_search),
            contentDescription = "Search",
            tint = Color.White ,
            modifier = Modifier.size(24.dp)
        )
    }

}

@Composable
fun ChipSection(
    chips:List<String>
)   {

    var selectedChipIndex by remember {
        mutableStateOf(0)
    }
    LazyRow{

        items(chips.size){
            Box(
                contentAlignment= Alignment.Center,
                modifier = Modifier
                    .padding(
                        start = 15.dp,
                        top = 15.dp,
                        bottom = 15.dp

                    )
                    .clickable {
                        selectedChipIndex = it
                    }
                    .clip(RoundedCornerShape(10.dp))
                    .background(
                        if (selectedChipIndex == it) ButtonBlue
                        else DarkerButtonBlue
                    )
                    .padding(15.dp)
            ){

                Text(text = chips[it], color = TextWhite)
            }
        }

    }

}

@Composable
fun CurrentMeditation(
    color: Color = LightRed
){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(15.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(color)
            .padding(horizontal = 15.dp, vertical = 20.dp)
            .fillMaxWidth()
    ){
        Column{
            Text(
                text = "Daily thought ",
                style = MaterialTheme.typography.h4,
                color = Color.White
            )
            Text(
                text = "Meditation 3- 10 mins ",
                style = MaterialTheme.typography.body1,
                color = TextWhite
            )
        }

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(ButtonBlue)
                .padding(10.dp)
        ){
            Icon(
                painter = painterResource(id = com.example.habit.R.drawable.ic_play),
                contentDescription = "Play",
                tint = Color.White ,
                modifier = Modifier.size(24.dp)
            )

        }




    }

}


@Composable
fun FeatureSection( features :List<Features>){
    
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "Featured",
            style= MaterialTheme.typography.h5,
            modifier = Modifier.padding(15.dp),
            color = TextWhite
        )
        
        LazyVerticalGrid(columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(start = 7.5.dp, end = 7.5.dp, bottom = 100.dp),
            modifier = Modifier.fillMaxHeight()){
                    items(features.size){
                        
                        FeatureItem(feature = features[it])
                        // here we have to define how our item will look like we have to create an compose function for this
                    }

                }
    }

}


@Composable
fun FeatureItem(feature: Features) {

    BoxWithConstraints(
        modifier = Modifier
            .padding(7.5.dp)
            .aspectRatio(1f)
            .clip(RoundedCornerShape(10.dp))
            .background(feature.darkColor)
    ) {

        val width = constraints.maxWidth
        val height = constraints.maxHeight

        //Medium colored Path
        val mediumColoredPoint1 = Offset(0f, height * 0.3f)
        val mediumColoredPoint2 = Offset(width * 0.1f, height * 0.35f)
        val mediumColoredPoint3 = Offset(width * 0.4f, height * 0.05f)
        val mediumColoredPoint4 = Offset(width * 0.75f, height * 0.7f)
        val mediumColoredPoint5 = Offset(width * 1.4f, -height.toFloat())

        val mediumColoredPath = Path().apply {
            moveTo(mediumColoredPoint1.x, mediumColoredPoint1.y)
            standardQuadFromTo(mediumColoredPoint1, mediumColoredPoint2)
            standardQuadFromTo(mediumColoredPoint2, mediumColoredPoint3)
            standardQuadFromTo(mediumColoredPoint3, mediumColoredPoint4)
            standardQuadFromTo(mediumColoredPoint4, mediumColoredPoint5)

            lineTo(width.toFloat() + 100f, height.toFloat() + 100f)
            lineTo(-100f, height.toFloat() + 100f)
            close()
        }


            //Light  colored Path
            val lightColoredPoint1 = Offset(0f, height * 0.3f)
            val lightColoredPoint2 = Offset(width * 0.1f, height * 0.4f)
            val lightColoredPoint3 = Offset(width * 0.3f, height * 0.35f)
            val lightColoredPoint4 = Offset(width * 0.65f, height.toFloat())
            val lightColoredPoint5 = Offset(width * 1.4f, -height.toFloat() / 3f)

            val lightColoredPath = Path().apply {
                moveTo(mediumColoredPoint1.x, mediumColoredPoint1.y)
                standardQuadFromTo(lightColoredPoint1, lightColoredPoint2)
                standardQuadFromTo(lightColoredPoint2, lightColoredPoint3)
                standardQuadFromTo(lightColoredPoint3, lightColoredPoint4)
                standardQuadFromTo(lightColoredPoint4, lightColoredPoint5)

                lineTo(width.toFloat() + 100f, height.toFloat() + 100f)
                lineTo(-100f, height.toFloat() + 100f)
                close()
            }


        Canvas(modifier = Modifier
            .fillMaxSize()
        ){
            drawPath(
                    path = mediumColoredPath ,
            color = feature.mediumColor
            )
            drawPath(
                path = lightColoredPath ,
                color = feature.lightColor
            )

        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp)
        ){
            Text(
                text = feature.title,
                style = MaterialTheme.typography.h6,
                lineHeight = 26.sp,
                color = TextWhite,
                modifier = Modifier.align(Alignment.TopStart)
            )
            Icon(
                painter = painterResource(id = feature.iconID),
                contentDescription = feature.title,
                tint = Color.White,
                modifier = Modifier.align(Alignment.BottomStart)
            )
            Text(
                text ="Start",
                color = TextWhite,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .clickable {

                    }
                    .align(Alignment.BottomEnd)
                    .clip(RoundedCornerShape(10.dp))
                    .background(ButtonBlue)
                    .padding(vertical = 6.dp, horizontal = 15.dp)
            )

        }


    }
}

@Composable
fun BottomMenu(
    items :List<BottomMenuContent>,
    modifier: Modifier = Modifier,
    activeHighlightColor :Color  = ButtonBlue,
    activeTextColor :Color  = Color.White,
    inactiveTextColor :Color = AquaBlue,
    initialSelectedItemIndex:Int = 0

){
    var selectedItemIndex by remember {
        mutableStateOf(initialSelectedItemIndex)
    }

    Row (
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .background(DeepBlue)
            .padding(15.dp)
            ){


            items.forEachIndexed { index, item ->

                    BottomMenuItem(
                        item = item,
                        isSelected = index == selectedItemIndex,
                        activeHighlightColor= activeHighlightColor,
                        activeTextColor = activeTextColor,
                        inactiveTextColor = inactiveTextColor

                    ) {

                        selectedItemIndex = index

                    }

            }
    }

}

@Composable
fun BottomMenuItem(

    item:BottomMenuContent,
    isSelected:Boolean = false ,
    activeHighlightColor: Color = ButtonBlue,
    activeTextColor: Color = Color.White,
    inactiveTextColor: Color = AquaBlue,
    onItemClick:()->Unit
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.clickable {
            onItemClick()
        }
    ) {

        Box (
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .background(if (isSelected) activeHighlightColor else Color.Transparent)
                .padding(10.dp)
                ){

            Icon(
                painter = painterResource(id = item.iconId),
                contentDescription = item.title,
                tint =  if (isSelected) activeTextColor else inactiveTextColor,
                modifier = Modifier.size(20.dp)
            )
        }

        Text(
            text = item.title,
            color = if(isSelected) activeTextColor else inactiveTextColor
        )
    }



}



@Composable
@Preview(name = "HomeScreen", showSystemUi = true)
fun PreviewHomeScreen(){
    HomeScreen()
}





