package com.example.practic

import android.content.Intent
import android.os.Bundle


import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



import androidx.activity.ComponentActivity
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val catalog = Intent(this, AddDB::class.java)
        val main = Intent(this, MainActivity::class.java)
        val master = Intent(this, Master::class.java)
        val ourworks = Intent(this, OurWorks::class.java)
        val yourorder = Intent(this, YourOrder::class.java)

        setContent {
            Row (modifier = Modifier
                .background(Color.White)
                .fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceEvenly, ) {

                Row(
                    modifier = Modifier
                        .background(Color.Black)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                )
                {
                    Text(
                        text = "FlowerBar",
                        fontSize = 46.sp,
//                        fontFamily = FontFamily.Cursive,
                        color = Color.White
                    )
                }
            }
            Column (modifier = Modifier
                .fillMaxHeight(0.8f)
                .fillMaxWidth()
                .padding(horizontal = 0.dp, vertical = 56.dp)
            )
            {
                Row() {
                    Button(modifier = Modifier
                        .padding(start = 50.dp, top = 50.dp)
                        .size(150.dp, 153.dp),
                        onClick = {startActivity(catalog)},
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.White,
                            contentColor = Color.Black
                        ),
                        border = BorderStroke(2.dp, Color.Black)
                    )
                    {
                        Column (modifier = Modifier.fillMaxSize()){
                            Image(
                                bitmap = ImageBitmap.imageResource(R.drawable.plus),contentDescription = "Бижутерия")
                            Text("Добавить пожелание",modifier = Modifier
                                .padding(start = 30.dp, top = 0.dp) , fontSize = 14.sp )
                        }}
                    Button(modifier = Modifier
                        .padding(start = 100.dp, top = 50.dp)
                        .size(150.dp, 153.dp),
                        onClick = {startActivity(master)},
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.White,
                            contentColor = Color.Black
                        ),
                        border = BorderStroke(2.dp, Color.Black)
                    )
                    {
                        Column (modifier = Modifier.fillMaxSize()){
                            Image(
                                bitmap = ImageBitmap.imageResource(R.drawable.profile),contentDescription = "Бижутерия")
                            Text("Флористы",modifier = Modifier
                                .padding(start = 34.dp, top = 0.dp) , fontSize = 14.sp )
                        }}
                }
                Row() {


                    Button(modifier = Modifier
                        .padding(start = 50.dp, top = 50.dp)
                        .size(150.dp, 153.dp),
                        onClick = {startActivity(ourworks)},
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.White,
                            contentColor = Color.Black
                        ),
                        border = BorderStroke(2.dp, Color.Black)

                    )

                    {
                        Column (modifier = Modifier.fillMaxSize()) {
                            Image(
                                bitmap = ImageBitmap.imageResource(R.drawable.bouquet),
                                contentDescription = " "
                            )
                            Text(
                                "Вдохновиться", modifier = Modifier
                                    .padding(start = 20.dp, top = 0.dp), fontSize = 14.sp
                            )
                        }
                    }

                    Button(modifier = Modifier
                        .padding(start = 100.dp, top = 50.dp)
                        .size(150.dp, 153.dp),
                        onClick = {startActivity(yourorder)},
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.White,
                            contentColor = Color.Black
                        ),
                        border = BorderStroke(2.dp, Color.Black)
                    )
                    {
                        Column (modifier = Modifier.fillMaxSize()) {
                            Image(
                                bitmap = ImageBitmap.imageResource(R.drawable.order),
                                contentDescription = " "
                            )
                            Text(
                                "Заказы", modifier = Modifier
                                    .padding(start =16.dp, top = 0.dp), fontSize = 14.sp
                            )
                        }
                    }
                }


            }}
    }}