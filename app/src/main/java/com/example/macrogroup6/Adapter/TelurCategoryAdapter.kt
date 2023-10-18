package com.example.macrogroup6.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.macrogroup6.Category.Daging.DagingCardItem
import com.example.macrogroup6.Category.Telur.TelurCardItem
import com.example.macrogroup6.R

class TelurCategoryAdapter (private val context: Context, private val TelurList: List<TelurCardItem>) :
    RecyclerView.Adapter<TelurCategoryAdapter.TelurViewHolder>(){

    inner class TelurViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgTelur: ImageView = itemView.findViewById(R.id.imgTelur)
        val txtNamaTelur: TextView = itemView.findViewById(R.id.txtNamaTelur)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TelurViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_telur_card_item, parent, false)
        return TelurViewHolder(view)
    }

    override fun onBindViewHolder(holder: TelurViewHolder, position: Int) {
        val buah = TelurList [position]
        holder.imgTelur.setImageResource(buah.gambarTelur)
        holder.txtNamaTelur.text = buah.namaTelur
    }

    override fun getItemCount(): Int {
        return TelurList.size
    }
}