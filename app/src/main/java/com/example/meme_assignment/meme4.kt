package com.example.meme_assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class meme4 : AppCompatActivity() {
    lateinit var tv7: TextView
    lateinit var tv6: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme4)
        tv7 = findViewById(R.id.tv7)
        tv7.setOnClickListener {
            val intent = Intent(this, meme5::class.java)
            startActivity(intent)
        }
        tv6 = findViewById(R.id.tv6)
        tv6.setOnClickListener {
            val intent = Intent(this, meme3::class.java)
            startActivity(intent)
        }
    }
}