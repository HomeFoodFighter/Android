package com.example.homefoodfighter_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import com.example.homefoodfighter_android.Adapter.AllRecipeTabAdapter
import com.example.homefoodfighter_android.AllRecipeFragment.*
import com.example.homefoodfighter_android.databinding.ActivityAllRecipeBinding
import com.example.homefoodfighter_android.databinding.CustomTabLayoutBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class AllRecipeActivity : AppCompatActivity() {
    private lateinit var viewBinding : ActivityAllRecipeBinding
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2
    private lateinit var adapter: AllRecipeTabAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityAllRecipeBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        // 선택된 탭이 없는 경우 AllRecipeFragment를 표시
        /*val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, AllRecipeFragment())
        fragmentTransaction.commit()*/

        tabLayout = viewBinding.tabLayout
        viewPager2 = viewBinding.viewPager2

        // 어댑터 초기화
        adapter = AllRecipeTabAdapter(this@AllRecipeActivity)

        // 프래그먼트 추가
        adapter.addFragment(KoreanFragment(), "한식")
        adapter.addFragment(JapaneseFragment(), "일식")
        adapter.addFragment(ChineseFragment(), "중식")
        adapter.addFragment(WesternFragment(), "양식")
        adapter.addFragment(AsianFragment(), "아시안")
        adapter.addFragment(FusionFragment(), "퓨전")
        adapter.addFragment(DessertFragment(), "디저트")

        // 어댑터 설치(set adapter)
        viewPager2.adapter = adapter

        // TabLayout과 ViewPager를 연결하고 커스텀 탭 레이아웃 설정
        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            // 커스텀 탭 레이아웃을 inflate
            val customTabBinding = CustomTabLayoutBinding.inflate(layoutInflater)
            val customTabView = customTabBinding.root

            // 커스텀 탭 레이아웃에서 아이콘 이미지뷰와 텍스트 뷰를 찾음
            val iconImageView = customTabBinding.tabIcon
            val titleTextView = customTabBinding.tabText

            // position에 따라 아이콘과 텍스트를 설정
            when (position) {
                0 -> {
                    iconImageView.setImageResource(R.drawable.icon_korea)
                    titleTextView.text = "한식"
                }
                1 -> {
                    iconImageView.setImageResource(R.drawable.icon_japan)
                    titleTextView.text = "일식"
                }
                2 -> {
                    iconImageView.setImageResource(R.drawable.icon_china)
                    titleTextView.text = "중식"
                }
                3 -> {
                    iconImageView.setImageResource(R.drawable.icon_western)
                    titleTextView.text = "양식"
                }
                4 -> {
                    iconImageView.setImageResource(R.drawable.icon_asian)
                    titleTextView.text = "아시안"
                }
                5 -> {
                    iconImageView.setImageResource(R.drawable.icon_fusion)
                    titleTextView.text = "퓨전"
                }
                6 -> {
                    iconImageView.setImageResource(R.drawable.icon_desert)
                    titleTextView.text = "디저트"
                }
                else -> {
                    iconImageView.setImageResource(R.drawable.icon_korea)
                    titleTextView.text = "기타"
                }
            }

            // TabLayout에 커스텀 뷰를 설정
            tab.customView = customTabView

        }.attach()

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                // 선택된 탭의 커스텀 뷰 가져오기
                val customView = tab?.customView
                // 커스텀 뷰에서 텍스트 뷰 찾기
                val tabText = customView?.findViewById<TextView>(R.id.tabText)
                // 선택된 탭의 텍스트 색상 변경
                tabText?.setTextColor(ContextCompat.getColor(this@AllRecipeActivity, R.color.selected_tab_text_color))

                // 선택된 탭의 배경 색상 변경 (선택한 탭의 배경 색상을 변경하려는 경우)
                customView?.setBackgroundResource(R.drawable.style_all_recipe_selected_tab)
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                // 선택되지 않은 탭의 텍스트 색상 변경 (선택되지 않은 탭의 텍스트 색상을 변경하려는 경우)
                val customView = tab?.customView
                val tabText = customView?.findViewById<TextView>(R.id.tabText)

                tabText?.setTextColor(ContextCompat.getColor(this@AllRecipeActivity, R.color.unselected_tab_text_color))

                // 선택되지 않은 탭의 배경 색상 변경 (선택되지 않은 탭의 배경 색상을 변경하려는 경우)
                customView?.setBackgroundResource(R.drawable.style_all_recipe_tab)

            }
            override fun onTabReselected(tab: TabLayout.Tab?) {
                // 선택된 탭이 다시 선택되었을 때의 동작 처리

            }
        })
    }
}


