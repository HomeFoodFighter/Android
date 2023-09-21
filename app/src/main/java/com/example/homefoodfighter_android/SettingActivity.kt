package com.example.homefoodfighter_android
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homefoodfighter_android.databinding.ActivitySettingBinding

class SettingActivity : AppCompatActivity() {
    lateinit var viewBinding : ActivitySettingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        viewBinding = ActivitySettingBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)
        viewBinding.btnSecede.setOnClickListener {
            DialogMypageSecadeFragment().show(
                supportFragmentManager, "SampleDialog"
            )

        }
    }
}