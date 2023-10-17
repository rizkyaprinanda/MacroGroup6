package com.example.macrogroup6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

private lateinit var username : EditText
private lateinit var firstName : EditText
private lateinit var lastName : EditText
private lateinit var password : EditText
private lateinit var btnRegist : Button

class Register : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        username = findViewById(R.id.Username)
        firstName = findViewById(R.id.Firstname)
        lastName = findViewById(R.id.Lastname)
        password = findViewById(R.id.Password)
        btnRegist = findViewById(R.id.btnRegist)

        btnRegist.setOnClickListener(this)

    }

    override fun onClick(b: View) {
        when(b.id){
            R.id.btnRegist -> {
                var bundle = Bundle()
                bundle.putString("username", username.text.toString())
                bundle.putString("password", password.text.toString())

                val intent = Intent(this@Register,Login::class.java)
                intent.putExtras(bundle)
                startActivity(intent)

            }
        }
    }
}