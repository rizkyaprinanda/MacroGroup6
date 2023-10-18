package com.example.macrogroup6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.example.macrogroup6.databinding.ActivityHomeBinding
import com.example.macrogroup6.databinding.ActivityPertumbuhanAnakBinding

class PertumbuhanAnakActivity : AppCompatActivity() {

    private lateinit var binding : ActivityPertumbuhanAnakBinding
    private lateinit var etNama : TextView
    private lateinit var etTinggi : TextView
    private lateinit var etBerat : TextView
    private lateinit var etLingkar : TextView
    private lateinit var tanggal : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pertumbuhan_anak)
        binding = ActivityPertumbuhanAnakBinding.inflate(layoutInflater)
        setContentView(binding.root)

        etNama = findViewById(R.id.headlineinfo)
        etBerat = findViewById(R.id.tvkg)
        etTinggi = findViewById(R.id.tvcm)
        etLingkar = findViewById(R.id.tvcm2)
        tanggal = findViewById(R.id.tv2)

        val bundle = intent.extras
        if(bundle != null) {
            val nama = bundle.getString("nama") ?: ""
            val usia = bundle.getString("usia") ?: ""
            etTinggi.setText(bundle.getString("tinggi"))
            etBerat.setText(bundle.getString("berat"))
            etLingkar.setText(bundle.getString("lingkar"))
            tanggal.setText(("19 Oktober 2023"))
            etNama.text = "$nama - $usia"

        }

        binding.leadingNavigationIcon.setOnClickListener {
            val intent = Intent(this@PertumbuhanAnakActivity, ProfilAnakActivity::class.java)
            startActivity(intent)
        }

        binding.btnUpdatedata.setOnClickListener {
            val intent = Intent(this@PertumbuhanAnakActivity, UpdateDataAnakActivity::class.java)
            startActivity(intent)
        }
    }

}