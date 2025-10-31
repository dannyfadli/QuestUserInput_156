package com.example.userinput


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable

fun FormDataDiri(modifier: Modifier){
    //Variabel-varliabel untuk mengingat nilai masuukan dari keyboard

    var textNama by remember {mutableStateOf("")}

    var textAlamat by remember {mutableStateOf("")}

    var textJK by remember {mutableStateOf("")}

    //Variabel-Variabel untuk menyimpan data yg diperoleh dari komponen ui

    var nama by remember {mutableStateOf("")}

    var alamat by remember {mutableStateOf("")}

    var jenis by remember {mutableStateOf("")}


    var gende: List<String> = listOf("Laki-laki","Perempuan")


    Column(modifier = Modifier.padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,





}