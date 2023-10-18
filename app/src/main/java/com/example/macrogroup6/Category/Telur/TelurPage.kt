package com.example.macrogroup6.Category.Telur

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.macrogroup6.Adapter.BuahCategoryAdapter
import com.example.macrogroup6.Adapter.TelurCategoryAdapter
import com.example.macrogroup6.Category.Buah.BuahCardItem
import com.example.macrogroup6.Category.CategoryPage
import com.example.macrogroup6.Category.Daging.DagingPage
import com.example.macrogroup6.Category.Sayuran.SayuranPage
import com.example.macrogroup6.R

class TelurPage : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var telurCategoryAdapter: TelurCategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telur_page)

        val textViewSemuaKategori = findViewById<TextView>(R.id.teks_semua_kategori)
        val textViewSayuran= findViewById<TextView>(R.id.teks_sayuran)
        val textViewDaging= findViewById<TextView>(R.id.teks_daging)



        val telurList = mutableListOf(
            TelurCardItem("omelet sayur", R.drawable.omelet_sayur),
            TelurCardItem("telur rebus", R.drawable.telur_rebus),
            TelurCardItem("fritatta telur", R.drawable.fritatta_keju),
            TelurCardItem("telur panggang alpukat ", R.drawable.telur_panggang),
            TelurCardItem("salad telur", R.drawable.gado_gado),
            TelurCardItem("telur asin", R.drawable.telur_asin),
            // Tambahkan item lainnya
        )

        recyclerView = findViewById(R.id.recyclerViewTelur)
        telurCategoryAdapter = TelurCategoryAdapter(this, telurList)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = telurCategoryAdapter


        val sortedTelurList = telurList.sortedBy { it.gambarTelur} // Sesuaikan dengan atribut indeks yang ada pada SayuranCardItem

        recyclerView = findViewById(R.id.recyclerViewTelur)
        telurCategoryAdapter = TelurCategoryAdapter(this, sortedTelurList)

        recyclerView.layoutManager = GridLayoutManager(this, 2) // 2 kolom sesuai dengan app:spanCount="2"
        recyclerView.adapter = telurCategoryAdapter

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