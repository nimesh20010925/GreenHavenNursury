package com.example.greenhavennursury

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class flashScreen : AppCompatActivity() {
    private val SPASH_TIIME :Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flash_screen)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this,onborading1::class.java))
            finish()
        },SPASH_TIIME)
    }
}