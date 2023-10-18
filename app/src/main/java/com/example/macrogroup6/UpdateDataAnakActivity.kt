package com.example.macrogroup6

import android.content.Intent
import android.icu.text.SimpleDateFormat
import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.macrogroup6.databinding.ActivityUpdateDataAnakBinding
import java.util.Locale

class UpdateDataAnakActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUpdateDataAnakBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUpdateDataAnakBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnSimpan = binding.btnUpdatedata
        val btnBack = binding.imageView2

        btnSimpan.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("nama", binding.etNamaAnak.text.toString())
            bundle.putString("usia", binding.etUsia.text.toString())
            bundle.putString("tinggi", binding.etTinggi.text.toString())
            bundle.putString("berat", binding.etBerat.text.toString())
            bundle.putString("lingkar", binding.etLingkar.text.toString())

            val calendar = Calendar.getInstance()
            val dateFormat = SimpleDateFormat("d MMMM yyyy", Locale.getDefault())
            val tanggalSekarang = dateFormat.format(calendar.time)

            bundle.putString("tanggal", tanggalSekarang)

            val intent = Intent(this@UpdateDataAnakActivity, PertumbuhanAnakActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        btnBack.setOnClickListener {
            val intent = Intent(this@UpdateDataAnakActivity, ProfilAnakActivity::class.java)
            startActivity(intent)
        }
    }
}
