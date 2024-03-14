package com.cristikers.samples.navigation.ui.pets

import com.cristikers.samples.navigation.R

class PetModel (
    val name: String,
    val emoji: String,
    val resPicture: Int
)

object Data {
    val petMap = mapOf(
        "dalia" to PetModel("Dalita", "\uD83D\uDC08\u200D⬛", R.drawable.dalita),
        "cleme" to PetModel("Clementina", "\uD83D\uDC05", R.drawable.clementina),
        "fideo" to PetModel("Fideo", "\uD83D\uDC30", R.drawable.fideo),
        "simona" to PetModel("Simonita", "\uD83E\uDD9D", R.drawable.simonita),
    )
}