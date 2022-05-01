package com.example.birds.ui.home

import android.provider.Settings.Global.getString
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.birds.R
import org.w3c.dom.Text

class HomeViewModel : ViewModel() {
    private val _image = MutableLiveData<Int>().apply {
        value = R.drawable.welcome
    }
    val image: LiveData<Int> = _image

//    private val _text = MutableLiveData<String>().apply {
//        value = getString(R.string.welcome)
//    }
//
//    val text: LiveData<String> = _text
}