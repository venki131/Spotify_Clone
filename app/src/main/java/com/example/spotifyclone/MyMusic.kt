package com.example.spotifyclone


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.spotifyclone.data.Artist
import com.example.spotifyclone.data.BottomMenuContent
import com.example.spotifyclone.data.PlayListType
import com.example.spotifyclone.ui.BottomMenu
import com.example.spotifyclone.ui.Header
import com.example.spotifyclone.ui.PlayList
import com.example.spotifyclone.ui.PopularArtists

@Composable
fun MyMusic() {
    Box(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
    ) {
        Column {
            Header {
                //TODO search result
            }
            PopularArtists(artistList())
            PlayList(playList())
        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            elevation = 8.dp
        ) {
            BottomMenu(
                items = listOf(
                    BottomMenuContent(stringResource(R.string.home), R.drawable.ic_home),
                    BottomMenuContent(stringResource(R.string.search), R.drawable.ic_search),
                    BottomMenuContent(stringResource(R.string.library), R.drawable.ic_library),
                    BottomMenuContent(stringResource(R.string.premium), R.drawable.ic_premium),
                ), modifier = Modifier.align(Alignment.BottomCenter)
            )
        }

    }
}

private fun artistList() : List<Artist> {
    val artist1 = Artist ("Dua Lipa", R.drawable.dua_lipa)
    val artist2 = Artist ("Taylor Swift", R.drawable.taylor_swift)
    val artist3 = Artist ("Billie Eilish", R.drawable.billie_eilish)
    val artist4 = Artist ("Ed Sheeran", R.drawable.ed_sheeran)
    val artist5 = Artist ("Bruno Mars", R.drawable.bruno_mars)
    val artist6 = Artist ("Britney Spears", R.drawable.britney_spears)
    return listOf(artist1, artist2, artist3, artist4, artist5, artist6)
}

private fun playList() : List<PlayListType> {
    val item1 = PlayListType("Lo-Fi Beats", R.drawable.lofi_beats)
    val item2 = PlayListType("Deep Focus", R.drawable.deep_focus)
    val item3 = PlayListType("Travel", R.drawable.travel)
    return listOf(item1, item2, item3)
}

