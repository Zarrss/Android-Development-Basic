package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.DoaHarian
import com.example.myapplication.model.doadoa

class DoaHarianAdapter(val data:ArrayList<DoaHarian>)
    : RecyclerView.Adapter
<DoaHarianAdapter.DoaHarianViewHolder> ()

{

    class DoaHarianViewHolder(view: View) : RecyclerView.ViewHolder(view)

    {
        val tvjudulDoa:TextView = view.findViewById(R.id.TvJudulDoa)
        val tvdDoaArab:TextView = view.findViewById(R.id.tvDoaArab)
        val tvdDoaLatin:TextView = view.findViewById(R.id.tvDoalatin)
        val ibcollapse:ImageButton = view.findViewById(R.id.ibCollapse)
        val rIsidoa:RelativeLayout =view.findViewById(R.id.rIsiDoa)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoaHarianViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_doa_harian, parent, false)
        return DoaHarianViewHolder(view)

    }



        override fun onBindViewHolder(holder: DoaHarianViewHolder, position: Int) {
            val item = data.get(position)
            holder.tvjudulDoa.text = item.judul
            holder.tvdDoaArab.text = item.textArab
            holder.tvdDoaLatin.text = item.textLatin
            holder.ibcollapse.setOnClickListener{
                if (holder.rIsidoa.visibility == View.GONE){
                    holder.rIsidoa.visibility = View.VISIBLE
                }else{
                    holder.rIsidoa.visibility = View.GONE
                }
            }
        }

        override fun getItemCount(): Int = data.size

        }



