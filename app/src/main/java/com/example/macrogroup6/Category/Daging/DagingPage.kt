package com.example.macrogroup6.Category.Daging

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.macrogroup6.Adapter.DagingCategoryAdapter
import com.example.macrogroup6.Category.Buah.BuahPage
import com.example.macrogroup6.Category.Buah.CategoryPage
import com.example.macrogroup6.Category.Sayuran.SayuranPage
import com.example.macrogroup6.R

class DagingPage : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dagingCategoryAdapter: DagingCategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daging_page)

        val textViewSemuaKategori = findViewById<TextView>(R.id.tv_semua_kategori)
        val textViewSayuran= findViewById<TextView>(R.id.tv_sayuran)
        val textViewBuah= findViewById<TextView>(R.id.tv_buah)
        val textViewTelur= findViewById<TextView>(R.id.tv_buah)
        val textViewAyam= findViewById<TextView>(R.id.tv_buah)


        val dagingList = mutableListOf(
            DagingCardItem("daging sapi tumis", R.drawable.daging_sapi_tumis),
            DagingCardItem("domba giling panggang", R.drawable.daging_domba_giling),
            DagingCardItem("rendang", R.drawable.daging_rendang),
            DagingCardItem("sate daging sayur ", R.drawable.daging_sate_sayur),
            DagingCardItem("sop daging", R.drawable.daging_sop),
            DagingCardItem("soto daging", R.drawable.daging_soto),
            // Tambahkan item lainnya
        )

        recyclerView = findViewById(R.id.recyclerViewDaging)
        dagingCategoryAdapter = DagingCategoryAdapter(this, dagingList)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = dagingCategoryAdapter


        val sortedDagingList = dagingList.sortedBy { it.gambarDaging} // Sesuaikan dengan atribut indeks yang ada pada SayuranCardItem

        recyclerView = findViewById(R.id.recyclerViewDaging)
        dagingCategoryAdapter = DagingCategoryAdapter(this, sortedDagingList)

        recyclerView.layoutManager = GridLayoutManager(this, 2) // 2 kolom sesuai dengan app:spanCount="2"
        recyclerView.adapter = dagingCategoryAdapter

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
        textViewBuah.setOnClickListener{
            val intent = Intent(this, BuahPage::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
    }
}