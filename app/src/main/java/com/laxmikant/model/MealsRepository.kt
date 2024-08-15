package com.laxmikant.model

import com.laxmikant.model.api.MealsApiService
import com.laxmikant.model.response.MealsCategoriesResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MealsRepository(private val mealsApiService: MealsApiService = MealsApiService()) {
    suspend fun getMeals(): MealsCategoriesResponse {
        return mealsApiService.getMeals()
    }
}