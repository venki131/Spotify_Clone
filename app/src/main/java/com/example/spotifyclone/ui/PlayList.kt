package com.example.spotifyclone.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.spotifyclone.R
import com.example.spotifyclone.data.PlayListType
import com.example.spotifyclone.ui.theme.dosis

@Composable
fun PlayList(
    playList: List<PlayListType>
) {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = stringResource(R.string.playlists),
                fontFamily = dosis,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 30.sp,
                color = Color.Black
            )
            Text(
                text = stringResource(R.string.albums),
                fontFamily = dosis,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 30.sp,
                color = Color.Gray
            )
            Text(
                text = stringResource(R.string.songs),
                fontFamily = dosis,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 30.sp,
                color = Color.Gray
            )
        }
        Spacer(modifier = Modifier.height(20.dp))

        LazyRow {
            items(playList.size) {
                Box(
                    modifier = Modifier
                        .height(180.dp)
                        .width(200.dp)
                        .padding(16.dp)
                ) {
                    Image(
                        painter = painterResource(id = playList[it].playListImageId),
                        contentDescription = playList[it].typeOfMusic,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(RoundedCornerShape(10.dp))
                    )

                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = playList[it].typeOfMusic,
                            fontFamily = dosis,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White,
                            fontSize = 24.sp
                        )
                    }
                }
            }
        }
    }
}