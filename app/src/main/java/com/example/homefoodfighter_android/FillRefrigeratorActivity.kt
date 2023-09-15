package com.example.homefoodfighter_android

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.homefoodfighter_android.databinding.ActivityFillRefrigeratorBinding

class FillRefrigeratorActivity : AppCompatActivity() {
    private lateinit var viewBinding :ActivityFillRefrigeratorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityFillRefrigeratorBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        // TextView 참조
        val vegetableFruitTextView = viewBinding.vegFruit
        val grainsTexView = viewBinding.grains
        val meatSeafoodTextView = viewBinding.meatSeafood
        val sauceTextView = viewBinding.sauce
        val othersTextView = viewBinding.others

        DrawableClick(vegetableFruitTextView, VegetablesFruitActivity::class.java)
        DrawableClick(grainsTexView, GrainsActivity::class.java)
        DrawableClick(meatSeafoodTextView, MeatSeafoodActivity::class.java)
        DrawableClick(sauceTextView, SauceActivity::class.java)
        DrawableClick(othersTextView, OthersActivity::class.java)

    }

    fun DrawableClick(item:TextView, targetActivity: Class<*>){
        item.setCompoundDrawablesRelativeWithIntrinsicBounds(
            R.drawable.icon_plus_circle, // 시작 아이콘 (왼쪽에 표시)
            0, // 상단 아이콘
            0, // 끝 아이콘
            0 // 하단 아이콘
        )
        item.setOnClickListener {
            // Drawable 클릭 시 이동하고자 하는 activity로 이동하는 Intent 생성
            val intent = Intent(this@FillRefrigeratorActivity, targetActivity)
            // Intent를 사용하여 다른 activity로 이동
            startActivity(intent)
        }
    }
}