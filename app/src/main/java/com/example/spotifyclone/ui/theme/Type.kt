package com.example.spotifyclone.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.spotifyclone.R

val dosis = FontFamily(
    listOf(
        Font(R.font.dosis_regular, FontWeight.Normal),
        Font(R.font.dosis_light, FontWeight.Light),
        Font(R.font.dosis_extra_light, FontWeight.ExtraLight),
        Font(R.font.dosis_medium, FontWeight.Medium),
        Font(R.font.dosis_semi_bold, FontWeight.SemiBold),
        Font(R.font.dosis_bold, FontWeight.Bold),
        Font(R.font.dosis_extra_bold, FontWeight.ExtraBold),
    )
)

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = dosis,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    h1 = TextStyle(
        color = Color.Black,
        fontFamily = dosis,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp
    ),
    h2 = TextStyle(
        color = Color.Black,
        fontFamily = dosis,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp
    )
)