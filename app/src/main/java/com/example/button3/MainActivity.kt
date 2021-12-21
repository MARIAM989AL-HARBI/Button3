package com.example.button3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText = findViewById<EditText>(R.id.editText)
        val output = findViewById<TextView>(R.id.output)
        val ADD = findViewById<Button>(R.id.add)
        val button2 = findViewById<Button>(R.id.button2)

        button2.setOnClickListener {
            Toast.makeText(this, "hi mariam", Toast.LENGTH_LONG).show()


            ADD.setOnClickListener {
                output.text = editText.text.toString()


                }
            }
        }
    }
