package com.example.questadvancelayout_058

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//libraries or dependencies can be add after function

@Composable
fun ActivitasPertama(modifier:Modifier){
    Column(modifier = Modifier.padding(top=100.dp)  //untuk menambahkan dependency drag cursor ke collumn or etc yang merah lalu klik import
        .fillMaxSize(),                             //maka otomatis import column akan ditambahkan
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text( stringResource(R.string.prodi),
            fontSize = 35.sp,  // font size dapat di atur ukurannya menggunakan .sp
            fontWeight = FontWeight.Bold) // text bisa di ubah menjadi bold dll melalui fontWight.
        Text(stringResource(R.string.univ),
                fontSize = 22.sp)
        Spacer(modifier = Modifier.height(25.dp)) //spacer digunakan untuk menambahkan jarak
        Card (modifier = Modifier
            .fillMaxWidth(1f)
            .padding(12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.DarkGray //menambahkan warna
            )) {
            Row() {
                val gambar = painterResource(R.drawable.logo_umy) //menambahkan logo yang dipanggil melalui resource drawable
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier.size(100.dp).padding(5.dp) //memodifikasi besaran logo
                )
                Spacer(modifier = Modifier.width(30.dp))
                Column() {
                    Text(
                        stringResource(R.string.nama),
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.White,
                        modifier = Modifier.padding(top=15.dp)
                    )
                    Text(
                        stringResource(R.string.alamat),
                        fontSize = 20.sp,
                        color = Color.Yellow,
                        modifier = Modifier.padding(top=10.dp)
                    )
                }
            }
        }
        Box (
            modifier = Modifier
                .fillMaxSize()
        ) {
                Text(
                    stringResource(R.string.copy),
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 50.dp)
                )
        }
    }
}

