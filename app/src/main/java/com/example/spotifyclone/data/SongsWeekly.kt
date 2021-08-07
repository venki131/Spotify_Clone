package com.example.spotifyclone.data

import androidx.annotation.DrawableRes

data class SongsWeekly(
    val songName : String,
    val artist : String,
    @DrawableRes val coverArtId : Int
)
