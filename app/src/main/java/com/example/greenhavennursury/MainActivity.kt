package com.example.greenhavennursury


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



import androidx.fragment.app.Fragment
import com.example.greenhavennursury.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Home())

        binding.bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> replaceFragment(Home())
                R.id.message -> replaceFragment(Message())
                R.id.cart -> replaceFragment(Cart())
                R.id.profile -> replaceFragment(Profile())
                else -> { }
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }
}