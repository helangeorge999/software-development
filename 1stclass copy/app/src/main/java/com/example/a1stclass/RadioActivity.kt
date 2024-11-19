package com.example.a1stclass

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RadioActivity : AppCompatActivity() {
    lateinit var papaya : RadioButton
    lateinit var mango : RadioButton
    lateinit var orange : RadioButton
    lateinit var image: ImageView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_radio)
        papaya = findViewById(R.id.Papaya_radioButton)
        mango = findViewById(R.id.Mango_radioButton)
        orange = findViewById(R.id.Orange_radioButton)
        image = findViewById(R.id.Orange_image)

        papaya.setOnClickListener{
            image.setImageResource(R.drawable.papaya)
        }
        mango.setOnClickListener{
            image.setImageResource(R.drawable.mango)
        }
        orange.setOnClickListener{
            image.setImageResource(R.drawable.orange)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}