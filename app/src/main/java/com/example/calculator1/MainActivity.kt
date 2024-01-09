package com.example.calculator1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button1)?.setOnClickListener {
            val Result = findViewById<TextView>(R.id.textView1)
            val input1 = findViewById<EditText>(R.id.et1)
            val input2 = findViewById<EditText>(R.id.et2)

            val value1 = input1.text.toString().toInt()
            val value2 = input2.text.toString().toInt()

            Result.text = (value1 + value2).toString()

        }

        findViewById<Button>(R.id.button2)?.setOnClickListener {
            val Result = findViewById<TextView>(R.id.textView1)
            val input1 = findViewById<EditText>(R.id.et1)
            val input2 = findViewById<EditText>(R.id.et2)

            val value1 = input1.text.toString().toInt()
            val value2 = input2.text.toString().toInt()

            Result.text = (value1 - value2).toString()

        }
        findViewById<Button>(R.id.button3)?.setOnClickListener {
            val Result = findViewById<TextView>(R.id.textView1)
            val input1 = findViewById<EditText>(R.id.et1)
            val input2 = findViewById<EditText>(R.id.et2)

            val value1 = input1.text.toString().toInt()
            val value2 = input2.text.toString().toInt()

            Result.text = (value1 * value2).toString()

        }

        findViewById<Button>(R.id.button4)?.setOnClickListener {
            val Result = findViewById<TextView>(R.id.textView1)
            val input1 = findViewById<EditText>(R.id.et1)
            val input2 = findViewById<EditText>(R.id.et2)

            val value1 = input1.text.toString().toInt()
            val value2 = input2.text.toString().toInt()

            Result.text = (value1 / value2).toString()

        }
    }
}