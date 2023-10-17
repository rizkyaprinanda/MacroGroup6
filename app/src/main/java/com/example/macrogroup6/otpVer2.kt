package com.example.macrogroup6

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.macrogroup6.databinding.ActivityOtpVer2Binding


private lateinit var binding: ActivityOtpVer2Binding

class otpVer2 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp_ver2)

        binding = ActivityOtpVer2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnConfirm.setOnClickListener(this)

    }

    override fun onClick(p: View) {
        when(p.id){
            R.id.btnConfirm->{
                val intent = Intent(this@otpVer2,Login::class.java)
                startActivity(intent)
            }
        }
    }
}