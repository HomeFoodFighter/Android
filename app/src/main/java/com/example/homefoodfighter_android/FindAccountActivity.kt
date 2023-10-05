package com.example.homefoodfighter_android

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.homefoodfighter_android.databinding.ActivityFindAccountBinding

class FindAccountActivity : AppCompatActivity() {
    private lateinit var viewBinding : ActivityFindAccountBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityFindAccountBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewDrawable()
        btnClick()
    }
    fun viewDrawable(){
        // 상태바 색상
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = ContextCompat.getColor(this, R.color.login_status_bar_color)
        }
    }

    fun btnClick(){
        viewBinding.imgBack.setOnClickListener { startActivity(Intent(this,LoginActivity::class.java)) }

        //알림 메일 보내기 버튼 -> dialog 프래그먼트
        viewBinding.btnSendEmail.setOnClickListener {
            DialogFindAccountFragment().show(
                supportFragmentManager, "SampleDialog"
            )
        }
    }

}