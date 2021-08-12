package com.example.helloworld

// custom imports
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.concurrent.schedule

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {

            Toast.makeText(this@MainActivity, "Thank you for clicking me. Goodbye.", Toast.LENGTH_LONG).show()
            Timer().schedule(4000){finishAffinity()}

        }

    }


}