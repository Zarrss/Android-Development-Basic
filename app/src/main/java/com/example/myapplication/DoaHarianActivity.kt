package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapter.DoaHarianAdapter
import com.example.myapplication.adapter.LanguageAdapter
import com.example.myapplication.model.DoaHarian
import com.example.myapplication.model.Language
import com.example.myapplication.model.doadoa

class DoaHarianActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_harian)

        val rvDoaHarian: RecyclerView = findViewById(R.id.rvDoaharian)
        val data = arrayListOf<DoaHarian>(
            DoaHarian("Doa Melepas pakain","بِسْمِ اللهِ الَّذِيْ لاَ إِلَهَ إِلَّا هُوَُ","Bismillaahil ladzii laa ilaaha illaa huwa"),
            DoaHarian("Doa Melepas pakain","بِسْمِ اللهِ الَّذِيْ لاَ إِلَهَ إِلَّا هُوَُ","Bismillaahil ladzii laa ilaaha illaa huwa"),
            DoaHarian("Doa Melepas pakain","بِسْمِ اللهِ الَّذِيْ لاَ إِلَهَ إِلَّا هُوَُ","Bismillaahil ladzii laa ilaaha illaa huwa"),
            DoaHarian("Doa Melepas pakain","بِسْمِ اللهِ الَّذِيْ لاَ إِلَهَ إِلَّا هُوَُ","Bismillaahil ladzii laa ilaaha illaa huwa"),
            DoaHarian("Doa Melepas pakain","بِسْمِ اللهِ الَّذِيْ لاَ إِلَهَ إِلَّا هُوَُ","Bismillaahil ladzii laa ilaaha illaa huwa")
        )


        val adapter = DoaHarianAdapter(data)
        rvDoaHarian.adapter = adapter
        rvDoaHarian.layoutManager =
            LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false)
    }
}