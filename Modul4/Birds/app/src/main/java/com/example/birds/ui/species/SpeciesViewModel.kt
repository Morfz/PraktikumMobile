package com.example.birds.ui.species

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.birds.R
import com.example.birds.model.SpeciesData

class SpeciesViewModel : ViewModel() {
    private val _name = MutableLiveData<String>()
    val name: LiveData<String> = _name

    private val _image = MutableLiveData<Int>()
    val image: LiveData<Int> = _image

    private val _desc = MutableLiveData<String>()
    val description: LiveData<String> = _desc


    fun loadData(): List<SpeciesData>{
        return listOf(
            SpeciesData(R.string.name_burung1, R.drawable.burung1, R.string.desc_burung1),
            SpeciesData(R.string.name_burung2, R.drawable.burung2, R.string.desc_burung2),
            SpeciesData(R.string.name_burung3, R.drawable.burung3, R.string.desc_burung3),
            SpeciesData(R.string.name_burung4, R.drawable.burung4, R.string.desc_burung4),
            SpeciesData(R.string.name_burung5, R.drawable.burung5, R.string.desc_burung5),
            SpeciesData(R.string.name_burung6, R.drawable.burung6, R.string.desc_burung6),
            SpeciesData(R.string.name_burung7, R.drawable.burung7, R.string.desc_burung7),
            SpeciesData(R.string.name_burung8, R.drawable.burung8, R.string.desc_burung8),
            SpeciesData(R.string.name_burung9, R.drawable.burung9, R.string.desc_burung9),
            SpeciesData(R.string.name_burung10, R.drawable.burung10, R.string.desc_burung10)
        )
    }

    fun setData(data: SpeciesData, context: Context) {
        _name.value = context.getString(data.nameResourceId)
        _image.value = data.imageResourceId
        _desc.value = context.getString(data.descResourceId)
    }
}