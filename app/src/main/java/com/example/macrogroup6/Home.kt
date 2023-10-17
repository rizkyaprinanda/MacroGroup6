package com.example.macrogroup6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.macrogroup6.databinding.ActivityHomeBinding

private lateinit var binding: ActivityHomeBinding
private lateinit var adapter: KategoriAdapter

class Home : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.child.setOnClickListener(this)

        init()
        setAdapterView()

    }

    private fun init(){
        binding.rvkategori.layoutManager = LinearLayoutManager(this@Home, LinearLayoutManager.HORIZONTAL, false)
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

    override fun onClick(p: View) {
        when(p.id){
            R.id.child->{
                val intent = Intent(this@Home, ProfilAnakActivity::class.java)
                startActivity(intent)
            }
        }
    }

}