package com.example.macrogroup6

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.macrogroup6.databinding.ActivityHomeBinding


private lateinit var binding: ActivityHomeBinding
private lateinit var adapter: KategoriAdapter


class HomeActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sidebar.setOnClickListener{ replaceFragment(sidebar()) }
        binding.frameLayout2.setOnClickListener(this)
        binding.btnHome.setOnClickListener(this)
        binding.btnChild.setOnClickListener(this)
        binding.btnInformation.setOnClickListener(this)
        binding.btnCategory.setOnClickListener(this)


        init()
        setAdapterView()

    }

    private fun replaceFragment(fragment1: sidebar) {
        val fragmentManager = supportFragmentManager
        val fragmentTransition = fragmentManager.beginTransaction()
        fragmentTransition.replace(R.id.rsidebar, fragment1)
        fragmentTransition.addToBackStack(null)
        fragmentTransition.commit()
    }

    private fun init(){
        binding.rvkategori.layoutManager = LinearLayoutManager(this@HomeActivity, LinearLayoutManager.HORIZONTAL, false)
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

    override fun onClick(v: View) {
        when(v.id) {
            R.id.frameLayout2 -> {
                val intent = Intent(this@HomeActivity, ProfilAnakActivity::class.java)
                startActivity(intent)
            }

            R.id.btn_child -> {
                val intent = Intent(this@HomeActivity, ProfilAnakActivity::class.java)
                startActivity(intent)
            }


        }
    }

}