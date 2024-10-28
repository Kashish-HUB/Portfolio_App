package com.example.portfolio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class started : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_started)

        val button1 = findViewById<Button>(R.id.button2)
        button1.setOnClickListener {
            val intent = Intent(this, personal::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.button5)
        button2.setOnClickListener {
            val intent = Intent(this, education::class.java)
            startActivity(intent)
        }

        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val intent = Intent(this, contact::class.java)
            startActivity(intent)
        }

        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            val intent = Intent(this, skills::class.java)
            startActivity(intent)
        }

        val nextButton = findViewById<Button>(R.id.button6)
        nextButton.setOnClickListener {
            val intent = Intent(this, next_activity::class.java)
            startActivity(intent)
        }
            }
        }