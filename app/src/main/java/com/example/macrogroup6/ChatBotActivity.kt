package com.example.macrogroup6

import android.app.ActionBar
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ChatBotActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_bot)

        val btnSend = findViewById<ImageView>(R.id.btn_send)
        val etChat = findViewById<EditText>(R.id.etChat)
        val chatContainer = findViewById<LinearLayout>(R.id.chatContainer)
        val chat3LayoutParams = findViewById<TextView>(R.id.chat3).layoutParams

        // Set listener untuk tombol btn_send
        btnSend.setOnClickListener {
            val chatMessage = etChat.text.toString()

            if (chatMessage.isNotEmpty()) {
                // Buat TextView baru
                val newTextView = TextView(this)
                newTextView.text = chatMessage
                newTextView.textSize = 17f
                newTextView.setPadding(dpToPx(15), dpToPx(15),dpToPx(15), dpToPx(15))
                newTextView.setBackgroundResource(R.drawable.rectangle_97)


                // Atur margin top sebesar 15dp dalam kode
                val marginParams = ActionBar.LayoutParams(chat3LayoutParams)
                marginParams.topMargin = dpToPx(15)
                newTextView.layoutParams = marginParams

                // Tambahkan TextView baru ke dalam LinearLayout (chatContainer)
                chatContainer.addView(newTextView)

                // Hapus teks dari EditText
                etChat.text.clear()
            }
        }



        val textView = findViewById<TextView>(R.id.chat2)
        val chat2 = "Makananan untuk anak 5 tahun\n" +
                "Berat Normal anak 5 bulan\n" +
                "Kandungan Gizi Pada Bayam"
        textView.text = chat2

        val textView4 = findViewById<TextView>(R.id.chat4)
        val chat4 = "Terdapat beberapa makanan\n" +
                "untuk anak usia 5 tahun yaitu\n" +
                "daging, sayuran, dan buah-buahan"
        textView4.text = chat4

        val btnBack : ImageView = findViewById(R.id.imageView2)
        btnBack.setOnClickListener(this)

    }

    // Fungsi untuk mengkonversi dp menjadi px
    private fun dpToPx(dp: Int): Int {
        val density = resources.displayMetrics.density
        return (dp * density).toInt()
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.imageView2 -> {
                val intent = Intent(this@ChatBotActivity, ProfilAnakActivity::class.java)
                startActivity(intent)
            }
        }
    }
}