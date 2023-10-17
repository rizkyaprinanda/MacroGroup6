package com.example.macrogroup6

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.macrogroup6.databinding.ActivityProfilAnakBinding

class ProfilAnakActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityProfilAnakBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProfilAnakBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTambahdata.setOnClickListener(this)
        binding.imageView.setOnClickListener(this)
        binding.btnChatbot.setOnClickListener(this)
        binding.btnDetail.setOnClickListener(this)
        binding.leadingNavigationIcon.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v) {
            binding.btnTambahdata -> {
                val intent = Intent(this@ProfilAnakActivity, TambahDataAnakActivity::class.java)
                startActivity(intent)
            }

            binding.imageView -> {
                val intent = Intent(this@ProfilAnakActivity, PertumbuhanAnakActivity::class.java)
                startActivity(intent)
            }

            binding.btnChatbot -> {
                val intent = Intent(this@ProfilAnakActivity, ChatBotActivity::class.java)
                startActivity(intent)
            }

            binding.btnDetail -> {
                val intent = Intent(this@ProfilAnakActivity, DetailProdukActivity::class.java)
                startActivity(intent)
            }

            binding.leadingNavigationIcon -> {
                val intent = Intent(this@ProfilAnakActivity, HomeActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
