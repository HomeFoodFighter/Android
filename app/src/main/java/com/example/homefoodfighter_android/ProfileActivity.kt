package com.example.homefoodfighter_android
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homefoodfighter_android.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    lateinit var viewBinding : ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        viewBinding = ActivityProfileBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        viewBinding.btnSave.setOnClickListener {
            val dialog = DialogBasicFragment()
            val args = Bundle()
            args.putString("content","사용 불가능한 닉네임입니다.")
            dialog.setArguments(args)
            dialog.show(supportFragmentManager, "basicDialog")

        }
        setContentView(viewBinding.root)
    }
}