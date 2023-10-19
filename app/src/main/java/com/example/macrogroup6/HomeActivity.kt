package com.example.macrogroup6

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.macrogroup6.databinding.ActivityHomeBinding
import com.google.android.material.navigation.NavigationBarView


private lateinit var binding: ActivityHomeBinding
private lateinit var adapter: KategoriAdapter


class HomeActivity : AppCompatActivity(), NavigationBarView.OnItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
//
//        binding.sidebar.setOnClickListener{ replaceFragment(sidebar()) }
//        binding.frameLayout2.setOnClickListener(this)
//        binding.btnHome.setOnClickListener(this)
//        binding.btnChild.setOnClickListener(this)
//        binding.btnInformation.setOnClickListener(this)
//        binding.btnCategory.setOnClickListener(this)

        binding.bottomNav.setOnItemSelectedListener(this)
        replaceFragment(ActivityHomeFragment())
        
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.container, fragment)
        fragmentTransaction.commit()
    }
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.home -> {
                replaceFragment(ActivityHomeFragment())
                return true
            }
            R.id.child -> {
                replaceFragment(ActivityProfilAnakFragment())
                return true
            }
            R.id.info -> {
                replaceFragment(ActivityInformasiFragment())
                return true
            }
            R.id.Kategori -> {
                replaceFragment(ActivityKategoriFragment())
                return true
            }
            else -> return false
        }
    }

//    private fun replaceFragment(fragment1: sidebar) {
//        val fragmentManager = supportFragmentManager
//        val fragmentTransition = fragmentManager.beginTransaction()
//        fragmentTransition.replace(R.id.rsidebar, fragment1)
//        fragmentTransition.addToBackStack(null)
//        fragmentTransition.commit()
//    }

//    private fun init(){
//        binding.rvkategori.layoutManager = LinearLayoutManager(this@HomeActivity, LinearLayoutManager.HORIZONTAL, false)
//    }
//
//    private fun setAdapterView() {
//        val dataList: MutableList<kategoriModel> = mutableListOf()
//
//        nameList().forEachIndexed{index, name ->
//            dataList.add(kategoriModel(imgP1().get(index),name))
//        }
//
//        adapter = KategoriAdapter(dataList)
//        binding.rvkategori.adapter = adapter
//    }
//
//    private fun nameList():Array<String> = resources.getStringArray(R.array.data)
//
//    private fun imgP1():List<Int> = listOf(
//        R.drawable.kategori1,
//        R.drawable.kategori2,
//        R.drawable.kategori3,
//        R.drawable.kategori4,
//        R.drawable.kategori5,
//        R.drawable.kategori6,
//        R.drawable.kategori7,
//        R.drawable.kategori8
//    )


}