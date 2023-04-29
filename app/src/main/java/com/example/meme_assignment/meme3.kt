package com.example.meme_assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class meme3 : AppCompatActivity() {
    lateinit var tv5: TextView
    lateinit var tv4: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme3)
        tv5= findViewById(R.id.tv5)
        tv5.setOnClickListener {
            val intent = Intent(this, meme4::class.java)
            startActivity(intent)
        }
        tv4 = findViewById(R.id.tv4)
        tv4.setOnClickListener {
            val intent = Intent(this, meme2::class.java)
            startActivity(intent)
        }
    }
}