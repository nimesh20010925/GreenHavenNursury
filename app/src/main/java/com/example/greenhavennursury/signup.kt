package com.example.greenhavennursury

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class signup : AppCompatActivity() {
    lateinit var signinbtn : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        signinbtn = findViewById(R.id.navsignin)
    signinbtn.setOnClickListener {
        val intent =Intent(this,signin::class.java)
        startActivity(intent)
        finish()
    }
    }

}