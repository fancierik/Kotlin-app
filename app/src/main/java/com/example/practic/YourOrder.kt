package com.example.practic

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.verticalScroll
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


import androidx.compose.foundation.layout.*

import androidx.compose.ui.Alignment

import androidx.compose.ui.text.style.TextAlign


class YourOrder : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_your_order)
        val main = Intent(this, MainActivity::class.java)
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
            Box(modifier = Modifier
                .background(Color.White)
                .size(50.dp, 56.dp,)){
                Button(modifier = Modifier
                    .fillMaxSize(),
                    onClick = {startActivity(main)},
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.White,
                        contentColor = Color.Black
                    )){
                    Image(
                        bitmap = ImageBitmap.imageResource(R.drawable.strelka),contentDescription = "Стрелка")
                }
            }
            Column (modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .padding(horizontal = 0.dp, vertical = 56.dp)
                .verticalScroll(ScrollState(0))
            )
            {

                Box(
                    modifier = Modifier
                        .padding(start = 35.dp, top = 50.dp)
                        .size(415.dp, 200.dp)
                        .background(Color.LightGray)
                ){
                    Box(
                        modifier = Modifier
                            .padding(start = 35.dp, top = 40.dp)
                            .size(207.5.dp, 200.dp)
                    )
                    {
                        Text(text = "26.03.2023\n" +
                                "\n" +
                                "Букет1\n" +
                                "\n" +
                                "3560 руб",fontSize=18.sp)
                    }
                    Box(
                        modifier = Modifier
                            .padding(start = 250.dp, top = 24.dp)
                            .size(150.dp, 150.dp)
                    )
                    {
                        Image(
                            bitmap = ImageBitmap.imageResource(R.drawable.catalog2),contentDescription = "history"
                        )
                    }

                }
                Box(
                    modifier = Modifier
                        .padding(start = 35.dp, top = 50.dp)
                        .size(415.dp, 200.dp)
                        .background(Color.LightGray),contentAlignment = Alignment.Center)
                {
                    Text(text = "",
                        textAlign = TextAlign.Center,
                        fontSize=23.sp)
                }

                Box(
                    modifier = Modifier
                        .padding(start = 35.dp, top = 50.dp)
                        .size(415.dp, 200.dp)
                        .background(Color.LightGray)
                )
                Box(
                    modifier = Modifier
                        .padding(start = 35.dp, top = 50.dp)
                        .size(415.dp, 200.dp)
                        .background(Color.LightGray)
                )
                Box(
                    modifier = Modifier
                        .padding(start = 35.dp, top = 50.dp)
                        .size(415.dp, 200.dp)
                        .background(Color.LightGray)
                )
                Box(
                    modifier = Modifier
                        .padding(start = 35.dp, top = 50.dp)
                        .size(415.dp, 200.dp)
                        .background(Color.LightGray)
                )
                Box(
                    modifier = Modifier
                        .padding(start = 35.dp, top = 50.dp)
                        .size(415.dp, 200.dp)
                        .background(Color.LightGray)
                )
                Box(
                    modifier = Modifier
                        .padding(start = 35.dp, top = 50.dp)
                        .size(415.dp, 200.dp)
                        .background(Color.LightGray)
                )

            }

        }
    }
}