package com.laxmikant.model.response

data class MealsCategoriesResponse(val categories: List<MealResponse>)

data class MealResponse(
    val idCategory: String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String
)