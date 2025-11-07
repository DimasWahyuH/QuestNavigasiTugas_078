package com.example.questnavigasitugas_078.view

import android.R.attr.elevation
import android.R.attr.shape
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CheckboxDefaults.colors
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun Formulir(navController: NavHostController, viewmodel: Any) {
    var nama by remember { mutableStateOf("") }
    var jenisKelamin by remember { mutableStateOf("") }
    var status by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }

    val genderOptions = listOf("Laki-laki", "Perempuan")
    val statusOptions = listOf("Menikah", "Belum Menikah")

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 12.dp),
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(8.dp),
        colors = CardDefaults.cardColors(containerColor = Color.Gray)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Formulir Perdaftaran",
                color = Color.White,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
                    .background(Color.Blue)
                    .padding(vertical = 14.dp),
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Nama Lengkap",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                color = Color.DarkGray,
                modifier = Modifier.align(Alignment.Start)
            )
            OutlinedTextField(
                value = nama,
                onValueChange = { nama = it },
                label = { Text( "Isian Nama Lengkap") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))


            Text(
                text = "Jenis Kelamin",
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                color = Color.DarkGray,
                modifier = Modifier.align(Alignment.Start)
            )
            genderOptions.forEach { item ->
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .selectable(
                            selected = jenisKelamin == item,
                            onClick = { jenisKelamin = item }

                        )
                        .padding(vertical = 4.dp)
                ) {
                    RadioButton(
                        selected = jenisKelamin == item,
                        onClick = { jenisKelamin = item }
                    )
                    Text(text = item)
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Status Perkawinan",
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                color = Color.DarkGray,
                modifier = Modifier.align(Alignment.Start)

            )
            statusOptions.forEach { item ->
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .selectable(
                            selected = status == item,
                            onClick = { status = item }
                        )
                        .padding(vertical = 4.dp)
                ){
                    RadioButton(
                        selected = status == item,
                        onClick = { status = item }
                    )
                    Text(text = item)
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Alamat",
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                color = Color.DarkGray,
                modifier = Modifier.align(Alignment.Start)
            )
            OutlinedTextField(
                value = alamat,
                onValueChange = { alamat = it },
                label = { Text("Isian Alamat") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(Color.Gray)
            ) {
                Text("Submit", fontSize = 10.sp, color = Color.Black)
            }
        }
    }
}