package com.example.meme_assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class meme5 : AppCompatActivity() {
    lateinit var tv8:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme5)
        tv8 = findViewById(R.id.tv8)
        tv8.setOnClickListener {
            val intent = Intent(this, meme4::class.java)
            startActivity(intent)
        }
    }
}