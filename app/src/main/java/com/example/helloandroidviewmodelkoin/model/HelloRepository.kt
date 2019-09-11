package com.example.helloandroidviewmodelkoin.model

interface HelloRepository {
    fun giveHello(): String
}

class HelloRepositoryImpl(): HelloRepository {
    override fun giveHello(): String = "Hello Koin"
}