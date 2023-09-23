package com.example.homefoodfighter_android.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.homefoodfighter_android.MyrecipeOpenFragment
import com.example.homefoodfighter_android.MyrecipeWriteFragment

private const val FRAG_NUMS = 2

class MyrecipeViewPagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return FRAG_NUMS
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> return MyrecipeOpenFragment()
            1 -> return MyrecipeWriteFragment()
            else -> return MyrecipeOpenFragment()
        }
    }
}