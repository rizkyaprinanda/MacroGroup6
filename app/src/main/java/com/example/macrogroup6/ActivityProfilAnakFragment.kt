package com.example.macrogroup6

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.macrogroup6.databinding.FragmentActivityProfilAnakBinding

class ActivityProfilAnakFragment : Fragment(), View.OnClickListener {

    private lateinit var binding : FragmentActivityProfilAnakBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =  FragmentActivityProfilAnakBinding.inflate(inflater, container, false)

        binding.btnTambahdata.setOnClickListener(this)
        binding.imageView.setOnClickListener(this)
        binding.btnChatbot.setOnClickListener(this)

        return binding.root
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_tambahdata -> {
                val intent = Intent(activity, TambahDataAnakActivity::class.java)
                startActivity(intent)
            }

            R.id.imageView -> {
                val intent = Intent(activity, PertumbuhanAnakActivity::class.java)
                startActivity(intent)
            }

            R.id.btn_chatbot -> {
                val intent = Intent(activity, ChatBotActivity::class.java)
                startActivity(intent)
            }

        }
    }
}