package com.example.macrogroup6

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.macrogroup6.Adapter.Horizontal_RecyclerView
import com.example.macrogroup6.databinding.ActivityDetailProdukBinding

class DetailProdukActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var recyclerView: RecyclerView

    private lateinit var adapter: Horizontal_RecyclerView

    private lateinit var binding: ActivityDetailProdukBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_produk)

        binding = ActivityDetailProdukBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lihatresep.setOnClickListener(this)

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

    override fun onClick(p: View) {
        when(p.id){
            R.id.lihatresep->{
                val intent = Intent(this@DetailProdukActivity, DetailResep::class.java)
                startActivity(intent)
            }
        }
    }
}