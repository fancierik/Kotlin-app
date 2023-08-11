package com.example.practic

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.lifecycle.asLiveData
import com.example.practic.databinding.ActivityMainBinding

class AddDB : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val main = Intent(this, MainActivity::class.java)
        setContent {

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val db = MainDb.getDb(this)
        db.getDao().getAllItem().asLiveData().observe(this){ list->
            binding.tvList.text = ""
            list.forEach {
                val text = " ${it.id}          ${it.name}        ${it.price}\n"
                binding.tvList.append(text)
            }
        }
        binding.button2.setOnClickListener {
            val item = Item(null,
                binding.edName.text.toString(),
                binding.edPrice.text.toString()
            )
            Thread{
                db.getDao().insertItem(item)
            }.start()
        }
        binding.button3.setOnClickListener {
            val item = Item(null,
                binding.edName.text.toString(),
                binding.edPrice.text.toString()
            )
            Thread{
                db.getDao().deleteAllItem()
            }.start()
        }
            binding.button4.setOnClickListener{startActivity(main)}
}}}