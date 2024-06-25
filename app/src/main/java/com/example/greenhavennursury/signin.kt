package com.example.greenhavennursury

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class signin : AppCompatActivity() {
     lateinit var signbtn :Button
     lateinit var Signupbtn :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signin)
        signbtn = findViewById(R.id.signin)
        Signupbtn = findViewById(R.id.signup)
        signbtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

            Signupbtn.setOnClickListener {
                val intent = Intent(this,signup::class.java)
                startActivity(intent)
                finish()
            }

    }
}