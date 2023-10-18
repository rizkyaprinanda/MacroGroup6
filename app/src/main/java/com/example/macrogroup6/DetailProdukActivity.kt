package com.example.macrogroup6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.macrogroup6.databinding.ActivityDetailProdukBinding



class DetailProdukActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailProdukBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailProdukBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mendapatkan data yang dikirim dari KategoriPage
        val judulProduk = intent.getStringExtra("judulProduk")
        val gambarProduk = intent.getIntExtra("gambarProduk", 0)

        if (judulProduk != null) {
            binding.tvNamaProduk.text = judulProduk
        }

        if (gambarProduk != 0) {
            binding.imageView3.setImageResource(gambarProduk)
        }

        binding.imageView2.setOnClickListener {
            onBackPressed()
        }

    }
}