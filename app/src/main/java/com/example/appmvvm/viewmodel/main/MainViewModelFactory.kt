package com.example.appmvvm.viewmodel.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.appmvvm.repositories.MainRepository
import java.lang.IllegalArgumentException

class MainViewModelFactory constructor(private val repository : MainRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass : Class<T>): T {
        return if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            MainViewModel(this.repository) as T
        } else {
            throw IllegalArgumentException("ViewModel Not Found")
        }
    }
}