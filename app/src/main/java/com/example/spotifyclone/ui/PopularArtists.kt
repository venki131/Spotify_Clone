package com.example.spotifyclone.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.spotifyclone.R
import com.example.spotifyclone.data.Artist
import com.example.spotifyclone.ui.theme.dosis

@Composable
fun PopularArtists(
    artists: List<Artist>
) {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            text = stringResource(R.string.popular_artists),
            fontFamily = dosis,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Start,
            fontSize = 20.sp,
            color = Color.Black,
            modifier = Modifier.padding(start = 16.dp)
        )
        ArtistList(artists) {
            //Clicked
        }
    }
}

@Composable
fun ArtistList(
    artists: List<Artist>,
    onClick: () -> Unit
) {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(artists.size) {
            Column(
                verticalArrangement = Arrangement.SpaceAround,
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = artists[it].artistImageId),
                    contentDescription = artists[it].artistName,
                    modifier = Modifier
                        .width(80.dp)
                        .height(80.dp)
                        .clip(RoundedCornerShape(50.dp))
                        .clickable {
                            onClick()
                        }
                )
                Text(
                    text = artists[it].artistName,
                    fontFamily = dosis,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.DarkGray,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
            }
        }
    }
}