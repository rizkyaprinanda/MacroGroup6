package com.example.macrogroup6.Category.Buah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.macrogroup6.Adapter.BuahCategoryAdapter
import com.example.macrogroup6.Adapter.CategoryAdapter
import com.example.macrogroup6.Adapter.SubCategoryAdapter
import com.example.macrogroup6.Category.CategoryModel
import com.example.macrogroup6.Category.CategoryPage
import com.example.macrogroup6.Category.Sayuran.SayuranCardItem
import com.example.macrogroup6.Category.Sayuran.SayuranPage
import com.example.macrogroup6.R

class BuahPage : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var buahCategoryAdapter: BuahCategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buah_page)

        val textViewSemuaKategori = findViewById<TextView>(R.id.txt_semua_kategori)
        val textViewSayuran= findViewById<TextView>(R.id.txt_sayuran)
        val textViewDaging= findViewById<TextView>(R.id.txt_sayuran)

        val buahList = mutableListOf(
            BuahCardItem("salad tumis", R.drawable.salad_tumis),
            BuahCardItem("salad sayur", R.drawable.salad_sayur),
            BuahCardItem("capcay udang", R.drawable.capcay_udang),
            BuahCardItem("sayur sop", R.drawable.sayur_sop),
            BuahCardItem("sayur lodeh", R.drawable.sayur_lodeh),
            BuahCardItem("sayur asem", R.drawable.sayur_asem),
            // Tambahkan item lainnya
        )

        recyclerView = findViewById(R.id.recyclerViewBuah)
        buahCategoryAdapter = BuahCategoryAdapter(this, buahList)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = buahCategoryAdapter


        val sortedBuahList = buahList.sortedBy { it.gambarId} // Sesuaikan dengan atribut indeks yang ada pada SayuranCardItem

        recyclerView = findViewById(R.id.recyclerViewBuah)
        buahCategoryAdapter = BuahCategoryAdapter(this, sortedBuahList)

        recyclerView.layoutManager = GridLayoutManager(this, 2) // 2 kolom sesuai dengan app:spanCount="2"
        recyclerView.adapter = buahCategoryAdapter

//        fungsi untuk click kategori di bawah search view

        textViewSemuaKategori.setOnClickListener{
            val intent = Intent(this, CategoryPage::class.java)
            startActivity(intent)
        }
        textViewSayuran.setOnClickListener{
            val intent = Intent(this, SayuranPage::class.java)
            startActivity(intent)
        }



    }
}