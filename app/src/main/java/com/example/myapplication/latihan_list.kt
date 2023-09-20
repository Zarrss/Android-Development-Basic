package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class latihan_list : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            "Vanya island", "Ejeldin", "love", "phyton", "c++", "javascript", "ruby"
        )

        var mListView: ListView = findViewById(R.id.LvNama)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, users)

        mListView.adapter = arrayAdapter
    }
}