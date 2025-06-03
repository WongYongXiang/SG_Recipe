package com.ltu.m7019e.sg_recipe_book.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.ltu.m7019e.sg_recipe.RecipeApplication
import com.ltu.m7019e.sg_recipe.database.Recipes
import com.ltu.m7019e.sg_recipe.model.Recipe
import kotlinx.coroutines.launch

sealed interface RecipeListUiState {
    data class Success(val recipes: List<Recipe>) : RecipeListUiState
    object Error : RecipeListUiState
    object Loading : RecipeListUiState
}

sealed interface SelectedRecipeUiState {
    data class Success(val recipe: Recipe) : SelectedRecipeUiState
    object Error : SelectedRecipeUiState
    object Loading : SelectedRecipeUiState
}

class RecipeViewModel(
    private val recipeRepository: Recipes
) : ViewModel() {

    var recipeListUiState: RecipeListUiState by mutableStateOf(RecipeListUiState.Loading)
        private set

    var selectedRecipeUiState: SelectedRecipeUiState by mutableStateOf(SelectedRecipeUiState.Loading)
        private set

    init {
        getAllRecipes()
    }

    fun getAllRecipes() {
        viewModelScope.launch {
            recipeListUiState = RecipeListUiState.Loading
            try {
                val recipes = recipeRepository.getRecipes()
                recipeListUiState = RecipeListUiState.Success(recipes)
            } catch (e: Exception) {
                recipeListUiState = RecipeListUiState.Error
            }
        }
    }

    fun setSelectedRecipe(recipe: Recipe) {
        viewModelScope.launch {
            selectedRecipeUiState = SelectedRecipeUiState.Loading
            try {
                selectedRecipeUiState = SelectedRecipeUiState.Success(recipe)
            } catch (e: Exception) {
                selectedRecipeUiState = SelectedRecipeUiState.Error
            }
        }
    }

    fun searchRecipes(query: String) {
        viewModelScope.launch {
            recipeListUiState = RecipeListUiState.Loading
            try {
                val recipes = recipeRepository.searchRecipes(query)
                recipeListUiState = RecipeListUiState.Success(recipes)
            } catch (e: Exception) {
                recipeListUiState = RecipeListUiState.Error
            }
        }
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY]
                        as RecipeApplication)
                RecipeViewModel(
                    recipeRepository = application.container.recipeRepository
                )
            }
        }
    }
}