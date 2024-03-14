package com.cristikers.samples.navigation.ui.pets

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cristikers.samples.navigation.ui.theme.SampleTheme

@Composable
fun PetsScreen(
    onBackIconClick: () -> Unit
) {
    val petMap = remember { Data.petMap }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column {
            Row(verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = { onBackIconClick() }) {
                    Icon(
                        imageVector = Icons.Rounded.ArrowBack,
                        contentDescription = "Volver"
                    )
                }

                Text(
                    text = "Mis mascotas",
                    style = MaterialTheme.typography.headlineSmall,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
            }

            LazyColumn(
                modifier = Modifier.fillMaxWidth()
            ) {
                items(petMap.values.toList()) {pet ->
                    Text(
                        modifier = Modifier.padding(vertical = 4.dp),
                        text = "${pet.emoji} ${pet.name}"
                    )
                }
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PetsScreenPreview() {
    SampleTheme {
        PetsScreen {}
    }
}