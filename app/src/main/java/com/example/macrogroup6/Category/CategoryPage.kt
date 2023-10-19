package com.example.macrogroup6.Category

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.macrogroup6.R

class CategoryPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_page)

//        val textViewSayuran= findViewById<TextView>(R.id.txt_sayuran)
//        val textViewBuah= findViewById<TextView>(R.id.txt_buah)
//        val textViewDaging= findViewById<TextView>(R.id.txt_daging)
//        val textViewTelur = findViewById<TextView>(R.id.txt_telur)
//        val textViewAyam =  findViewById<TextView>(R.id.txt_ayam)
//
//        val categories = listOf(
//            CategoryModel("Sayuran", R.drawable.vegetables),
//            CategoryModel("Buah", R.drawable.fruits),
//            CategoryModel("Daging", R.drawable.meat),
//            CategoryModel("Ayam", R.drawable.chicken),
//            CategoryModel("Telur", R.drawable.egg),
//            CategoryModel("Makanan Laut", R.drawable.seafood),
//            CategoryModel("Minuman", R.drawable.drinks),
//            CategoryModel("Makanan Ringan", R.drawable.snack)
//        )
//
//        val categoryRecyclerView: RecyclerView = findViewById(R.id.categoryRecyclerView)
//        val adapter = CategoryAdapter(categories)
//        categoryRecyclerView.layoutManager = GridLayoutManager(this, 3)
//        categoryRecyclerView.adapter = adapter
//
//        textViewSayuran.setOnClickListener{
//            val intent = Intent(this, SayuranPage::class.java)
//            startActivity(intent)
//            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
//        }
//        textViewBuah.setOnClickListener{
//            val intent = Intent(this, BuahPage::class.java)
//            startActivity(intent)
//            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
//        }
//        textViewDaging.setOnClickListener{
//            val intent = Intent(this, DagingPage::class.java)
//            startActivity(intent)
//            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
//        }
//        textViewTelur.setOnClickListener{
//            val intent = Intent(this, TelurPage::class.java)
//            startActivity(intent)
//            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
//        }
//        textViewAyam.setOnClickListener{
//            val intent = Intent(this, AyamPage::class.java)
//            startActivity(intent)
//            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
//        }
    }


}