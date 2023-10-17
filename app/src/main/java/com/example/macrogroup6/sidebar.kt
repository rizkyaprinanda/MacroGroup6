package com.example.macrogroup6

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.macrogroup6.databinding.FragmentSidebarBinding


class sidebar : Fragment(), View.OnClickListener {
    private lateinit var binding : FragmentSidebarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =  FragmentSidebarBinding.inflate(inflater, container, false)

        binding.notif.setOnClickListener(this)
        binding.profil.setOnClickListener(this)
        binding.cancel.setOnClickListener(this)

        return  binding.root
    }

    override fun onClick(p: View) {
        when(p.id){
            R.id.notif->{
                val intent = Intent(activity, Notifikasi::class.java)
                startActivity(intent)
            }

            R.id.profil->{
                val intent = Intent(activity, Profile::class.java)
                startActivity(intent)
            }

            R.id.cancel-> {
                closeSidebar()
            }
        }

    }

    private fun closeSidebar() {
        val fragmentManager = requireActivity().supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        // Hapus fragment sidebar dari tampilan
        fragmentTransaction.remove(this)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }


}