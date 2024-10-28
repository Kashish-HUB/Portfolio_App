package com.example.portfolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class contact : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_contact)
        val btn1=findViewById<Button>(R.id.button12)
        btn1.setOnClickListener{
            val i1= Intent(Intent.ACTION_VIEW).apply{
                data=Uri.parse("https://www.linkedin.com/in/kashishchoudhary")
            }
            startActivity(i1)
        }
        val btn2=findViewById<Button>(R.id.button11)
        btn2.setOnClickListener{
            val i2= Intent(Intent.ACTION_VIEW).apply{
            data=Uri.parse("https://github.com/kashish")
            }
            startActivity(i2)
        }
    }
}