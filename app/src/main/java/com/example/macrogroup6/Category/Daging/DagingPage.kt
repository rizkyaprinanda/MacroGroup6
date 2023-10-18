package com.example.macrogroup6.Category.Daging

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.macrogroup6.Adapter.DagingCategoryAdapter
import com.example.macrogroup6.Adapter.SubCategoryAdapter
import com.example.macrogroup6.Category.Buah.BuahPage
import com.example.macrogroup6.Category.CategoryPage
import com.example.macrogroup6.Category.Sayuran.SayuranPage
import com.example.macrogroup6.DetailProdukActivity
import com.example.macrogroup6.R

class DagingPage : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var subCategoryAdapter: DagingCategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daging_page)

        val textViewSemuaKategori = findViewById<TextView>(R.id.tx_semua_kategori)
        val textViewSayuran = findViewById<TextView>(R.id.tx_sayuran)
        val textViewBuah = findViewById<TextView>(R.id.tx_buah)

        val dagingList = mutableListOf(
            DagingCardItem("daging sapi tumis", R.drawable.daging_sapi_tumis),
            DagingCardItem("domba giling panggang", R.drawable.daging_domba_giling),
            DagingCardItem("rendang", R.drawable.daging_rendang),
            DagingCardItem("sate daging sayur", R.drawable.daging_sate_sayur),
            DagingCardItem("sop daging", R.drawable.daging_sop),
            DagingCardItem("soto daging", R.drawable.daging_soto),
            // Tambahkan item lainnya
        )

        recyclerView = findViewById(R.id.recyclerViewDaging)
        subCategoryAdapter = DagingCategoryAdapter(this, dagingList)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = subCategoryAdapter

        val sortedDagingList = dagingList.sortedBy { it.namaDaging } // Sesuaikan dengan atribut indeks yang ada pada DagingCardItem

        recyclerView = findViewById(R.id.recyclerViewDaging)
        subCategoryAdapter = DagingCategoryAdapter(this, sortedDagingList)

        recyclerView.layoutManager = GridLayoutManager(this, 2) // 2 kolom sesuai dengan app:spanCount="2"
        recyclerView.adapter = subCategoryAdapter

        subCategoryAdapter.setOnItemClickListener(object : DagingCategoryAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                val selectedItem = dagingList[position] // Dapatkan item yang diklik
                val intent = Intent(this@DagingPage, DetailProdukActivity::class.java)

                // Kirim data yang diperlukan ke DetailProductActivity
                intent.putExtra("judulProduk", selectedItem.namaDaging)
                intent.putExtra("gambarProduk", selectedItem.gambarDaging)

                startActivity(intent)
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
            }
        })

        // Fungsi untuk mengakses kategori di bawah search view
        textViewSemuaKategori.setOnClickListener {
            val intent = Intent(this, CategoryPage::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
        textViewSayuran.setOnClickListener {
            val intent = Intent(this, SayuranPage::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
        textViewBuah.setOnClickListener {
            val intent = Intent(this, BuahPage::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
    }
}
