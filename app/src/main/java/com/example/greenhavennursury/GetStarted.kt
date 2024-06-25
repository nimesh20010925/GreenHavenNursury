package com.example.greenhavennursury

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GetStarted : AppCompatActivity() {
    lateinit var GetStartedclick : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started)
        GetStartedclick = findViewById(R.id.GetStartedbtn)
        GetStartedclick.setOnClickListener {
            val intent = Intent(this, signin::class.java)
            startActivity(intent)
            finish()
        }
    }
}