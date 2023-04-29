package com.example.meme_assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tv1:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv1=findViewById(R.id.tv1)
        tv1.setOnClickListener {
            val intent=Intent(this, meme2::class.java)
            startActivity(intent)
        }
    }
}