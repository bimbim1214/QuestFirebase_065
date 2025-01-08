package com.example.myapplication.di

import com.example.myapplication.repository.MahasiswaRepository
import com.example.myapplication.repository.NetworkMahasiswaRepository
import com.google.firebase.firestore.FirebaseFirestore


interface AppContainer{
    val mahasiswaRepository: MahasiswaRepository
}
class MahasiswaContainer : AppContainer {
   private val firestore : FirebaseFirestore = FirebaseFirestore.getInstance()
    override val mahasiswaRepository: MahasiswaRepository by lazy {
        NetworkMahasiswaRepository(firestore)
    }
}