package com.example.afternoonjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sheila.R

class cardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mycards()

        }
    }
}

@Composable
fun mycards(){
    Card (modifier = Modifier
        .background(color = Color.Gray)
        .padding(30.dp)){
        Column(modifier = Modifier.padding(all = 12.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Bulldog", fontSize = 20.sp, fontStyle = FontStyle.Italic)
            Image(painter = painterResource(id = R.drawable.bulldog), contentDescription = "Bulldog", modifier = Modifier
                .size(200.dp)
                .clip(shape = CircleShape))

        }

    }
    Spacer(modifier = Modifier.height(20.dp))

    Card (modifier = Modifier
        .background(color = Color.Gray)
        .padding(30.dp)){
        Column(modifier = Modifier.padding(all = 12.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Bulldog", fontSize = 20.sp, fontStyle = FontStyle.Italic)
            Image(painter = painterResource(id = R.drawable.rottweiler), contentDescription = "Bulldog", modifier = Modifier
                .size(200.dp)
                .clip(shape = CircleShape))

        }

    }
    Spacer(modifier = Modifier.height(20.dp))
    Card (modifier = Modifier
        .background(color = Color.Gray)
        .padding(30.dp)){
        Column(modifier = Modifier.padding(all = 12.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Bulldog", fontSize = 20.sp, fontStyle = FontStyle.Italic)
            Image(painter = painterResource(id = R.drawable.shepherd), contentDescription = "Bulldog", modifier = Modifier
                .size(200.dp)
                .clip(shape = CircleShape))

        }

    }
    Spacer(modifier = Modifier.height(20.dp))
    Card (modifier = Modifier
        .background(color = Color.Gray)
        .padding(30.dp)){
        Column(modifier = Modifier.padding(all = 12.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Bulldog", fontSize = 20.sp, fontStyle = FontStyle.Italic)
            Image(painter = painterResource(id = R.drawable.huskey), contentDescription = "Bulldog", modifier = Modifier
                .size(200.dp)
                .clip(shape = CircleShape))

        }

    }
    Spacer(modifier = Modifier.height(20.dp))
    Card (modifier = Modifier
        .background(color = Color.Gray)
        .padding(30.dp)){
        Column(modifier = Modifier.padding(all = 12.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Bulldog", fontSize = 20.sp, fontStyle = FontStyle.Italic)
            Image(painter = painterResource(id = R.drawable.goldenretriever), contentDescription = "Bulldog", modifier = Modifier
                .size(200.dp)
                .clip(shape = CircleShape))

        }

    }
    Spacer(modifier = Modifier.height(20.dp))





}

@Preview(showBackground = true)
@Composable
fun mycardsPreview(){
    mycards()
}
