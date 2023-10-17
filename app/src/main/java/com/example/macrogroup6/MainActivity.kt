package com.example.macrogroup6

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnRegist : Button = findViewById(R.id.regist)

        var btnLogin : Button = findViewById(R.id.login)

        btnLogin.setOnClickListener (this)
        btnRegist.setOnClickListener (this)
    }
    override fun onClick(b: View) {
        when (b.id){
            R.id.login -> {
                var intent = Intent(this@MainActivity, Login::class.java)
                startActivity(intent)
            }
            R.id.regist -> {
                var intent = Intent(this@MainActivity, Register::class.java)
                startActivity(intent)
            }
        }
    }


}