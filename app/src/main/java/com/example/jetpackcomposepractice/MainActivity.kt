package com.example.jetpackcomposepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposepractice.ui.theme.JetPackComposePracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(Color.Green)
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth()
                    .padding(top = 50.dp)
                    .border(5.dp, Color.Black)
                    .padding(5.dp)
                    .border(5.dp,Color.Gray)
                    .padding(50.dp)
                    .border(20.dp, Color.Red)
        //                        .requiredWidth(300.dp)
            ){
                Text("Hello", modifier = Modifier
                    .border(5.dp,Color.Cyan)
                    .offset(20.dp, 50.dp)
                    .border(2.dp, Color.White)
                    .clickable {  })
                Spacer(modifier = Modifier.height(100.dp))
                Text("World")
            }
            }
        }
    }

//Row&Column

//Row(
//modifier = Modifier
//.width(200.dp)
//.fillMaxHeight()
//.background(Color.Green),
//horizontalArrangement = Arrangement.SpaceAround,
//verticalAlignment = Alignment.CenterVertically
//) {
//    Text("Hello")
//    Text("World")
//    Text("good")
//}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
        Greeting("Axe")
}