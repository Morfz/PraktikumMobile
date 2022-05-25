package com.example.doa.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.doa.network.Doa
import com.example.doa.network.DoaApi
import kotlinx.coroutines.launch
import java.lang.Exception

enum class DoaApiStatus { LOADING, ERROR, DONE }

class DoaViewModel : ViewModel() {

    private var _status = MutableLiveData<DoaApiStatus> ()
    val status = _status
    private var _doaList = MutableLiveData<List<Doa>> ()
    val doaList = _doaList
    private var _selectedDoa = MutableLiveData<Doa> ()
    val selectedDoa = _selectedDoa

    init {
        getDoaList()
    }
    private fun getDoaList() {
        viewModelScope.launch {
            _status.value = DoaApiStatus.LOADING
            try {
                _doaList.value = DoaApi.retrofitService.getDoa()
                _status.value = DoaApiStatus.DONE
            }
            catch (e :Exception) {
                _status.value = DoaApiStatus.ERROR
                _doaList.value = listOf()
            }
        }
    }

    fun onDoaClicked(doa: Doa) {
        _selectedDoa.value = doa
    }
}