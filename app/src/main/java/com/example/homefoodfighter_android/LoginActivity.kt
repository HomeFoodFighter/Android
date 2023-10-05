package com.example.homefoodfighter_android

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.homefoodfighter_android.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var viewBinding :ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityLoginBinding.inflate(layoutInflater)
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
        viewBinding.txtSignUp.setOnClickListener { startActivity(Intent(this,SignUpActivity::class.java)) }
        viewBinding.txtFindAccount.setOnClickListener { startActivity(Intent(this, FindAccountActivity::class.java)) }
        viewBinding.btnLogin.setOnClickListener { startActivity(Intent(this,MainActivity::class.java)) }
    }
}