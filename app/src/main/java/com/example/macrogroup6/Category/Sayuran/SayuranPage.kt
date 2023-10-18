package com.example.macrogroup6.Category.Sayuran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.macrogroup6.Adapter.SubCategoryAdapter
import com.example.macrogroup6.Category.Buah.BuahPage
import com.example.macrogroup6.Category.CategoryPage
import com.example.macrogroup6.Category.Daging.DagingPage
import com.example.macrogroup6.R

class SayuranPage : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var subCategoryAdapter: SubCategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sayuran_page)

        val textViewSemuaKategori = findViewById<TextView>(R.id.tx_semua_kategori)
        val textViewBuah= findViewById<TextView>(R.id.tx_buah)
        val textViewDaging= findViewById<TextView>(R.id.tx_daging)


        val sayuranList = mutableListOf(
            SayuranCardItem("salad tumis", R.drawable.salad_tumis),
            SayuranCardItem("salad sayur", R.drawable.salad_sayur),
            SayuranCardItem("capcay udang", R.drawable.capcay_udang),
            SayuranCardItem("sayur sop", R.drawable.sayur_sop),
            SayuranCardItem("sayur lodeh", R.drawable.sayur_lodeh),
            SayuranCardItem("sayur asem", R.drawable.sayur_asem),
            // Tambahkan item lainnya
        )

        recyclerView = findViewById(R.id.recyclerViewSayuran)
        subCategoryAdapter = SubCategoryAdapter(this, sayuranList)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = subCategoryAdapter


        val sortedSayuranList = sayuranList.sortedBy { it.gambarResId } // Sesuaikan dengan atribut indeks yang ada pada SayuranCardItem

        recyclerView = findViewById(R.id.recyclerViewSayuran)
        subCategoryAdapter = SubCategoryAdapter(this, sortedSayuranList)

        recyclerView.layoutManager = GridLayoutManager(this, 2) // 2 kolom sesuai dengan app:spanCount="2"
        recyclerView.adapter = subCategoryAdapter

//        fungsi untuk click kategori di bawah search view

        textViewSemuaKategori.setOnClickListener{
            val intent = Intent(this, CategoryPage::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
        textViewBuah.setOnClickListener{
            val intent = Intent(this, BuahPage::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
        textViewDaging.setOnClickListener{
            val intent = Intent(this, DagingPage::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
    }


}