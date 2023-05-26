package com.example.sheila

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sheila.ui.theme.SheilaTheme

class card3Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mycard2()

        }
    }
}

@Composable
fun mycard2() {

    var scrollState = rememberScrollState()
    Card(modifier = Modifier
                .padding(30.dp)
        ) {
        Column(modifier = Modifier
            .verticalScroll(scrollState)
            .padding(all = 12.dp), horizontalAlignment = Alignment.CenterHorizontally
            ) {
            Image(painter = painterResource(id = R.drawable.morty), contentDescription = "morty", modifier = Modifier.size(200.dp))
            Row() {
                Text(text = "Morty")
                Column() {
                    Text(text = "Human")

                }
                Column() {
                    Text(text = "Alive")

                }

            }
        }

        }

    Spacer(modifier = Modifier.height(20.dp))
    Card(modifier = Modifier
        .background(color = Color.LightGray)
        .padding(30.dp)
        ) {
        Column(modifier = Modifier
            .verticalScroll(scrollState)
            .padding(all = 12.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painter = painterResource(id = R.drawable.gun), contentDescription = "pigtails", modifier = Modifier
                        .size(200.dp)
            )
        }
    }

    Spacer(modifier = Modifier.height(20.dp))
    Card(modifier = Modifier.verticalScroll(scrollState)
                .padding(30.dp)) {
        Column(modifier = Modifier.padding(all = 12.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painter = painterResource(id = R.drawable.babylegs), contentDescription = "legs", modifier = Modifier
                        .size(200.dp))
        }
    }

    Spacer(modifier = Modifier.height(20.dp))
    Card(modifier = Modifier
                .padding(30.dp)) {
        Column(modifier = Modifier.padding(all = 12.dp),
                horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painter = painterResource(id = R.drawable.baby), contentDescription = "baby", modifier = Modifier
                        .size(200.dp))
        }

        }



}

@Preview(showBackground = true)
@Composable
fun mycard2Preview(){
    mycard2()
}
