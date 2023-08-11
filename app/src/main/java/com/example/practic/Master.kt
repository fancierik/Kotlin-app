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

class Master : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_master)
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
            Box(modifier = Modifier.background(Color.White).size(50.dp,56.dp,)){
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
            )
            {
                Row(modifier = Modifier.horizontalScroll(ScrollState(0))) {
                    Image(
                        bitmap = ImageBitmap.imageResource(R.drawable.master1),contentDescription = "Master"
                    )
                    Image(
                        bitmap = ImageBitmap.imageResource(R.drawable.master2),contentDescription = "Master"
                    )
                    Image(
                        bitmap = ImageBitmap.imageResource(R.drawable.master13),contentDescription = "Master"
                    )
                    Image(
                        bitmap = ImageBitmap.imageResource(R.drawable.master4),contentDescription = "Master"
                    )
                }

            }
        }
    }
}