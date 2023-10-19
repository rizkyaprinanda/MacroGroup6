package com.example.macrogroup6.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.macrogroup6.Category.Daging.DagingCardItem
import com.example.macrogroup6.R

class DagingCategoryAdapter(private val context: Context, private val DagingList: List<DagingCardItem>) :
    RecyclerView.Adapter<DagingCategoryAdapter.DagingViewHolder>() {

    private var onItemClickListener: OnItemClickListener? = null

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        onItemClickListener = listener
    }

    inner class DagingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgDaging: ImageView = itemView.findViewById(R.id.imgDaging)
        val txtNamaDaging: TextView = itemView.findViewById(R.id.txtNamaDaging)

        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    onItemClickListener?.onItemClick(position)
                }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DagingViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_daging_card_item, parent, false)
        return DagingViewHolder(view)
    }

    override fun onBindViewHolder(holder: DagingViewHolder, position: Int) {
        val buah = DagingList [position]
        holder.imgDaging.setImageResource(buah.gambarDaging)
        holder.txtNamaDaging.text = buah.namaDaging
    }

    override fun getItemCount(): Int {
        return DagingList.size
    }
}