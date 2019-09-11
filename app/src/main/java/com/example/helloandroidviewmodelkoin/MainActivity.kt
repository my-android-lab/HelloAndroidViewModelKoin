package com.example.helloandroidviewmodelkoin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    //WOW! Lazy inject view model!
    val mainViewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
