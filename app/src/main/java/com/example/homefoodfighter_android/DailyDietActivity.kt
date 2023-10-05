package com.example.homefoodfighter_android

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.homefoodfighter_android.databinding.ActivityDailyDietBinding

class DailyDietActivity : AppCompatActivity() {
    private lateinit var viewBinding : ActivityDailyDietBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding =ActivityDailyDietBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewDrawable()
        btnClick()
        dialogClick()
    }

    fun viewDrawable(){
        // 상태바 색상
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = ContextCompat.getColor(this, R.color.login_status_bar_color)
        }
    }

    fun btnClick(){
        viewBinding.btnBack.setOnClickListener { startActivity(Intent(this,MainActivity::class.java)) }

        //웃는 얼굴 이모티콘
        //로그인 했을 시에 -> 마이페이지로 이동
        //로그인 안했을 시에 -> 로그인 페이지지로 이동
   }

    fun dialogClick(){

    }
}