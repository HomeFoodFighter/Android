package com.example.homefoodfighter_android.Adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.homefoodfighter_android.AllRecipeActivity

class AllRecipeTabAdapter(activity: AllRecipeActivity) : FragmentStateAdapter(activity) {
    private val fragmentList = ArrayList<Fragment>()
    protected val stringList = ArrayList<String>()

    fun addFragment(fragment: Fragment, title: String) {
        fragmentList.add(fragment)
        stringList.add(title)
    }

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }

    // stringList에 직접 접근하지 않고 TabLayoutMediator의 lambda 함수 내에서 사용하도록 수정합니다.
    fun getTabTitle(position: Int): String {
        return stringList[position]
    }
    /*fun getTabIcon(position: Int): Int {
        return tabIcons[position]
    }*/
}