    package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import jp.wasabeef.glide.transformations.BlurTransformation

    class BelajarScrolllViewActivity : AppCompatActivity() {

        var ivBackground:ImageView? = null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar_scrolll_view)
        ivBackground = findViewById(R.id.IvBackground)

        Glide.with(this)
            .load(R.drawable.oke)
            .transform(BlurTransformation(25,3))
            .into(ivBackground!!)


    }
}