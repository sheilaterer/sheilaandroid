package com.example.afternoonjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.sheila.R


class foodActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            image1()

        }
    }
}

@Composable
fun image1() {
    Column(modifier = Modifier.fillMaxSize().background(color = Color.DarkGray)) {
        Image(modifier = Modifier.fillMaxWidth(), painter = painterResource(id = R.drawable.pizza1), contentDescription = "Pizza")
        Text(text = "Homemade veg pizza", fontSize = 50.sp)
        Text(text = "Italian food:delicious homemade pizza with mozzarella and cherry tomatoes shot from above on rustic wooden table. Some ingredients for preparing pizza like mozzarella, cheese, basil, fresh tomatoes, olive oil, salt and pepper are all around the pizza.", fontSize = 35.sp)
    }
}


@Preview(showBackground = true)
@Composable
fun imagePreview() {
    image1()
}



