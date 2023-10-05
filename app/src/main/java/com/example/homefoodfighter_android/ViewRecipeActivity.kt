package com.example.homefoodfighter_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homefoodfighter_android.Adapter.ViewRecipeAdapter
import com.example.homefoodfighter_android.Data.ViewRecipeData
import com.example.homefoodfighter_android.databinding.ActivityViewRecipeBinding

class ViewRecipeActivity : AppCompatActivity() {
    private lateinit var viewBinding : ActivityViewRecipeBinding
    private lateinit var adapter:ViewRecipeAdapter
    val mDatas=mutableListOf<ViewRecipeData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityViewRecipeBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        initViewRecipeRecyclerView()
        initializelist()
    }

    fun initViewRecipeRecyclerView(){
        val adapter=ViewRecipeAdapter() //어댑터 객체 만듦
        adapter.datalist=mDatas //데이터 넣어줌
        //viewBinding.recyclerView.adapter=adapter //리사이클러뷰에 어댑터 연결
        //viewBinding.recyclerView.layoutManager= GridLayoutManager(this,2) //레이아웃 매니저 연결

        viewBinding.recyclerView.adapter = adapter
        viewBinding.recyclerView.run {
            val spanCount = 2
            val space = 20
            addItemDecoration(GridSpaceItemDecoration(spanCount, space))
        }
    }

    fun initializelist(){ //임의로 데이터 넣어서 만들어봄
        with(mDatas){
            add(ViewRecipeData("스파게티","dog1","집밥김선생","",2.8,20,""))
            add(ViewRecipeData("김치볶음밥","dog2","집밥김선생","",4.6,20,""))
            add(ViewRecipeData("야채볶음밥","dog3","집밥김선생","",4.5,20,""))
            add(ViewRecipeData("스파게티","dog4","집밥김선생","",4.4,20,""))
            add(ViewRecipeData("김치볶음밥","dog5","집밥김선생","",4.3,20,""))
            add(ViewRecipeData("야채볶음밥","dog2","집밥김선생","",4.6,20,""))
            add(ViewRecipeData("스파게티","dog6","집밥김선생","",4.3,20,""))
            add(ViewRecipeData("야채볶음밥","dog7","집밥김선생","",4.4,20,""))

        }
    }
}