package com.example.birds.ui.video

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.birds.R
import com.example.birds.model.VideoData

class VideoViewModel : ViewModel() {
    private val _image = MutableLiveData<Int>()
    val image: LiveData<Int> = _image

    private val _link = MutableLiveData<String>()
    val link: LiveData<String> = _link

    fun loadData(): List<VideoData>{
        return listOf(
            VideoData(R.drawable.burung1, R.string.video1),
            VideoData(R.drawable.burung2, R.string.video2),
            VideoData(R.drawable.burung3, R.string.video3)
        )
    }

    fun setData(data: VideoData, context: Context){
        _image.value = data.imageResourceId
        _link.value = context.getString(data.descResourceId)
    }

}