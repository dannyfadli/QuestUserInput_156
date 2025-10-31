package com.example.userinput

import android.R
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import java.lang.reflect.Modifier

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

}