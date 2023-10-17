package com.example.macrogroup6

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


private lateinit var back : ImageView

class Notifikasi : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifikasi)

        back = findViewById(R.id.back)

        back.setOnClickListener(this)

    }

    override fun onClick(p: View) {
        when (p.id){
            R.id.back->{
                val intent = Intent(this@Notifikasi, HomeActivity::class.java)
                startActivity(intent)
            }
        }
    }
}