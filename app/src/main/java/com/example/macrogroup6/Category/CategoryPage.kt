package com.example.macrogroup6.Category

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.macrogroup6.Adapter.CategoryAdapter
import com.example.macrogroup6.Category.Sayuran.SayuranPage
import com.example.macrogroup6.R

class CategoryPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_page)

        val textViewSayuran= findViewById<TextView>(R.id.txt_sayuran)

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
        }
    }


}