package com.example.portfolio

import android.R.attr.data
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class next_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_next)
        val sendButton = findViewById<Button>(R.id.button10)
        sendButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:choudharykashish387@gmail.com")
            }
            startActivity(intent)
        }
        val button1 = findViewById<Button>(R.id.button7)
        button1.setOnClickListener {
            val intent = Intent(this, certifications::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.button8)
        button2.setOnClickListener {
            val intent = Intent(this, training::class.java)
            startActivity(intent)
        }
        val button3 = findViewById<Button>(R.id.button9)
        button3.setOnClickListener {
            val intent = Intent(this, gallery::class.java)
            startActivity(intent)
        }

    }
}