package com.example.macrogroup6.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.macrogroup6.Category.Buah.BuahCardItem
import com.example.macrogroup6.R

class BuahCategoryAdapter (private val context: Context, private val BuahList: List<BuahCardItem>) :
    RecyclerView.Adapter<BuahCategoryAdapter.BuahViewHolder>(){

    inner class BuahViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgBuah: ImageView = itemView.findViewById(R.id.imgSayuran)
        val txtNamaBuah: TextView = itemView.findViewById(R.id.txtNamaBuah)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BuahViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_buah_card_item, parent, false)
        return BuahViewHolder(view)
    }

    override fun onBindViewHolder(holder: BuahViewHolder, position: Int) {
        val buah = BuahList [position]
        holder.imgBuah.setImageResource(buah.gambarId)
        holder.txtNamaBuah.text = buah.namaBuah
    }

    override fun getItemCount(): Int {
        return BuahList.size
    }
}