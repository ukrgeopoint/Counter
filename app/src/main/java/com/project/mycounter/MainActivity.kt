package com.project.mycounter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// Set View
        val textResult: TextView = findViewById(R.id.textResult)

        val buttonPlus: Button = findViewById(R.id.buttonPlus)
        val buttonMinus: Button = findViewById(R.id.buttonMinus)

// Use View
        var count = 0

        buttonPlus.setOnClickListener {
            count += 1
            textResult.text = count.toString()
        }

        buttonMinus.setOnClickListener {
            if (count <= 1) {
                Toast.makeText(this, "The value is less than one!", Toast.LENGTH_SHORT).show()
            } else {
                count -= 1
                textResult.text = count.toString()
            }
        }
    }
}