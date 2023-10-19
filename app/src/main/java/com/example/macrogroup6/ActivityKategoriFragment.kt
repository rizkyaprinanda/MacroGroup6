package com.example.macrogroup6

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.macrogroup6.Adapter.CategoryAdapter
import com.example.macrogroup6.Category.Ayam.AyamPage
import com.example.macrogroup6.Category.Buah.BuahPage
import com.example.macrogroup6.Category.CategoryModel
import com.example.macrogroup6.Category.Daging.DagingPage
import com.example.macrogroup6.Category.Sayuran.SayuranPage
import com.example.macrogroup6.Category.Telur.TelurPage
import com.example.macrogroup6.databinding.FragmentActivityKategoriBinding

class ActivityKategoriFragment : Fragment() {
    private lateinit var binding: FragmentActivityKategoriBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentActivityKategoriBinding.inflate(inflater, container, false)

        binding.txtSayuran.setOnClickListener{
            val intent = Intent(activity, SayuranPage::class.java)
            startActivity(intent)
//            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
        binding.txtBuah.setOnClickListener{
            val intent = Intent(activity, BuahPage::class.java)
            startActivity(intent)
//            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
        binding.txtDaging.setOnClickListener{
            val intent = Intent(activity, DagingPage::class.java)
            startActivity(intent)
//            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
        binding.txtTelur.setOnClickListener{
            val intent = Intent(activity, TelurPage::class.java)
            startActivity(intent)
//            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
        binding.txtAyam.setOnClickListener{
            val intent = Intent(activity, AyamPage::class.java)
            startActivity(intent)
//            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

//        val textViewSayuran= findViewById<TextView>(R.id.txt_sayuran)
//        val textViewBuah= findViewById<TextView>(R.id.txt_buah)
//        val textViewDaging= findViewById<TextView>(R.id.txt_daging)
//        val textViewTelur = findViewById<TextView>(R.id.txt_telur)
//        val textViewAyam =  findViewById<TextView>(R.id.txt_ayam)

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
        val categoryRecyclerView: RecyclerView = binding.categoryRecyclerView
        val adapter = CategoryAdapter(categories)
        categoryRecyclerView.layoutManager = GridLayoutManager(activity, 3)
        categoryRecyclerView.adapter = adapter

        return binding.root
    }

}