package com.laxmikant.mealzapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.laxmikant.model.MealsRepository
import com.laxmikant.model.response.MealResponse
import com.laxmikant.model.response.MealsCategoriesResponse

class MealsAppViewModel(private val mealsRepository: MealsRepository = MealsRepository()): ViewModel() {

    val mealsState: MutableState<List<MealResponse>> = mutableStateOf(emptyList<MealResponse>())
    suspend fun getMeals() : MealsCategoriesResponse {
        return mealsRepository.getMeals()
    }
}