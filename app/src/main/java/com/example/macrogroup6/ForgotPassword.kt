package com.example.macrogroup6

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.macrogroup6.databinding.ActivityForgotPasswordBinding


private lateinit var binding: ActivityForgotPasswordBinding

class ForgotPassword : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        binding = ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext1.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btnNext1->{
                val intent = Intent(this@ForgotPassword, otpVer::class.java)
                startActivity(intent)
            }
        }
    }
}