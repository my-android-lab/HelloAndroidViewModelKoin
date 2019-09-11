package com.example.helloandroidviewmodelkoin.module

import com.example.helloandroidviewmodelkoin.MainViewModel
import com.example.helloandroidviewmodelkoin.model.HelloRepository
import com.example.helloandroidviewmodelkoin.model.HelloRepositoryImpl
import org.koin.core.context.GlobalContext.get
import org.koin.dsl.module

val appModule = module {
    //single instance of HelloRepository
    single<HelloRepository> { HelloRepositoryImpl() }

    // MainViewModel ViewModel
    viewModel { MainViewModel(get()) }
}