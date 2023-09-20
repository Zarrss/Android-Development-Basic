package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.DoaHarian
import com.example.myapplication.model.doadoa

class DoaAdapter(val data: ArrayList<doadoa>)
    :RecyclerView.Adapter<DoaAdapter.doadoaViewHolder>()
{
    class doadoaViewHolder(View:View):
        RecyclerView.ViewHolder(View) {

        val tvbahasaDoa: TextView= View.findViewById(R.id.tvbahasaDoa)
        val ivbahasaDoa: ImageView= View.findViewById(R.id.ivbahasaDoa)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): doadoaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_doa,parent,false)
        return doadoaViewHolder(view)
    }


    override fun getItemCount(): Int=data.size




    override fun onBindViewHolder(holder: doadoaViewHolder, position: Int) {
        val item = data.get(position)

        holder.tvbahasaDoa.text=item.name
        holder.ivbahasaDoa.setImageResource(item.image)
    }



}

private fun ImageView.setImageResource(image: String) {

}
