package com.example.homefoodfighter_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homefoodfighter_android.Adapter.MyrecipeViewPagerAdapter
import com.example.homefoodfighter_android.databinding.ActivityMyrecipeBinding
import com.google.android.material.tabs.TabLayoutMediator

class MyrecipeActivity : AppCompatActivity() {
    private lateinit var viewBinding : ActivityMyrecipeBinding
    private val tabTitleArray = arrayOf(
        "공개중", "작성중"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMyrecipeBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        viewPage()
    }
    fun viewPage(){
        var viewPager =viewBinding.viewPager
        var tabLayout = viewBinding.tabLayout
        viewPager.adapter = MyrecipeViewPagerAdapter(this)
        TabLayoutMediator(tabLayout, viewPager){
                tab, position -> tab.text = tabTitleArray[position]
        }.attach()
    }
}