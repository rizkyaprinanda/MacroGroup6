package com.example.macrogroup6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.macrogroup6.databinding.ActivityOtpVerBinding

private lateinit var binding: ActivityOtpVerBinding

class otpVer : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp_ver)

        binding = ActivityOtpVerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnverify.setOnClickListener(this)


    }

    override fun onClick(p: View) {
        when(p.id){
            R.id.btnverify->{
                val intent = Intent(this@otpVer,otpVer2::class.java)
                startActivity(intent)
            }
        }
    }

}