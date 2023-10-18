package com.example.macrogroup6.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.macrogroup6.Category.Ayam.AyamCardItem
import com.example.macrogroup6.R


class AyamCategoryAdapter (private val context: Context, private val AyamList: List<AyamCardItem>) :
    RecyclerView.Adapter<AyamCategoryAdapter.AyamViewHolder>(){

    inner class AyamViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgAyam: ImageView = itemView.findViewById(R.id.imgAyam)
        val txtNamaAyam: TextView = itemView.findViewById(R.id.txtNamaAyam)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AyamViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_ayam_card_item, parent, false)
        return AyamViewHolder(view)
    }

    override fun onBindViewHolder(holder: AyamViewHolder, position: Int) {
        val ayam = AyamList [position]
        holder.imgAyam.setImageResource(ayam.gambarAyam)
        holder.txtNamaAyam.text = ayam.namaAyam
    }

    override fun getItemCount(): Int {
        return AyamList.size
    }
}