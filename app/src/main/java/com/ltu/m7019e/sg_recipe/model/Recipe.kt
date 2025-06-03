package com.ltu.m7019e.sg_recipe.model

import androidx.room.Dao
import androidx.room.Database
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.PrimaryKey
import androidx.room.Query
import androidx.room.RoomDatabase

@Database(entities = [Recipe::class], version = 1)
abstract class RecipeDatabase : RoomDatabase() {
    abstract fun recipeDao(): RecipeDao
}

@Entity
data class Recipe(
    @PrimaryKey val id: Int,
    val name: String,
    val servings: String,
    val ingredients: String,
    val directions: String,
    val imageRes: Int //Store drawable resource ID
)

@Dao
interface RecipeDao {
    @Query("SELECT * FROM recipe")
    fun getAll(): List<Recipe>

    @Insert
    fun insertAll(vararg recipes: Recipe)
}