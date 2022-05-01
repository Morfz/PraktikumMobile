package com.example.birds.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.birds.R
import com.example.birds.model.GalleryData

class GalleryViewModel : ViewModel() {

    private val _image = MutableLiveData<Int>()
    val image: LiveData<Int> = _image

    fun loadData(): List<GalleryData>{
        return listOf(
            GalleryData(R.drawable.burung1),
            GalleryData(R.drawable.burung2),
            GalleryData(R.drawable.burung3),
            GalleryData(R.drawable.burung4),
            GalleryData(R.drawable.burung5),
            GalleryData(R.drawable.burung6),
            GalleryData(R.drawable.burung7),
            GalleryData(R.drawable.burung8),
            GalleryData(R.drawable.burung9),
            GalleryData(R.drawable.burung10)
        )
    }

    fun setData(data: GalleryData){
        _image.value = data.imageResourceId
    }
}