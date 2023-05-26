package com.example.sheila

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.sheila.ui.theme.SheilaTheme

class card4Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mycard3()

        }
    }
}

@Composable
fun mycard3(){
    Text(text = "Dubai, Media City")



}

@Preview(showBackground = true)
@Composable
fun mycard3Preview(){
    mycard3()

}
