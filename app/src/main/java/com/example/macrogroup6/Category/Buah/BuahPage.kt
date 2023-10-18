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
import com.example.macrogroup6.Category.Daging.DagingPage
import com.example.macrogroup6.Category.Sayuran.SayuranCardItem
import com.example.macrogroup6.Category.Sayuran.SayuranPage
import com.example.macrogroup6.R

class BuahPage : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var buahCategoryAdapter: BuahCategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buah_page)

        val textViewSemuaKategori = findViewById<TextView>(R.id.t_semua_kategori)
        val textViewSayuran= findViewById<TextView>(R.id.t_sayuran)
        val textViewDaging= findViewById<TextView>(R.id.t_daging)


        val buahList = mutableListOf(
            BuahCardItem("smoothie pisanga with bayam", R.drawable.smoothie_pisang),
            BuahCardItem("smoothie alpukat with blueberry", R.drawable.smoothie_alpukat),
            BuahCardItem("smoothie bowl", R.drawable.smoothie_bowl),
            BuahCardItem("buah kering ", R.drawable.buah_kering),
            BuahCardItem("salad buah", R.drawable.salad_buah),
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
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
        textViewSayuran.setOnClickListener{
            val intent = Intent(this, SayuranPage::class.java)
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