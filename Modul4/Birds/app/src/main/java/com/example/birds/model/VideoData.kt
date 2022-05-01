package com.example.birds.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class VideoData(
    @DrawableRes val imageResourceId: Int,
    @StringRes val linkResourceId: Int
)