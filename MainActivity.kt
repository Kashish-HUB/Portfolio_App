package com.example.portfolio

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val t: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(t)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, started::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.i1 -> {
                Toast.makeText(this, "Home Clicked", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.i2 -> {
                Toast.makeText(this, "Settings Clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.i3 -> {
                Toast.makeText(this, "Contact Clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.i4 -> {
                Toast.makeText(this, "Google Search Clicked", Toast.LENGTH_SHORT).show()
                true
            }

            else -> onOptionsItemSelected(item)
        }
    }
}