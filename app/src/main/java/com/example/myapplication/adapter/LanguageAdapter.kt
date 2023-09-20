package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.compose.ui.layout.Layout
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.Language

class LanguageAdapter (val data:ArrayList<Language>)
    :RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder>()
{
    class LanguageViewHolder(View:View):
        RecyclerView.ViewHolder(View) {

        val tvbahasapemogagraman: TextView= View.findViewById(R.id.tvbahasapemogagraman)
        val ivbahasapemogagraman: ImageView= View.findViewById(R.id.ivbahasapemograman)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
     val view = LayoutInflater.from(parent.context)
         .inflate(R.layout.item_bahasa_pemograman2,parent,false)
        return LanguageViewHolder(view)
    }

    override fun getItemCount(): Int=data.size




    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
      val item = data.get(position)

        holder.tvbahasapemogagraman.text=item.name
        holder.ivbahasapemogagraman.setImageResource(item.gambar)
    }



}