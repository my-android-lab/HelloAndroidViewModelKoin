package com.example.helloandroidviewmodelkoin

import com.example.helloandroidviewmodelkoin.module.appModule
import org.junit.Before
import org.junit.Test
import org.koin.core.context.startKoin
import org.koin.test.KoinTest
import org.koin.test.inject

class MainViewModelTest: KoinTest {

    private val viewModel: MainViewModel by inject()

    @Before
    fun before() {
        startKoin {
            modules(appModule)
        }
    }

    @Test
    fun testSayHello() {
        assert(viewModel.sayHello() == "Hello Koin")
    }
}