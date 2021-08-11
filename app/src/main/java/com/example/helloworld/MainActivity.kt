package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// custom imports
import android.widget.Toast
import android.widget.TextView
import android.widget.Button




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // counter
        var timesClicked = 0

// set on-click listener
        button.setOnClickListener {
            timesClicked += 1
            textView.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        }
    }
}