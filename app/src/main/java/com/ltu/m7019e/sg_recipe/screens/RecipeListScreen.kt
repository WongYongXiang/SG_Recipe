package com.ltu.m7019e.sg_recipe.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.ltu.m7019e.sg_recipe.model.Recipe
import com.ltu.m7019e.sg_recipe_book.viewmodel.RecipeListUiState
import androidx.compose.ui.res.painterResource

@Composable
fun RecipeListScreen(
    recipeListUiState: RecipeListUiState,
    onRecipeItemClicked: (Recipe) -> Unit,
    modifier: Modifier = Modifier
) {
    when (recipeListUiState) {
        is RecipeListUiState.Success -> {
            LazyColumn(modifier = modifier) {
                items(recipeListUiState.recipes) { recipe ->
                    RecipeListItemCard(
                        recipe = recipe,
                        onRecipeItemClicked = onRecipeItemClicked,
                        modifier = Modifier
                            .padding(8.dp)
                            .height(120.dp)
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
fun RecipeListItemCard(
    recipe: Recipe,
    onRecipeItemClicked: (Recipe) -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
        onClick = { onRecipeItemClicked(recipe) },
        elevation = CardDefaults.cardElevation(4.dp), //shadow
        shape = MaterialTheme.shapes.medium //rounded corners
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            // Image on the left
            Image(
                painter = painterResource(id = recipe.imageRes),
                contentDescription = recipe.name,
                modifier = Modifier
                    .size(100.dp) // Fixed size for list items
                    .clip(MaterialTheme.shapes.small), // rounded corners
                contentScale = ContentScale.Crop // Crop to fit
            )

            // Text content on the right
            Column(
                modifier = Modifier
                    .padding(start = 12.dp)
                    .weight(1f)
            ) {
                Text(
                    text = recipe.name,
                    style = MaterialTheme.typography.headlineSmall,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Serves: ${recipe.servings}",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}