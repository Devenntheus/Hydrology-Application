package com.example.lorawancloud

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(3000)
        installSplashScreen()
        setContentView(R.layout.activity_main)

        // Find all the buttons by their IDs
        val resetButton = findViewById<Button>(R.id.resetButton)
        val preWarningButton = findViewById<Button>(R.id.preWarningButton)
        val redAlertButton = findViewById<Button>(R.id.redAlertButton)
        val allClearButton = findViewById<Button>(R.id.allClearButton)
        val disasterWarningButton = findViewById<Button>(R.id.disasterWarningButton)

        // Set onClickListeners for each button to show a Toast message

        // Reset button click
        resetButton.setOnClickListener {
            Toast.makeText(this, "You clicked the Reset button. Let's start again!", Toast.LENGTH_SHORT).show()
        }

        // Pre Warning button click
        preWarningButton.setOnClickListener {
            Toast.makeText(this, "Pre-warning initiated! Please be cautious.", Toast.LENGTH_SHORT).show()
        }

        // Red Alert button click
        redAlertButton.setOnClickListener {
            Toast.makeText(this, "Red Alert! Immediate action required!", Toast.LENGTH_SHORT).show()
        }

        // All Clear button click
        allClearButton.setOnClickListener {
            Toast.makeText(this, "All Clear! Everything is back to normal.", Toast.LENGTH_SHORT).show()
        }

        // Disaster Warning button click
        disasterWarningButton.setOnClickListener {
            Toast.makeText(this, "Disaster Warning! Take necessary precautions.", Toast.LENGTH_SHORT).show()
        }
    }
}
