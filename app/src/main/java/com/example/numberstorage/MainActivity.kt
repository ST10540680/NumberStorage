package com.example.numberstorage

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //Declaration of the array
    val number = arrayOf(10)

    //counter to track which element to store the next
    val counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Declaring variables
        val edtNum = findViewById<EditText>(R.id.edtNum)
        val edtAdd = findViewById<Button>(R.id.edtAdd)
        val edtAvg = findViewById<Button>(R.id.edtAvg)
        val txtAvg = findViewById<TextView>(R.id.txtAvg)

        //

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}