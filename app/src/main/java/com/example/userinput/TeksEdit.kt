package com.example.userinput

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import java.lang.reflect.Modifier

@Composable

fun FormDataDiri(modifier: Modifier){
    //Variabel-varliabel untuk mengingat nilai masuukan dari keyboard

    var textNama by remember { mutableStateOf("") }
}