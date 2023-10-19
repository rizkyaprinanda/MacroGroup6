package com.example.macrogroup6

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PertumbuhanAnakActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etNama : TextView
    private lateinit var etTinggi : TextView
    private lateinit var etBerat : TextView
    private lateinit var etLingkar : TextView
    private lateinit var btnUpdate : TextView
    private lateinit var tanggal : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pertumbuhan_anak)

        etNama = findViewById(R.id.headlineinfo)
        etBerat = findViewById(R.id.tvkg)
        etTinggi = findViewById(R.id.tvcm)
        etLingkar = findViewById(R.id.tvcm2)
        btnUpdate = findViewById(R.id.btn_updatedata)
        tanggal = findViewById(R.id.tanggal)

        btnUpdate.setOnClickListener(this)

        val bundle = intent.extras
        if(bundle != null) {
            val nama = bundle.getString("nama") ?: ""
            val usia = bundle.getString("usia") ?: ""
            val date = bundle.getString("tanggal")?: ""
            etTinggi.setText(bundle.getString("tinggi"))
            etBerat.setText(bundle.getString("berat"))
            etLingkar.setText(bundle.getString("lingkar"))
            tanggal.text = date
            etNama.text = "$nama - $usia"

        }

        val btn_back : ImageView = findViewById(R.id.leadingNavigationIcon)
        btn_back.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.leadingNavigationIcon -> {
                val intent = Intent(this@PertumbuhanAnakActivity, ProfilAnakActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_updatedata->{
                val intent = Intent(this@PertumbuhanAnakActivity, UpdateDataAnakActivity::class.java)
                startActivity(intent)
            }
        }
    }
}