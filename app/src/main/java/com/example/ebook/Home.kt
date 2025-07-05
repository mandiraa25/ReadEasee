package com.example.ebook

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find the button and set an onClickListener
        val BookOneImg: ImageView = findViewById(R.id.bkone)
        BookOneImg.setOnClickListener {
            // Navigate to ScreenThree
            val intent = Intent(this, BookOne::class.java)
            startActivity(intent)
        }

        // Find the button and set an onClickListener
        val BookTwoImg: ImageView = findViewById(R.id.bktwo)
        BookTwoImg.setOnClickListener {
            // Navigate to ScreenThree
            val intent = Intent(this, BookTwo::class.java)
            startActivity(intent)
        }

        // Find the button and set an onClickListener
        val BookThreeImg: ImageView = findViewById(R.id.bkthree)
        BookThreeImg.setOnClickListener {
            // Navigate to ScreenThree
            val intent = Intent(this, BookThree::class.java)
            startActivity(intent)
        }

        // Find the button and set an onClickListener
        val BookFourImg: ImageView = findViewById(R.id.bkfour)
        BookFourImg.setOnClickListener {
            // Navigate to ScreenThree
            val intent = Intent(this, BookFour::class.java)
            startActivity(intent)
        }

        // Find the button and set an onClickListener
        val BookFiveImg: ImageView = findViewById(R.id.bkfive)
        BookFiveImg.setOnClickListener {
            // Navigate to ScreenThree
            val intent = Intent(this, BookFive::class.java)
            startActivity(intent)
        }

        // Find the button and set an onClickListener
        val BookSixImg: ImageView = findViewById(R.id.bksix)
        BookSixImg.setOnClickListener {
            // Navigate to ScreenThree
            val intent = Intent(this, BookSix::class.java)
            startActivity(intent)
        }

        // Find the Get Start button by its ID
        val startButton = findViewById<Button>(R.id.button2)

        // Set a click listener on the Get Start button
        startButton.setOnClickListener {
            // Create an Intent to navigate to MainActivity2
            val intent = Intent(this, Selfhelp::class.java)
            // Start the MainActivity2
            startActivity(intent)
        }


            // Find the Get Start button by its ID
            val imageView = findViewById<ImageView>(R.id.imageView3)

            // Set a click listener on the Get Start button
            startButton.setOnClickListener {
                // Create an Intent to navigate to Page2Activity
                val intent = Intent(this, profile::class.java)
                // Start the Page2Activity
                startActivity(intent)
            }

        }
    }
