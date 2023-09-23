package com.example.homefoodfighter_android.Data

data class AllRecipeData(
    val recipe_name: String,
    val recipe_content: String,
    val recipe_writer:String,
    val writer_profile:String,
    val recipe_rate:Double,
    val review_num : Int,
    val recipe_image:String
)
