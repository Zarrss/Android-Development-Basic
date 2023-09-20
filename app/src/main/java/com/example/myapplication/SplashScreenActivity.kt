package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        //panggil object handler dari package os
        // fungsi nya menjalakan action ketika waktunya yang ditentukan telah selesai
        Handler().postDelayed({
            val intent = Intent(this,activity_dashboard_doa::class.java)
            startActivity(intent)
        },6000)
    }
}