package com.example.joy

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.joy.ui.theme.JOYTheme
import androidx.compose.foundation.layout.Row as Row1
import androidx.compose.foundation.lazy.LazyRow as LazyRow1

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListRow()
        }
    }
}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalFoundationApi::class, ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
    fun ListRow() {

    Scaffold(
        topBar = {

            TopAppBar(

                title = {
                    Text(text = "adoptMe", color = Color(0XFF9598FE))
                },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.List, "backIcon")
                    }
                },
            )
        }, content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.DarkGray),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                LazyColumn {

                    item {
                        Column (horizontalAlignment = Alignment.CenterHorizontally){
                            Text(text = "CATS", color = Color(0xff95ffe7))

                            LazyRow {

                                item {

                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.cat1) ,
                                            contentDescription = "A cat",
                                            contentScale= ContentScale.Crop,
                                            modifier = Modifier
                                                .size(100.dp)
                                                .padding(5.dp)
                                        )
                                        Text(text = "Maine Coon")

                                    }

                                }

                                item{
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.cat2) ,
                                            contentDescription = "A cat",
                                            contentScale= ContentScale.Crop,
                                            modifier = Modifier
                                                .size(100.dp)
                                                .padding(5.dp)
                                        )
                                        Text(text = "American Curl")

                                    }
                                }

                                item {
                                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                        Image(
                                            painter = painterResource(id = R.drawable.cat4) ,
                                            contentDescription = "A cat",
                                            contentScale= ContentScale.Crop,
                                            modifier = Modifier
                                                .size(100.dp)
                                                .padding(5.dp)
                                        )
                                        Text(text = "Tuxedo")

                                    }
                                }

                                item {
                                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                        Image(
                                            painter = painterResource(id = R.drawable.cat5) ,
                                            contentDescription = "A cat",
                                            contentScale= ContentScale.Crop,
                                            modifier = Modifier
                                                .size(100.dp)
                                                .padding(5.dp)
                                        )
                                        Text(text = "Siamese Cat")


                                    }
                                }


                            }

                            Spacer(modifier = Modifier.height(20.dp))

                        }


                    }

                    item{
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(text = "DOGS",color = Color(0xff95E2FF))

                            LazyRow {

                                item {
                                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                        Image(
                                            painter = painterResource(id = R.drawable.dog1) ,
                                            contentDescription = "A cat",
                                            contentScale= ContentScale.Crop,
                                            modifier = Modifier
                                                .size(100.dp)
                                                .padding(5.dp)
                                        )
                                        Text(text = "Jack Russell")
                                        
                                    }
                                }

                                item{
                                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                        Image(
                                            painter = painterResource(id = R.drawable.dog2) ,
                                            contentDescription = "A cat",
                                            contentScale= ContentScale.Crop,
                                            modifier = Modifier
                                                .size(100.dp)
                                                .padding(5.dp)
                                        )
                                        Text(text = "Maltipoo")
                                    }

                                }

                                item {
                                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                        Image(
                                            painter = painterResource(id = R.drawable.dog3),
                                            contentDescription = "A cat",
                                            contentScale= ContentScale.Crop,
                                            modifier = Modifier
                                                .size(100.dp)
                                                .padding(5.dp)

                                        )
                                        Text(text = "Maltipoo")

                                    }

                                }


                                item {
                                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                        Image(
                                            painter = painterResource(id = R.drawable.dog4) ,
                                            contentDescription = "A cat",
                                            contentScale= ContentScale.Crop,
                                            modifier = Modifier
                                                .size(100.dp)
                                                .padding(5.dp)

                                        )
                                        Text(text = "BULL DOG")
                                    }

                                }

                                item {
                                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                        Image(
                                            painter = painterResource(id = R.drawable.dog5) ,
                                            contentDescription = "A cat",
                                            contentScale= ContentScale.Crop,
                                            modifier = Modifier
                                                .size(100.dp)
                                                .padding(5.dp)

                                        )
                                        Text(text = "Dog 4")
                                    }

                                }


                            }
                            Spacer(modifier = Modifier.height(20.dp))

                        }

                    }

                    item {

                        Column(horizontalAlignment = Alignment.CenterHorizontally) {

                            Text(text = "GOLD FISH",color = Color(0xff95ffe7))


                            LazyRow {
                                item {
                                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                        Image(
                                            painter = painterResource(id = R.drawable.gold1) ,
                                            contentDescription = "A cat",
                                            contentScale= ContentScale.Crop,
                                            modifier = Modifier
                                                .size(100.dp)
                                                .padding(5.dp)

                                        )
                                        Text(text = "Gold 1")
                                    }

                                }

                                item{
                                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                        Image(
                                            painter = painterResource(id = R.drawable.gold2) ,
                                            contentDescription = "A cat",
                                            contentScale= ContentScale.Crop,
                                            modifier = Modifier
                                                .size(100.dp)
                                                .padding(5.dp)

                                        )
                                        Text(text = "Gold 2")
                                    }

                                }

                                item {
                                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                        Image(
                                            painter = painterResource(id = R.drawable.gold3) ,
                                            contentDescription = "A cat",
                                            contentScale= ContentScale.Crop,
                                            modifier = Modifier
                                                .size(100.dp)
                                                .padding(5.dp)

                                        )
                                        Text(text = "Gold 3")
                                    }

                                }

                                item {
                                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                        Image(
                                            painter = painterResource(id = R.drawable.gold4) ,
                                            contentDescription = "A cat",
                                            contentScale= ContentScale.Crop,
                                            modifier = Modifier
                                                .size(100.dp)
                                                .padding(5.dp)

                                        )
                                        Text(text = "Gold 4")
                                    }

                                }
                                item {
                                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                        Image(
                                            painter = painterResource(id = R.drawable.gold5) ,
                                            contentDescription = "A cat",
                                            contentScale= ContentScale.Crop,
                                            modifier = Modifier
                                                .size(100.dp)
                                                .padding(5.dp)

                                        )
                                        Text(text = "Gold 5")
                                    }

                                }


                            }
                            Spacer(modifier = Modifier.height(20.dp))



                        }
                    }

                    item {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(text = "HAMSTERS",color = Color(0xff95E2FF))

                            LazyRow {

                                item {
                                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                        Image(
                                            painter = painterResource(id = R.drawable.ham1) ,
                                            contentDescription = "A cat",
                                            contentScale= ContentScale.Crop,
                                            modifier = Modifier
                                                .size(100.dp)
                                                .padding(5.dp)

                                        )
                                        Text(text = "ham 1")
                                    }

                                }

                                item{
                                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                        Image(
                                            painter = painterResource(id = R.drawable.ham2) ,
                                            contentDescription = "A cat",
                                            contentScale= ContentScale.Crop,
                                            modifier = Modifier
                                                .size(100.dp)
                                                .padding(5.dp)

                                        )
                                        Text(text = "ham 2")
                                    }

                                }

                                item {
                                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                        Image(
                                            painter = painterResource(id = R.drawable.ham3) ,
                                            contentDescription = "A cat",
                                            contentScale= ContentScale.Crop,
                                            modifier = Modifier
                                                .size(100.dp)
                                                .padding(5.dp)

                                        )
                                        Text(text = "ham 3")
                                    }

                                }
                                item {
                                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                        Image(
                                            painter = painterResource(id = R.drawable.ham4) ,
                                            contentDescription = "A cat",
                                            contentScale= ContentScale.Crop,
                                            modifier = Modifier
                                                .size(100.dp)
                                                .padding(5.dp)

                                        )
                                        Text(text = "ham 4")
                                    }

                                }
                                item {
                                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                        Image(
                                            painter = painterResource(id = R.drawable.ham5) ,
                                            contentDescription = "A cat",
                                            contentScale= ContentScale.Crop,
                                            modifier = Modifier
                                                .size(100.dp)
                                                .padding(5.dp)

                                        )
                                        Text(text = "ham 5")
                                    }


                                }


                            }

                            Spacer(modifier = Modifier.height(20.dp))

                        }
                    }

















                }





            }

        })



    }

