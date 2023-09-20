package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapter.LanguageAdapter
import com.example.myapplication.model.Language

class ListPemogramanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_pemograman)
        val rvbahasapemograman:RecyclerView = findViewById(R.id.rvBahasaPemograman)
        val data = arrayListOf<Language>(
            Language("Vanya",R.drawable.vanya),
            Language("Cakep",R.drawable.nigga),
            Language("banget",R.drawable.vanya),
            Language("gelo",R.drawable.black),
            Language("phyton",R.drawable.python),
            Language("c++",R.drawable.cplus),
            Language("phyton",R.drawable.python),
            Language("c++",R.drawable.cplus),
            Language("Vanya",R.drawable.vanya)
        )
        val adapter = LanguageAdapter(data)
        rvbahasapemograman.adapter = adapter
        rvbahasapemograman.layoutManager =
            LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false)
    }
}