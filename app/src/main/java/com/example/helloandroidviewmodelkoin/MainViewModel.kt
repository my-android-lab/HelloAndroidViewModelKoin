package com.example.helloandroidviewmodelkoin

import androidx.lifecycle.ViewModel
import com.example.helloandroidviewmodelkoin.model.HelloRepository

class MainViewModel(val repo: HelloRepository): ViewModel() {
    fun sayHello() = repo.giveHello()
}