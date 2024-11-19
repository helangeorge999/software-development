package com.example.a1stclass

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class login_activity : AppCompatActivity() {
    lateinit var name : EditText
    lateinit var button : Button
    lateinit var display : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login2)

        name = findViewById(R.id.editName)
        button = findViewById(R.id.Submit_button)
        display = findViewById(R.id.editTextTextEmailAddress)

        button.setOnClickListener{
            val data : String = name.text.toString()
            display.text= data
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}