package com.example.homefoodfighter_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homefoodfighter_android.databinding.ActivityDailyDietBinding

class DailyDietActivity : AppCompatActivity() {
    private lateinit var viewBinding : ActivityDailyDietBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding =ActivityDailyDietBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
    }
}