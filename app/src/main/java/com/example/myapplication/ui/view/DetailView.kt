package com.example.myapplication.ui.view

import com.example.myapplication.ui.navigation.DestinasiNavigasi

object DetailDestination : DestinasiNavigasi {
    override val route = "item_details"
    override val titleRes = "Detail Kontak"
    const val mahasiswaId = "itemId"
    val routeWithArgs = "$route/{$mahasiswaId}"
}