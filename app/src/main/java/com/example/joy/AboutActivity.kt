package com.example.joy

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.joy.ui.theme.JOYTheme

import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Text as Text




class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting2()
        }
        }

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting2() {
    var texts by remember { mutableStateOf(TextFieldValue("")) }
    var name by remember { mutableStateOf(TextFieldValue("")) }
    var  email by remember { mutableStateOf(TextFieldValue("")) }
    var  password by remember { mutableStateOf(TextFieldValue("")) }

    val home = LocalContext.current


    Column(
        modifier = Modifier
            .background(Color.DarkGray)
            .fillMaxSize(),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,


    )
    {
        Text(
            "CREATE AN ACCOUNT", color = Color(0xFF40C4FF),
            fontSize = 30.sp
        )
        Image(
            painter = painterResource(id = R.drawable.login),
            contentDescription = "welcome",
            modifier = Modifier
                .size(150.dp),
            contentScale = ContentScale.Inside
        )
        Spacer(modifier = Modifier.height(20.dp))



        OutlinedTextField(
            value = texts,
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "emailIcon") },
            //trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
            onValueChange = {
                texts = it
            },
            label = { Text(text = "Full Name") },
            placeholder = { Text(text = "Enter your Full Name") },
            colors = TextFieldDefaults.textFieldColors(placeholderColor = Color(0XFF9575CD),
            disabledPlaceholderColor = Color(0XFF9575CD)),
            modifier = Modifier
                .background(color = Color.DarkGray)
        )



        OutlinedTextField(
            value = name,
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "emailIcon") },
            //trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
            onValueChange = {
                name = it
            },
            label = { Text(text = "Username") },
            placeholder = { Text(text = "Enter your Username") },
            colors = TextFieldDefaults.textFieldColors(placeholderColor = Color(0XFF9575CD),
            disabledPlaceholderColor = Color(0XFF9575CD)),
            modifier = Modifier
                .background(color = Color.DarkGray)
        )

        OutlinedTextField(
            value = email,
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "emailIcon") },
            //trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
            onValueChange = {
                email = it
            },
            label = { Text(text = "Email address") },
            placeholder = { Text(text = "Enter your e-mail") },
            colors = TextFieldDefaults.textFieldColors(placeholderColor = Color(0XFF9575CD),
           disabledPlaceholderColor = Color(0XFF9575CD)),
            modifier = Modifier
                .background(color = Color.DarkGray)
        )

        OutlinedTextField(
            value = password,
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "emailIcon") },
            //trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
            onValueChange = {
                password = it
            },
            label = { Text(text = "Password") },
            placeholder = { Text(text = "Create your Password") },
            colors = TextFieldDefaults.textFieldColors(placeholderColor = Color(0XFF9575CD),
            disabledPlaceholderColor = Color(0XFF9575CD)),
            modifier = Modifier
                .background(color = Color.DarkGray)
        )

//Column(
//    verticalArrangement = Arrangement.Center,
//    horizontalAlignment = Alignment.CenterHorizontally,
//) {

        Spacer(modifier = Modifier.height(20.dp))
    Button(
        onClick = { home.startActivity(Intent(home, LoginActivity::class.java)) },

        modifier = Modifier,
        colors = ButtonDefaults.buttonColors(Color.Black),
        shape = RectangleShape,
        border = BorderStroke(2.dp, Color.Black),
    )
    {
        Text(
            "SUBMIT", color = Color(0XFF9575CD),
            fontSize = 15.sp
        )
    }


}
}}


