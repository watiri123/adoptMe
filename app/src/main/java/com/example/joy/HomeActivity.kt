package com.example.joy

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material3.TopAppBarDefaults
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
                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.DarkGray)
            )
        }, content = {
           
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.DarkGray),

                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                LazyColumn {

                    item {

                        Row1(
                            modifier = Modifier
                                .size(30.dp),
                            verticalAlignment = Alignment.Top,
                            horizontalArrangement = Arrangement.End,

                            ){
                            Image(painter = painterResource(id = R.drawable.loc), contentDescription = null)

                        }
                    }

                    item {

                        Row1(
                            modifier = Modifier
                                .size(30.dp),
                            verticalAlignment = Alignment.Top,
                            horizontalArrangement = Arrangement.End,

                            ){
                            Image(painter = painterResource(id = R.drawable.loc), contentDescription = null)

                        }
                    }

                    

















                }





            }

        })



    }

