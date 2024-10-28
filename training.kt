package com.example.portfolio

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class training : AppCompatActivity() {

    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_training)

        imageView = findViewById(R.id.imageView)

        findViewById<Button>(R.id.button14).setOnClickListener {
            showImage() // Call the function to show the image
        }
    }

    private fun showImage() {
        imageView.setImageResource(R.drawable.certificate) // Replace with your image resource
        imageView.visibility = View.VISIBLE // Make the image view visible
    }
}
