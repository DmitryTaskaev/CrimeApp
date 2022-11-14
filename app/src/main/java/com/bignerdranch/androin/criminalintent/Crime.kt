package com.bignerdranch.androin.criminalintent

import android.view.View
import java.util.*
import java.util.Date

data class Crime(
    val id: UUID = UUID.randomUUID(),
    var title: String = "",
    var date: Date = Date(),
    var isSloved: Boolean = false,
    var  requiresPolice: View
    ) {
}