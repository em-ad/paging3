package com.emad.paging3

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.emad.paging3.data.ApiService

class MainViewModelFactory(private val apiService: ApiService) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(apiService) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}