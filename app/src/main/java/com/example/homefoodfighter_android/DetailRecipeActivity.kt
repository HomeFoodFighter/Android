package com.example.homefoodfighter_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homefoodfighter_android.Adapter.MyrecipeViewPagerAdapter
import com.example.homefoodfighter_android.databinding.ActivityDetailRecipeBinding
import com.example.homefoodfighter_android.databinding.ActivityMyrecipeBinding
import com.google.android.material.tabs.TabLayoutMediator

class DetailRecipeActivity : AppCompatActivity() {
    private lateinit var viewBinding : ActivityDetailRecipeBinding
    private val tabTitleArray = arrayOf(
        "레시피", "리뷰"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityDetailRecipeBinding.inflate(layoutInflater)
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