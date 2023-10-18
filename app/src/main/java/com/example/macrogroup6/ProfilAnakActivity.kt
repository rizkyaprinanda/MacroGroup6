package com.example.macrogroup6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ProfilAnakActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil_anak)

        val btnTambahData : TextView = findViewById(R.id.btn_tambahdata)
        btnTambahData.setOnClickListener(this)

        val btn_growth : ImageView = findViewById(R.id.imageView)
        btn_growth.setOnClickListener(this)

        val btn_chatbot : TextView = findViewById(R.id.btn_chatbot)
        btn_chatbot.setOnClickListener(this)


        val btn_back : ImageView = findViewById(R.id.leadingNavigationIcon)
        btn_back.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_tambahdata -> {
                val intent = Intent(this@ProfilAnakActivity, TambahDataAnakActivity::class.java)
                startActivity(intent)
            }

            R.id.imageView -> {
                val intent = Intent(this@ProfilAnakActivity, PertumbuhanAnakActivity::class.java)
                startActivity(intent)
            }

            R.id.btn_chatbot -> {
                val intent = Intent(this@ProfilAnakActivity, ChatBotActivity::class.java)
                startActivity(intent)
            }


        }
    }
}