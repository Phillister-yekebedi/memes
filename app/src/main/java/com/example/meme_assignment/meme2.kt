package com.example.meme_assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class meme2 : AppCompatActivity() {
    lateinit var tv3: TextView
    lateinit var tv2: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme2)
        tv3 = findViewById(R.id.tv3)
        tv3.setOnClickListener {
            val intent = Intent(this, meme3::class.java)
            startActivity(intent)
        }
        tv2 = findViewById(R.id.tv2)
        tv2.setOnClickListener {
            val intent = Intent(this, meme2::class.java)
            startActivity(intent)
        }
    }
}