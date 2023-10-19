package com.example.macrogroup6.Category.Ayam

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.macrogroup6.Adapter.AyamCategoryAdapter
import com.example.macrogroup6.Adapter.BuahCategoryAdapter
import com.example.macrogroup6.Category.Buah.BuahCardItem
import com.example.macrogroup6.Category.CategoryPage
import com.example.macrogroup6.Category.Daging.DagingPage
import com.example.macrogroup6.Category.Sayuran.SayuranPage
import com.example.macrogroup6.R

class AyamPage : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var ayamCategoryAdapter: AyamCategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ayam_page)

        val textViewSemuaKategori = findViewById<TextView>(R.id.tca_semua_kategori)
        val textViewSayuran= findViewById<TextView>(R.id.tca_sayuran)
        val textViewDaging= findViewById<TextView>(R.id.tca_daging)


        val ayamList = mutableListOf(
            AyamCardItem("ayam panggang lemon", R.drawable.ayam_panggang_leomon),
            AyamCardItem("salad ayam panggang", R.drawable.salad_ayam_panggang),
            AyamCardItem("kari ayam", R.drawable.ayam_kari),
            AyamCardItem("tumis ayam ", R.drawable.tumis_ayam),
            AyamCardItem("kari ayam", R.drawable.ayam_kari),
            AyamCardItem("ayam panggang lemon", R.drawable.ayam_panggang_leomon),
            // Tambahkan item lainnya
        )

        recyclerView = findViewById(R.id.recyclerViewAyam)
        ayamCategoryAdapter = AyamCategoryAdapter(this, ayamList)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ayamCategoryAdapter


        val sortedAyamList = ayamList.sortedBy { it.namaAyam} // Sesuaikan dengan atribut indeks yang ada pada SayuranCardItem

        recyclerView = findViewById(R.id.recyclerViewAyam)
        ayamCategoryAdapter = AyamCategoryAdapter(this, sortedAyamList)

        recyclerView.layoutManager = GridLayoutManager(this, 2) // 2 kolom sesuai dengan app:spanCount="2"
        recyclerView.adapter = ayamCategoryAdapter

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