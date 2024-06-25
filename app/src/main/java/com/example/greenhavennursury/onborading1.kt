package com.example.greenhavennursury

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class onborading1 : AppCompatActivity() {

    lateinit var nextBtn : Button
    lateinit var skipBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onborading1)

        nextBtn = findViewById(R.id.buttonNext)

        nextBtn.setOnClickListener{
            val intent = Intent(this, onborading2::class.java)

            startActivity(intent)

            finish()
        }

        skipBtn = findViewById(R.id.buttonSkip)

        skipBtn.setOnClickListener{
            val intent = Intent(this, GetStarted::class.java)

            startActivity(intent)

            finish()
        }
    }
}