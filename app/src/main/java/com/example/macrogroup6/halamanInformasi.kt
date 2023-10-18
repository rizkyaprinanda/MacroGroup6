package com.example.macrogroup6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.macrogroup6.databinding.ActivityHalamanInformasiBinding
import com.example.macrogroup6.databinding.ActivityHomeBinding

private lateinit var binding : ActivityHalamanInformasiBinding

class halamanInformasi : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_informasi)

        binding = ActivityHalamanInformasiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSelengkapnya.setOnClickListener(this)
        binding.video.setOnClickListener(this)

    }

    override fun onClick(p: View) {
        when(p.id){
            R.id.btnSelengkapnya->{
                val intent = Intent(this@halamanInformasi, ArtikelStunting::class.java)
                startActivity(intent)
            }
            R.id.video->{
                val intent = Intent(this@halamanInformasi, videostunting::class.java)
                startActivity(intent)
            }
        }

    }
}