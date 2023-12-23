package com.example.hw3// Вторая активити (com.example.hw3.SecondActivity)

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.hw3.R

class SecondActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textViewReceivedText = findViewById<TextView>(R.id.textViewReceivedText)

        val receivedIntent = intent
        if (receivedIntent.hasExtra("TEXT_KEY")) {
            val receivedText = receivedIntent.getStringExtra("TEXT_KEY")
            textViewReceivedText.text = receivedText
        }
    }
}
