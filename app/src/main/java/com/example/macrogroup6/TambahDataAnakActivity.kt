package com.example.macrogroup6

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TambahDataAnakActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etNama : EditText
    private lateinit var etUsia : EditText
    private lateinit var etTinggi : EditText
    private lateinit var etBerat : EditText
    private lateinit var etLingkar : EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tambah_data_anak)

        etNama = findViewById(R.id.etNamaAnak)
        etUsia = findViewById(R.id.etUsia)
        etBerat = findViewById(R.id.etBerat)
        etTinggi = findViewById(R.id.etTinggi)
        etLingkar = findViewById(R.id.etLingkar)

        val btnSimpan : TextView = findViewById(R.id.btn_tambahdata)
        btnSimpan.setOnClickListener(this)

        val btnBack : ImageView = findViewById(R.id.imageView2)
        btnBack.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_tambahdata -> {
                val bundle = Bundle()
                bundle.putString("nama", etNama.text.toString())
                bundle.putString("usia", etUsia.text.toString())
                bundle.putString("tinggi", etTinggi.text.toString())
                bundle.putString("berat", etBerat.text.toString())
                bundle.putString("lingkar", etLingkar.text.toString())

                val intent = Intent(this@TambahDataAnakActivity, PertumbuhanAnakActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)

            }

            R.id.imageView2 -> {
                val intent = Intent(this@TambahDataAnakActivity, ProfilAnakActivity::class.java)
                startActivity(intent)
            }
        }
    }
}