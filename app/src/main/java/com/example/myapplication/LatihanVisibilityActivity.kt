package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class LatihanVisibilityActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_visibility)
        val TvText:TextView = findViewById(R.id.TvText)
        val BtnCLick:Button = findViewById(R.id.BtnCLick)
        // event click




        BtnCLick.setOnClickListener{
            if(TvText.visibility== View.VISIBLE) {
                TvText.visibility = View.INVISIBLE
            }else {
                TvText.visibility = View.VISIBLE
            }

                }

        }


    }
