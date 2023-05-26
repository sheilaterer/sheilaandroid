package com.example.afternoonjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class textActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            form()
 
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun form(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Cyan)
        .padding(50.dp)) {

        Text(text = "PERSONAL DETAILS", fontSize = 20.sp, fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold, textDecoration = TextDecoration.Underline)

        var text by remember { mutableStateOf("") }
        TextField(
            value = text,
            onValueChange = {text= it},
            label = { Text(text = "Firstname")},
            modifier = Modifier.fillMaxWidth().padding(10.dp),
            placeholder = { Text(text = "Enter firstname")},
            leadingIcon = { Icon(imageVector = Icons.Default.Face, contentDescription = "icon")},
            trailingIcon = { Icon(imageVector = Icons.Default.Check, contentDescription = "icon")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        var mname by remember { mutableStateOf("") }
        TextField(
            value = mname,
            onValueChange = {mname= it},
            label = { Text(text = "middlename")},
            modifier = Modifier.fillMaxWidth().padding(10.dp),
            placeholder = { Text(text = "Enter middlename")},
            leadingIcon = { Icon(imageVector = Icons.Default.Face, contentDescription = "icon")},
            trailingIcon = { Icon(imageVector = Icons.Default.Check, contentDescription = "icon")},
            textStyle = TextStyle(color = Color.Red),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        var lname by remember { mutableStateOf("") }
        TextField(
            value = lname,
            onValueChange = {lname= it},
            label = { Text(text = "lastname")},
            modifier = Modifier.fillMaxWidth().padding(10.dp),
            placeholder = { Text(text = "Enter lastname")},
            leadingIcon = { Icon(imageVector = Icons.Default.Face, contentDescription = "icon")},
            trailingIcon = { Icon(imageVector = Icons.Default.Check, contentDescription = "icon")},
            textStyle = TextStyle(color = Color.Red),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        var myemail by remember { mutableStateOf("") }
        TextField(
            value = myemail,
            onValueChange = {myemail= it},
            label = { Text(text = "Email")},
            modifier = Modifier.fillMaxWidth().padding(10.dp),
            placeholder = { Text(text = "Type your email")},
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "icon")},
            trailingIcon = { Icon(imageVector = Icons.Default.Check, contentDescription = "icon")},
            textStyle = TextStyle(color = Color.Red),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        var pass by remember { mutableStateOf("") }
        TextField(
            value = pass,
            onValueChange = {pass= it},
            label = { Text(text = "password")},
            modifier = Modifier.fillMaxWidth().padding(10.dp),
            placeholder = { Text(text = "Type your password")},
            leadingIcon = { Icon(imageVector = Icons.Default.Menu, contentDescription = "icon")},
            trailingIcon = { Icon(imageVector = Icons.Default.Check, contentDescription = "icon")},
            textStyle = TextStyle(color = Color.Red),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )
        var mynumber by remember { mutableStateOf("") }
        TextField(
            value = mynumber,
            onValueChange = {mynumber= it},
            label = { Text(text = "contact")},
            modifier = Modifier.fillMaxWidth().padding(10.dp),
            placeholder = { Text(text = "Enter phone number")},
            leadingIcon = { Icon(imageVector = Icons.Default.Phone, contentDescription = "icon")},
            trailingIcon = { Icon(imageVector = Icons.Default.Check, contentDescription = "icon")},
            textStyle = TextStyle(color = Color.Red),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),

        )

    }
}

@Preview(showBackground = true)
@Composable
fun formPreview(){
    form()
}