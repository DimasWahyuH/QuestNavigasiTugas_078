package com.example.questnavigasitugas_078.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.questnavigasitugas_078.R

@Composable
fun ListPeserta(navController: NavHostController, viewModel: Any){
    val peserta = stringArrayResource(id = R.array.data_peserta)
    val gradient = Brush.verticalGradient(
        colors = listOf(Color.White, Color.LightGray)
    )
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .background(gradient)
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Daftar Peserta",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            Spacer(modifier = Modifier.padding(20.dp))

            peserta.forEach { peserta ->
                Card (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 6.dp),
                    shape = RoundedCornerShape(16.dp),
                    elevation = CardDefaults.cardElevation(8.dp)
                ){
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(text = peserta, fontSize = 16.sp)
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                Button(
                    onClick = { navController.navigate("Welcome") },
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 32.dp)
                ) {
                    Text(text = "Beranda")
                }
                Spacer(modifier = Modifier.height(12.dp))

                Button(
                    onClick = { navController.navigate("Formulir") },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 32.dp)
                ) {
                    Text("Formulir Perdaftaran", color = Color.White)
                }
            }
        }
    }
}