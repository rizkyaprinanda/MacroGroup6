package com.example.macrogroup6.Category.Sayuran

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.macrogroup6.Adapter.SubCategoryAdapter
import com.example.macrogroup6.R

class SayuranPage : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var subCategoryAdapter: SubCategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sayuran_page)

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
    }
}