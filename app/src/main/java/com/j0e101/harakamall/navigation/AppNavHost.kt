package com.j0e101.harakamall.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.j0e101.harakamall.data.UserDatabase
import com.j0e101.harakamall.repository.UserRepository
import com.j0e101.harakamall.ui.screens.about.AboutScreen
import com.j0e101.harakamall.ui.screens.assignment.NewScreen
import com.j0e101.harakamall.ui.screens.auth.LoginScreen
import com.j0e101.harakamall.ui.screens.auth.RegisterScreen
import com.j0e101.harakamall.ui.screens.contact.ContactScreen
import com.j0e101.harakamall.ui.screens.dashboard.DashboardScreen
import com.j0e101.harakamall.ui.screens.form.FormScreen
import com.j0e101.harakamall.ui.screens.home.HomeScreen
import com.j0e101.harakamall.ui.screens.intent.IntentScreen
import com.j0e101.harakamall.ui.screens.item.ItemScreen
import com.j0e101.harakamall.ui.screens.products.AddProductScreen
import com.j0e101.harakamall.ui.screens.products.EditProductScreen
import com.j0e101.harakamall.ui.screens.products.ProductListScreen
import com.j0e101.harakamall.ui.screens.service.ServiceScreen
import com.j0e101.harakamall.ui.screens.start.StartScreen
import com.j0e101.harakamall.viewmodel.AuthViewModel
import com.j0e101.harakamall.viewmodel.ProductViewModel

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_REGISTER
) {

    val context = LocalContext.current

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_ITEM) {
            ItemScreen(navController)
        }
        composable(ROUT_CONTACT) {
            ContactScreen(navController)
        }
        composable(ROUT_START) {
            StartScreen(navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }
        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController)
        }
        composable(ROUT_SERVICE) {
            ServiceScreen(navController)
        }
        composable(ROUT_FORM) {
            FormScreen(navController)
        }
        composable(ROUT_NEWSCREEN) {
            NewScreen(navController)
        }

        //AUTHENTICATION

        // Initialize Room Database and Repository for Authentication
        val appDatabase = UserDatabase.getDatabase(context)
        val authRepository = UserRepository(appDatabase.userDao())
        val authViewModel: AuthViewModel = AuthViewModel(authRepository)
        composable(ROUT_REGISTER) {
            RegisterScreen(authViewModel, navController) {
                navController.navigate(ROUT_LOGIN) {
                    popUpTo(ROUT_REGISTER) { inclusive = true }
                }
            }
        }

        composable(ROUT_LOGIN) {
            LoginScreen(authViewModel, navController) {
                navController.navigate(ROUT_HOME) {
                    popUpTo(ROUT_LOGIN) { inclusive = true }
                }
            }
        }

        // PRODUCTS
        composable(ROUT_ADD_PRODUCT) {
            AddProductScreen(navController, productViewModel)
        }

        composable(ROUT_PRODUCT_LIST) {
            ProductListScreen(navController, productViewModel)
        }

        composable(
            route = ROUT_EDIT_PRODUCT,
            arguments = listOf(navArgument("productId") { type = NavType.IntType })
        ) { backStackEntry ->
            val productId = backStackEntry.arguments?.getInt("productId")
            if (productId != null) {
                EditProductScreen(productId, navController, productViewModel)
            }
        }

    }
}
