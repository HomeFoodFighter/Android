package com.example.homefoodfighter_android

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.homefoodfighter_android.databinding.FragmentDialogFindAccountBinding

class DialogFindAccountFragment : DialogFragment() {
    private lateinit var viewBinding: FragmentDialogFindAccountBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //false로 설정해 주면 화면밖 혹은 뒤로가기 버튼시 다이얼로그라 dismiss 되지 않는다.
        isCancelable = true
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentDialogFindAccountBinding.inflate(layoutInflater)
        return viewBinding.root
    }
}