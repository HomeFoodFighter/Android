package com.example.homefoodfighter_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homefoodfighter_android.databinding.ActivityFindAccountBinding

class FindAccountActivity : AppCompatActivity() {
    private lateinit var viewBinding : ActivityFindAccountBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityFindAccountBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
    }
}