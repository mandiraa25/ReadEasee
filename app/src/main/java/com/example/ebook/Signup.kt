package com.example.ebook

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Find the button and set an onClickListener
        val exploreButton: Button = findViewById(R.id.buttonlog)
        exploreButton.setOnClickListener {

            Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show()
            // Navigate to ScreenThree
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }
}