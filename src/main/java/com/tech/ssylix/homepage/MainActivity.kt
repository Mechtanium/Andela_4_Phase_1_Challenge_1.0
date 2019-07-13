package com.tech.ssylix.homepage

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        about_alc.setOnClickListener {
            startActivity(Intent(this, AboutALC::class.java))
        }

        my_profile.setOnClickListener {
            startActivity(Intent(this, MyProfile::class.java))
        }
    }
}
