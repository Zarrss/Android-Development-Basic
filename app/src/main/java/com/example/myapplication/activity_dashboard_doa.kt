package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapter.DoaAdapter
import com.example.myapplication.model.DoaHarian
import com.example.myapplication.model.doadoa

class  activity_dashboard_doa : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_doa)
        val rvdoa:RecyclerView = findViewById(R.id.rvdoa)

        val cvSelengkapnya:Button = findViewById(R.id.Selengkapnya)
        cvSelengkapnya.setOnClickListener{
            val intent=
                Intent(this,DoaHarianActivity::class.java)
            startActivity(intent)
        }

        val data = arrayListOf<doadoa>(
            doadoa("Doa Makan",R.drawable.doa_harian2),
            doadoa("Doa Tidur",R.drawable.doa_harian2),
            doadoa("Doa Sayang ibu",R.drawable.doa_harian2),
            doadoa("Niat Puasa",R.drawable.doa_harian2),
            doadoa("Niat Sholat Wajib",R.drawable.doa_harian2)
        )
        val adapter = DoaAdapter(data)
        rvdoa.adapter = adapter
        rvdoa.layoutManager =
            LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false)
    }
}