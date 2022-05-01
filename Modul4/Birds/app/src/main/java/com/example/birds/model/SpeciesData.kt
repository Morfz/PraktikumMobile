package com.example.birds.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class SpeciesData (
    @StringRes val nameResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    @StringRes val descResourceId: Int
)