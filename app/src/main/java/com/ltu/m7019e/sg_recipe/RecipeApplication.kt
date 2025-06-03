package com.ltu.m7019e.sg_recipe

import android.app.Application
import com.ltu.m7019e.sg_recipe.database.Recipes

class RecipeApplication : Application() {
    val container by lazy {AppContainer()}
}

class AppContainer {
    val recipeRepository: Recipes by lazy { Recipes()}
}