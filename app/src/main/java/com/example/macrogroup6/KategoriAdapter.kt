package com.example.macrogroup6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.projectmakro.databinding.KategoriListBinding

class KategoriAdapter(private val list: List<kategoriModel>) : RecyclerView.Adapter<KategoriAdapter.ViewHolder>() {
    class ViewHolder(val binding : KategoriListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = KategoriListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            with(list[position]){
                binding.imgRvkategori.setImageResource(this.image)
                binding.textRvkategori.text = this.nama

            }
        }
    }

}