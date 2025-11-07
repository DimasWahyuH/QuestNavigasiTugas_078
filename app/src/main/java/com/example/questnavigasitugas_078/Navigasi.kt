package com.example.questnavigasitugas_078

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

enum class KelolaHalaman {
    Welcome,
    ListPeserta,
    Formulir
}

@Composable
fun Navigasiku(navController: NavHostController = rememberNavController()){

    NavHost(
        navController=navController,
        startDestination = KelolaHalaman.Welcome.name
    ){
        composable(route = KelolaHalaman.Welcome.name) {

        }
        composable(route = KelolaHalaman.ListPeserta.name) {

        }
        composable(route = KelolaHalaman.Formulir.name) {

        }
    }
}