package com.example.greenhavennursury

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class onborading2 : AppCompatActivity() {

    lateinit var nextBtn : Button
    lateinit var prevBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onborading2)

        nextBtn = findViewById(R.id.buttonNext)

        nextBtn.setOnClickListener{
            val intent = Intent(this, GetStarted::class.java)

            startActivity(intent)

            finish()
        }

        prevBtn = findViewById(R.id.buttonBack)

        prevBtn.setOnClickListener{
            val intent = Intent(this, onborading1::class.java)

            startActivity(intent)

            finish()
        }
    }
}