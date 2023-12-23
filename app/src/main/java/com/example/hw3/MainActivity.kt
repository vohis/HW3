package com.example.hw3// Первая активити (com.example.hw3.MainActivity)

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextText = findViewById<EditText>(R.id.editTextText)
        val editTextNumber = findViewById<EditText>(R.id.editTextNumber)
        val sendTextButton = findViewById<Button>(R.id.sendTextButton)
        val dialNumberButton = findViewById<Button>(R.id.dialNumberButton)

        sendTextButton.setOnClickListener {
            val textToSend = editTextText.text.toString()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("TEXT_KEY", textToSend)
            startActivity(intent)
        }

        dialNumberButton.setOnClickListener {
            val phoneNumber = editTextNumber.text.toString()

            if (phoneNumber.isNotEmpty()) {
                val dialIntent = Intent(Intent.ACTION_DIAL)
                dialIntent.data = android.net.Uri.parse("tel:$phoneNumber")
                startActivity(dialIntent)
            }
        }
    }
}
