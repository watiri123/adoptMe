package com.example.joy

import android.content.Intent
import android.graphics.Paint.Style
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.animateOffsetAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.joy.ui.theme.JOYTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Greeting(){
        var text by remember { mutableStateOf ( TextFieldValue(""))}

    val home = LocalContext.current
//
//             TextField(
//               value = text,
//               onValueChange = { newText ->
//                 text = newText
//            }
//             )


//    val gradientColors = listOf(Cyan, LightBlue, Purple /*...*/)
//
//    Text(
//           text = text,
//           style = TextStyle(ss
//               brush = Brush.linearGradient(
//                   colors = gradientColors
//               )
//           )
//       )

    Column(modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ){


        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {



            Image(painter = painterResource(id = R.drawable.index4),
                contentDescription ="background",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillBounds
            )


            Column(
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text( "")


                Text("Make A New Friend", color = Color.Black, fontWeight = FontWeight.Bold, fontSize = 25.sp)
                Spacer(modifier = Modifier
                    .height(10.dp)
                )
                Text("Too Many Cute Pets Are Waiting For You", color = Color.Black, fontSize = 15.sp )

                Spacer(modifier = Modifier.height(50.dp))



                Button(onClick = {home.startActivity(Intent(home,AboutActivity::class.java))},

                    colors = ButtonDefaults.buttonColors(Color(0XFF9575CD)),
                    shape = RectangleShape,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)

                    )
                {
                    Image(painter = painterResource(id = R.drawable.right), contentDescription = "shopping",
                        modifier = Modifier
                            .size(25.dp)

                    )
                    Spacer(modifier = Modifier
                        .width(10.dp))
                    Text( "Get Started", color = Color.White,
                        fontSize = 15.sp,
                        fontStyle = FontStyle.Italic,
                        fontFamily = FontFamily.SansSerif
                    )


                }



                Spacer(modifier = Modifier.height(40.dp))























                
            }


        }


    }













}




//    Box(modifier = Modifier) {
//        Row(
//            modifier = Modifier
//                .background(Color.DarkGray)
//
//
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.removebg),
//                contentDescription = "welcome",
//                modifier = Modifier
//                    .size(180.dp)
//                    .border(1.dp, Color.DarkGray, RoundedCornerShape(20)),
//                contentScale = ContentScale.Inside
//
//
//            )
//
//            Text("hello world",
//                fontSize = 20.sp
//            )
//    }
//
//
//    }

//   Column(
//       modifier = Modifier
//           .fillMaxSize()
//           .border(10.dp, Color.Cyan)
////           .fillMaxWidth()
////           .fillMaxHeight()
//           .background(Color.DarkGray),
//       horizontalAlignment = Alignment.CenterHorizontally,
//       verticalArrangement = Arrangement.SpaceAround
//
//   ) {
//       Image(
//           painter = painterResource(id = R.drawable.removebg),
//           contentDescription = "hello",
//           modifier = Modifier
//               .background(Color.DarkGray)
//               .border(1.dp, Color.DarkGray, RoundedCornerShape(10))
//
//
//       )
//       Text("Hello Joy",
//           color = Color.White,
//           fontSize = 40.sp
//       )
//       Text("Home",
//           Modifier.background(Color.White),
//           fontSize = 20.sp,
//           fontFamily = FontFamily.SansSerif
//
//       )
//       Text("welcome",
//           fontSize = 40.sp,
//           fontFamily = FontFamily.Cursive,
//           style = TextStyle(
//               shadow = Shadow(
//                   Color.Cyan, blurRadius = 45f,
//               )
//           )
//       )
//   }



