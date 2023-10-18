package com.example.macrogroup6.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.macrogroup6.Category.Sayuran.SayuranCardItem
import com.example.macrogroup6.R

class SubCategoryAdapter(private val context: Context, private val sayuranList: List<SayuranCardItem>) :
    RecyclerView.Adapter<SubCategoryAdapter.SayuranViewHolder>() {

    inner class SayuranViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgSayuran: ImageView = itemView.findViewById(R.id.imgSayuran)
        val txtNamaSayuran: TextView = itemView.findViewById(R.id.txtNamaSayuran)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SayuranViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.sayuran_card_item, parent, false)
        return SayuranViewHolder(view)
    }
// tes command
    override fun onBindViewHolder(holder: SayuranViewHolder, position: Int) {
        val sayuran = sayuranList[position]
        holder.imgSayuran.setImageResource(sayuran.gambarResId)
        holder.txtNamaSayuran.text = sayuran.namaSayuran
    }

    override fun getItemCount(): Int {
        return sayuranList.size
    }
}
