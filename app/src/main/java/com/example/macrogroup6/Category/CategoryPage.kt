package com.example.macrogroup6.Category

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.macrogroup6.Adapter.CategoryAdapter
<<<<<<< HEAD
import com.example.macrogroup6.Category.Ayam.AyamPage
import com.example.macrogroup6.Category.Buah.BuahPage
import com.example.macrogroup6.Category.Daging.DagingPage
import com.example.macrogroup6.Category.Sayuran.SayuranPage
import com.example.macrogroup6.Category.Telur.TelurPage
=======
import com.example.macrogroup6.Category.Buah.BuahPage
import com.example.macrogroup6.Category.Sayuran.SayuranPage
>>>>>>> 01d2f8a43b1b7b6aadff435e626a80e6445ecc40
import com.example.macrogroup6.R

class CategoryPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_page)

        val textViewSayuran= findViewById<TextView>(R.id.txt_sayuran)
        val textViewBuah= findViewById<TextView>(R.id.txt_buah)
<<<<<<< HEAD
        val textViewDaging= findViewById<TextView>(R.id.txt_daging)
        val textViewTelur = findViewById<TextView>(R.id.txt_telur)
        val textViewAyam =  findViewById<TextView>(R.id.txt_ayam)
=======
>>>>>>> 01d2f8a43b1b7b6aadff435e626a80e6445ecc40

        val categories = listOf(
            CategoryModel("Sayuran", R.drawable.vegetables),
            CategoryModel("Buah", R.drawable.fruits),
            CategoryModel("Daging", R.drawable.meat),
            CategoryModel("Ayam", R.drawable.chicken),
            CategoryModel("Telur", R.drawable.egg),
            CategoryModel("Makanan Laut", R.drawable.seafood),
            CategoryModel("Minuman", R.drawable.drinks),
            CategoryModel("Makanan Ringan", R.drawable.snack)
        )

        val categoryRecyclerView: RecyclerView = findViewById(R.id.categoryRecyclerView)
        val adapter = CategoryAdapter(categories)
        categoryRecyclerView.layoutManager = GridLayoutManager(this, 3)
        categoryRecyclerView.adapter = adapter

        textViewSayuran.setOnClickListener{
            val intent = Intent(this, SayuranPage::class.java)
            startActivity(intent)
<<<<<<< HEAD
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
=======
>>>>>>> 01d2f8a43b1b7b6aadff435e626a80e6445ecc40
        }
        textViewBuah.setOnClickListener{
            val intent = Intent(this, BuahPage::class.java)
            startActivity(intent)
<<<<<<< HEAD
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
        textViewDaging.setOnClickListener{
            val intent = Intent(this, DagingPage::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
        textViewTelur.setOnClickListener{
            val intent = Intent(this, TelurPage::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
        textViewAyam.setOnClickListener{
            val intent = Intent(this, AyamPage::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
=======
>>>>>>> 01d2f8a43b1b7b6aadff435e626a80e6445ecc40
        }
    }


}