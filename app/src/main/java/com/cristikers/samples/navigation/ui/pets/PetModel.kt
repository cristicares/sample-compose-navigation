package com.cristikers.samples.navigation.ui.pets

import com.cristikers.samples.navigation.R

class PetModel (
    val name: String,
    val emoji: String,
    val resPicture: Int
)

object Data {
    val petMap = mapOf(
        "Dalita" to PetModel("Dalita", "\uD83D\uDC08\u200D⬛", R.drawable.dalita),
        "Clementina" to PetModel("Clementina", "\uD83D\uDC05", R.drawable.clementina),
        "Fideo" to PetModel("Fideo", "\uD83D\uDC30", R.drawable.fideo),
        "Simonita" to PetModel("Simonita", "\uD83E\uDD9D", R.drawable.simonita),
    )
}