package com.example.spotifyclone.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.spotifyclone.data.SongsWeekly
import com.example.spotifyclone.ui.theme.dosis
import com.example.spotifyclone.R

@Composable
fun TopSongsWeekly(
    songsList: List<SongsWeekly>
) {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp, 0.dp, 0.dp, 0.dp)
    ) {
        Text(
            text = "Top weekly",
            fontFamily = dosis,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 30.sp,
            color = Color.Black,
            textAlign = TextAlign.Start
        )

        LazyColumn(
            contentPadding = PaddingValues(start = 8.dp, end = 8.dp, top = 8.dp, bottom = 100.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.fillMaxSize()
        ) {
            itemsIndexed(songsList) { index, item ->
                Row(
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Text(
                        text = "${index + 1}",
                        fontFamily = dosis,
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp,
                        textAlign = TextAlign.Justify,
                        color = Color.Black,
                        modifier = Modifier
                            .width(15.dp)
                    )

                    Image(
                        painter = painterResource(id = item.coverArtId),
                        contentDescription = item.artist,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .width(60.dp)
                            .height(60.dp)
                            .clip(RoundedCornerShape(4.dp))
                    )

                    Column(
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Text(
                            text = item.songName,
                            fontFamily = dosis,
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 22.sp,
                            textAlign = TextAlign.Start,
                            color = Color.Black
                        )

                        Text(
                            text = item.artist,
                            fontFamily = dosis,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Start,
                            color = Color.Gray
                        )
                    }

                    Icon(
                        painter = painterResource(id = R.drawable.ic_horiz_dots),
                        contentDescription = stringResource(R.string.hold_to_drag_item),
                        modifier = Modifier.fillMaxSize(),
                        tint = Color.Gray
                    )
                }
            }
        }
    }
}