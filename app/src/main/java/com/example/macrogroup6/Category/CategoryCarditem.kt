package com.example.macrogroup6.Category

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.macrogroup6.R

// tes comment
// tes comment2

class CategoryCardItem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.category_card_item)
    }
}

data class CategoryModel(val name: String, val iconResId: Int)