package com.ltu.m7019e.sg_recipe

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.ltu.m7019e.sg_recipe.screens.RecipeGridScreen
import com.ltu.m7019e.sg_recipe.screens.RecipeListScreen
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ltu.m7019e.sg_recipe.screens.RecipeDetailScreen
import com.ltu.m7019e.sg_recipe_book.viewmodel.RecipeViewModel

enum class RecipeScreen(@StringRes val title: Int) {
    List(title = R.string.list_view),
    Grid(title = R.string.grid_view),
    Detail(title = R.string.recipe_detail)
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)
@Composable
fun RecipeAppBar(
    currentScreen: RecipeScreen,
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    onViewToggle: () -> Unit,
    modifier: Modifier = Modifier
) {
    var menuExpanded by remember { mutableStateOf(false) }

    TopAppBar(
        title = { Text(stringResource(currentScreen.title)) },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        ),
        modifier = modifier,
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = stringResource(R.string.back_button)
                    )
                }
            }
        },
        actions = {
            IconButton(onClick = { menuExpanded = !menuExpanded }) {
                Icon(
                    imageVector = Icons.Filled.MoreVert,
                    contentDescription = stringResource(R.string.menu_description)
                )
            }
            DropdownMenu(
                expanded = menuExpanded,
                onDismissRequest = { menuExpanded = false }
            ) {
                if (currentScreen == RecipeScreen.List || currentScreen == RecipeScreen.Grid) {
                    DropdownMenuItem(
                        onClick = {
                            onViewToggle()
                            menuExpanded = false
                        },
                        text = {
                            Text(
                                if (currentScreen == RecipeScreen.List)
                                    stringResource(R.string.grid_view)
                                else
                                    stringResource(R.string.list_view)
                            )
                        }
                    )
                }
                DropdownMenuItem(
                    onClick = {
                        // Buffer
                        menuExpanded = false
                    },
                    text = { Text("Filter by Category") }
                )
            }
        }
    )
}

@Composable
fun RecipeApp(
    navController: NavHostController = rememberNavController(),
    recipeViewModel: RecipeViewModel = viewModel(factory = RecipeViewModel.Factory)
) {
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = RecipeScreen.valueOf(
        backStackEntry?.destination?.route ?: RecipeScreen.List.name
    )

    val onViewToggle = {
        when (currentScreen) {
            RecipeScreen.List -> navController.navigate(RecipeScreen.Grid.name) {
                popUpTo(RecipeScreen.List.name) { inclusive = true }
            }
            RecipeScreen.Grid -> navController.navigate(RecipeScreen.List.name) {
                popUpTo(RecipeScreen.Grid.name) { inclusive = true }
            }
            else -> {}
        }
    }

    Scaffold(
        topBar = {
            RecipeAppBar(
                currentScreen = currentScreen,
                canNavigateBack = navController.previousBackStackEntry != null,
                navigateUp = { navController.navigateUp() },
                onViewToggle = onViewToggle
            )
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = RecipeScreen.List.name,
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            composable(route = RecipeScreen.List.name) {
                RecipeListScreen(
                    recipeListUiState = recipeViewModel.recipeListUiState,
                    onRecipeItemClicked = { recipe ->
                        recipeViewModel.setSelectedRecipe(recipe)
                        navController.navigate(RecipeScreen.Detail.name)
                    },
                    modifier = Modifier.fillMaxSize().padding(16.dp)
                )
            }
            composable(route = RecipeScreen.Grid.name) {
                RecipeGridScreen(
                    recipeListUiState = recipeViewModel.recipeListUiState,
                    onRecipeItemClicked = { recipe ->
                        recipeViewModel.setSelectedRecipe(recipe)
                        navController.navigate(RecipeScreen.Detail.name)
                    },
                    modifier = Modifier.fillMaxSize().padding(16.dp)
                )
            }
            composable(route = RecipeScreen.Detail.name) {
                RecipeDetailScreen(
                    selectedRecipeUiState = recipeViewModel.selectedRecipeUiState,
                    onBack = { navController.popBackStack() }
                )
            }
        }
    }
}