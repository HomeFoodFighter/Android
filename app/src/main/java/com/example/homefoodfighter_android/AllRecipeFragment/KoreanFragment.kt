package com.example.homefoodfighter_android.AllRecipeFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.homefoodfighter_android.Adapter.AllRecipeRecycleAdapter
import com.example.homefoodfighter_android.Adapter.RealTimeAdapter
import com.example.homefoodfighter_android.Data.AllRecipeData
import com.example.homefoodfighter_android.Data.RealTimeData
import com.example.homefoodfighter_android.R
import com.example.homefoodfighter_android.databinding.FragmentKoreanBinding

class KoreanFragment : Fragment() {
    private lateinit var viewBinding : FragmentKoreanBinding
    private lateinit var adapter: AllRecipeRecycleAdapter
    val mDatas=mutableListOf<AllRecipeData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentKoreanBinding.inflate(layoutInflater)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initAllRecipeRecyclerView()
        initializelist()
    }
    fun initAllRecipeRecyclerView(){
        val adapter=AllRecipeRecycleAdapter() //어댑터 객체 만듦
        adapter.datalist=mDatas //데이터 넣어줌
        viewBinding.recyclerView.adapter=adapter //리사이클러뷰에 어댑터 연결
        viewBinding.recyclerView.layoutManager= GridLayoutManager(requireContext(),2) //레이아웃 매니저 연결
    }

    fun initializelist(){ //임의로 데이터 넣어서 만들어봄
        with(mDatas){
            add(AllRecipeData("스파게티","dog1","집밥김선생","",2.8,20,""))
            add(AllRecipeData("김치볶음밥","dog2","집밥김선생","",4.6,20,""))
            add(AllRecipeData("야채볶음밥","dog3","집밥김선생","",4.5,20,""))
            add(AllRecipeData("스파게티","dog4","집밥김선생","",4.4,20,""))
            add(AllRecipeData("김치볶음밥","dog5","집밥김선생","",4.3,20,""))
            add(AllRecipeData("야채볶음밥","dog2","집밥김선생","",4.6,20,""))
            add(AllRecipeData("스파게티","dog6","집밥김선생","",4.3,20,""))
            add(AllRecipeData("야채볶음밥","dog7","집밥김선생","",4.4,20,""))

        }
    }
}