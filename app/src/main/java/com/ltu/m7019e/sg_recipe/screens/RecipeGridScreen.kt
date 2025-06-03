package com.ltu.m7019e.sg_recipe.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.ltu.m7019e.sg_recipe.model.Recipe
import com.ltu.m7019e.sg_recipe_book.viewmodel.RecipeListUiState

@Composable
fun RecipeGridScreen(
    recipeListUiState: RecipeListUiState,
    onRecipeItemClicked: (Recipe) -> Unit,
    modifier: Modifier = Modifier
) {
    when (recipeListUiState) {
        is RecipeListUiState.Success -> {
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = modifier,
                contentPadding = PaddingValues(8.dp)
            ) {
                items(recipeListUiState.recipes) { recipe ->
                    RecipeGridItem(
                        recipe = recipe,
                        onRecipeItemClicked = onRecipeItemClicked,
                        modifier = Modifier
                            .padding(8.dp)
                            .height(250.dp)
                    )
                }
            }
        }
        RecipeListUiState.Loading -> {
            Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                CircularProgressIndicator()
            }
        }
        RecipeListUiState.Error -> {
            Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text("Error loading recipes")
            }
        }
    }
}

@Composable
fun RecipeGridItem(
    recipe: Recipe,
    onRecipeItemClicked: (Recipe) -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
        onClick = { onRecipeItemClicked(recipe) },
        elevation = CardDefaults.cardElevation(4.dp), // Add shadow
        shape = MaterialTheme.shapes.medium //Rounded corners
    ) {
        Column {
            // Display the image from res/drawable
            Image(
                painter = painterResource(id = recipe.imageRes),
                contentDescription = recipe.name,
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f), // Square aspect ratio
                contentScale = ContentScale.Crop // Crop to fit
            )

            // Text content below the image
            Column(Modifier.padding(8.dp)) {
                Text(
                    text = recipe.name,
                    style = MaterialTheme.typography.titleMedium,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(Modifier.height(4.dp))
                Text(
                    text = "Serves: ${recipe.servings}",
                    style = MaterialTheme.typography.labelSmall
                )
            }
        }
    }
}