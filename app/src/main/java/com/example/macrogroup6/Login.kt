package com.example.macrogroup6

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

lateinit var Regist : TextView
lateinit var email : EditText
lateinit var Pass : EditText
lateinit var lupaPass : TextView

class Login : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        email = findViewById(R.id.Username)
        Pass = findViewById(R.id.Password)
        lupaPass = findViewById(R.id.lupaPass)

        Regist = findViewById(R.id.toRegist)

        Regist.setOnClickListener(this)
        lupaPass.setOnClickListener(this)

        val bundle = intent.extras

        if (bundle != null){
            email.setText(bundle.getString("username"))
            Pass.setText(bundle.getString("password"))
        }

        var btnlogin : Button = findViewById(R.id.btnlogin)

        btnlogin.setOnClickListener(this)


    }

    override fun onClick(p: View) {
        when (p.id){
            R.id.toRegist -> {
                val intent = Intent(this@Login, Register::class.java)
                startActivity(intent)
            }

            R.id.btnlogin -> {
                val intent = Intent(this@Login, HomeActivity::class.java)
                startActivity(intent)
            }

            R.id.lupaPass -> {
                val intent = Intent(this@Login,ForgotPassword::class.java)
                startActivity(intent)
            }

        }
    }


}