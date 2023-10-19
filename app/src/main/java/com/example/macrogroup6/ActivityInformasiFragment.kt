package com.example.macrogroup6

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.macrogroup6.databinding.FragmentActivityInformasiBinding

class ActivityInformasiFragment : Fragment(), View.OnClickListener {

    private lateinit var binding : FragmentActivityInformasiBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =  FragmentActivityInformasiBinding.inflate(inflater, container, false)
        binding.btnSelengkapnya.setOnClickListener(this)
        binding.video.setOnClickListener(this)
        return binding.root
    }

    override fun onClick(p: View) {
        when(p.id){
            R.id.btnSelengkapnya->{
                val intent = Intent(activity, ArtikelStunting::class.java)
                startActivity(intent)
            }
            R.id.video->{
                val intent = Intent(activity, videostunting::class.java)
                startActivity(intent)
            }
        }

    }

}