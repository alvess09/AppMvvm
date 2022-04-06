package com.example.appmvvm.repositories

import com.example.appmvvm.rest.RetrofitService

// esse é o repository da classe Main
class MainRepository constructor(private val retrofitService: RetrofitService){
    fun getAllLives() = retrofitService.getAllLives()
}