package com.example.macrogroup6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.macrogroup6.databinding.ActivityHalamanInformasiBinding

private lateinit var binding : ActivityHalamanInformasiBinding

class halamanInformasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_informasi)

        binding = ActivityHalamanInformasiBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }


}