package com.example.myapplication

import android.app.Application
import com.example.myapplication.di.AppContainer
import com.example.myapplication.di.MahasiswaContainer

class MahasiswaAplications : Application(){
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}