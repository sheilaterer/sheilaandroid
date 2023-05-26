package com.example.afternoonjetpack

import android.content.Intent
import android.os.Bundle
import android.text.style.UnderlineSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.input.key.Key.Companion.R
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle.Companion.Italic
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.sheila.card2Activity
import com.example.sheila.card3Activity
import com.example.sheila.card4Activity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            text()

        }
    }
}

@Composable
fun text() {
    val mContext = LocalContext.current

    Column(modifier = Modifier.fillMaxSize()) {

        Button(
            onClick = {
                mContext.startActivity(Intent(mContext, layoutActivity::class.java))
            },
            shape = RectangleShape
        ) {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Arrow")
            Text(text = "Layout")

        }
        Button(onClick = {
            mContext.startActivity(Intent(mContext, ImageActivity::class.java))
        }) {
            Text(text = "Image")

        }
        Button(onClick = {
            mContext.startActivity(Intent(mContext, foodActivity::class.java))
        }) {
            Text(text = "Food")

        }
        Button(onClick = {
            mContext.startActivity(Intent(mContext, textActivity::class.java))
        }) {
            Text(text = "details")

        }
        Button(onClick = {
            mContext.startActivity(Intent(mContext, listActivity::class.java))
        }) {
            Text(text = "number")

        }
        Button(onClick = {
            mContext.startActivity(Intent(mContext, cardActivity::class.java))
        }) {
            Text(text = "cards")

        }
        Button(onClick = {
            mContext.startActivity(Intent(mContext, card2Activity::class.java))
        }) {
            Text(text = "mycards")

        }
        Button(onClick = {
            mContext.startActivity(Intent(mContext, card3Activity::class.java))
        }) {
            Text(text = "mycard")
        }
        Button(onClick = {
            mContext.startActivity(Intent(mContext, card4Activity::class.java))
        }) {
            Text(text = "mycardi")
        }


    }
}
@Preview(showBackground = true)
@Composable
fun textpreview(){
    text()

}

