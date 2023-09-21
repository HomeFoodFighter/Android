package com.example.homefoodfighter_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.homefoodfighter_android.Adapter.LikedFoodAdapter
import com.example.homefoodfighter_android.Adapter.ViewRecipeAdapter
import com.example.homefoodfighter_android.Data.LikedFoodData
import com.example.homefoodfighter_android.Data.ViewRecipeData
import com.example.homefoodfighter_android.databinding.ActivityLikedFoodChoiceBinding

class LikedFoodChoiceActivity : AppCompatActivity() {
    private lateinit var viewBinding : ActivityLikedFoodChoiceBinding
    private lateinit var adapter: LikedFoodAdapter
    val mDatas=mutableListOf<LikedFoodData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityLikedFoodChoiceBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        initLikedFoodRecyclerView()
        initializelist()
    }

    fun initLikedFoodRecyclerView(){
        val adapter=LikedFoodAdapter() //어댑터 객체 만듦
        adapter.datalist=mDatas //데이터 넣어줌
        viewBinding.recyclerView.adapter=adapter //리사이클러뷰에 어댑터 연결
        viewBinding.recyclerView.layoutManager= GridLayoutManager(this,2) //레이아웃 매니저 연결
    }

    fun initializelist(){ //임의로 데이터 넣어서 만들어봄
        with(mDatas){
            add(LikedFoodData("스파게티","dog1","집밥김선생","",2.8,20,""))
            add(LikedFoodData("김치볶음밥","dog2","집밥김선생","",4.6,20,""))
            add(LikedFoodData("야채볶음밥","dog3","집밥김선생","",4.5,20,""))
            add(LikedFoodData("스파게티","dog4","집밥김선생","",4.4,20,""))
            add(LikedFoodData("김치볶음밥","dog5","집밥김선생","",4.3,20,""))
            add(LikedFoodData("야채볶음밥","dog2","집밥김선생","",4.6,20,""))
            add(LikedFoodData("스파게티","dog6","집밥김선생","",4.3,20,""))
            add(LikedFoodData("야채볶음밥","dog7","집밥김선생","",4.4,20,""))

        }
    }
}