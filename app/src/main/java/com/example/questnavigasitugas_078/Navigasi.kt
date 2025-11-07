package com.example.questnavigasitugas_078

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.questnavigasitugas_078.view.Formulir
import com.example.questnavigasitugas_078.view.ListPeserta
import com.example.questnavigasitugas_078.view.Welcome

enum class KelolaHalaman {
    Welcome,
    ListPeserta,
    Formulir
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
){

    NavHost(
        navController=navController,
        startDestination = KelolaHalaman.Welcome.name
    ){
        composable(route = KelolaHalaman.Welcome.name) {
            Welcome(navController=navController)
        }
        composable(route = KelolaHalaman.ListPeserta.name) {
            ListPeserta(navController=navController, viewModel ())
        }
        composable(route = KelolaHalaman.Formulir.name) {
            Formulir(navController=navController, viewModel ())
        }
    }
}