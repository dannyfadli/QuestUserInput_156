package com.example.userinput

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun FormulirPendaftaran(modifier: Modifier) {
    // state input
    var namaInput by remember { mutableStateOf("") }
    var alamatInput by remember { mutableStateOf("") }
    var jkInput by remember { mutableStateOf("") }
    var statusInput by remember { mutableStateOf("") }

    // state hasil submit
    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var jk by remember { mutableStateOf("") }
    var status by remember { mutableStateOf("") }

    val gender = listOf("Laki-laki", "Perempuan")
    val statusList = listOf("Janda", "Lajang", "Duda")

    Box(modifier = Modifier.fillMaxSize()) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(Color(0xFF9C27B0), Color(0xFFBA68C8))
                    )
                )
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .background(Color.White)
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 60.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = "Formulir Pendaftaran",
                fontSize = 30.sp,
                color = Color(0xFF6A1B9A),
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(20.dp))
            // Card putih di tengah
            Card(
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .padding(30.dp),
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(6.dp)
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.Start
                ) {
                    // Nama Lengkap
                    Text(text = "NAMA LENGKAP", color = Color.Gray, fontSize = 12.sp)
                    OutlinedTextField(
                        value = namaInput,
                        onValueChange = { namaInput = it },
                        label = { Text("Isikan nama lengkap") },
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    // Jenis Kelamin
                    Text(text = "JENIS KELAMIN", color = Color.Gray, fontSize = 12.sp)
                    gender.forEach { item ->
                        Row(
                            modifier = Modifier
                                .selectable(
                                    selected = (jkInput == item),
                                    onClick = { jkInput = item }
                                ),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            RadioButton(selected = (jkInput == item), onClick = { jkInput = item })
                            Text(text = item)
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    // Status Perkawinan
                    Text(text = "STATUS PERKAWINAN", color = Color.Gray, fontSize = 12.sp)
                    statusList.forEach { item ->
                        Row(
                            modifier = Modifier
                                .selectable(
                                    selected = (statusInput == item),
                                    onClick = { statusInput = item }
                                ),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            RadioButton(
                                selected = (statusInput == item),
                                onClick = { statusInput = item })
                            Text(text = item)
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    // Alamat
                    Text(text = "ALAMAT", color = Color.Gray, fontSize = 12.sp)
                    OutlinedTextField(
                        value = alamatInput,
                        onValueChange = { alamatInput = it },
                        label = { Text("Alamat") },
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    // Tombol Submit
                    Button(
                        onClick = {
                            nama = namaInput
                            jk = jkInput
                            status = statusInput
                            alamat = alamatInput
                        },
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF7B1FA2))
                    ) {
                        Text("Submit", color = Color.White)
                    }

                    Spacer(modifier = Modifier.height(16.dp))
                }
            }


            // Card hasil submit
            ElevatedCard(
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                modifier = Modifier
                    .width(320.dp)
                    .height(120.dp)
            ) {
                Column(modifier = Modifier.padding(12.dp)) {
                    Text(text = "Nama : " + nama, color = Color.Black)
                    Text(text = "Jenis Kelamin : " + jk, color = Color.Black)
                    Text(text = "Status : " + status, color = Color.Black)
                    Text(text = "Alamat : " + alamat, color = Color.Black)
                }
            }
        }
    }
}
