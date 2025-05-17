package com.ltu.m7019e.sg_recipe_book.model

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
    val directions: String
)

@Dao
interface RecipeDao {
    @Query("SELECT * FROM recipe")
    fun getAll(): List<Recipe>

    @Insert
    fun insertAll(vararg recipes: Recipe)
}