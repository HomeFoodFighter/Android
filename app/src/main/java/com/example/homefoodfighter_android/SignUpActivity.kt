package com.example.homefoodfighter_android

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.homefoodfighter_android.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var viewBinding : ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivitySignUpBinding.inflate(layoutInflater)
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
        viewBinding.btnOk.setOnClickListener { startActivity(Intent(this,LoginActivity::class.java)) }     //회원가입 완료하면 다시 로그인 창으로
        viewBinding.imgBack.setOnClickListener { startActivity(Intent(this, LoginActivity::class.java)) }
    }
}