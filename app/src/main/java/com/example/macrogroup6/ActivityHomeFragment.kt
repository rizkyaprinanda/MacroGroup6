package com.example.macrogroup6

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.macrogroup6.databinding.FragmentActivityHomeBinding

class ActivityHomeFragment : Fragment() {

    private lateinit var binding: FragmentActivityHomeBinding
    private lateinit var adapter: KategoriAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentActivityHomeBinding.inflate(inflater, container, false)

        binding.imgRendang.setOnClickListener { startDetailProdukActivity() }
        binding.imgSop.setOnClickListener { startDetailProdukActivity() }
        binding.imgParfait.setOnClickListener { startDetailProdukActivity() }
        binding.imgAyam.setOnClickListener { startDetailProdukActivity() }

        init()
        setAdapterView()
        return  binding.root
    }

    private fun startDetailProdukActivity() {
        val intent = Intent(activity, DetailProdukActivity::class.java)
        startActivity(intent)
    }


    private fun init(){
        binding.rvkategori.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
    }

    private fun setAdapterView() {
        val dataList: MutableList<kategoriModel> = mutableListOf()

        nameList().forEachIndexed{index, name ->
            dataList.add(kategoriModel(imgP1().get(index),name))
        }

        adapter = KategoriAdapter(dataList)
        binding.rvkategori.adapter = adapter
    }

    private fun nameList():Array<String> = resources.getStringArray(R.array.data)

    private fun imgP1():List<Int> = listOf(
        R.drawable.kategori1,
        R.drawable.kategori2,
        R.drawable.kategori3,
        R.drawable.kategori4,
        R.drawable.kategori5,
        R.drawable.kategori6,
        R.drawable.kategori7,
        R.drawable.kategori8
    )

}