package com.example.myapplication.repository

import com.example.myapplication.model.Mahasiswa
//import com.example.remotedatabase.model.Mahasiswa
//import com.example.remotedatabase.model.MahasiwaResponse
//import com.example.remotedatabase.model.MahasiwaResponseDetail
//import com.example.remotedatabase.service_api.MahasiswaService
import kotlinx.coroutines.flow.Flow
import java.io.IOException

interface MahasiswaRepository{
    suspend fun getMahasiswa(): Flow<List<Mahasiswa>>
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)
    suspend fun updateMahasiswa(nim: String, mahasiswa: Mahasiswa)
    suspend fun deleteMahasiswa(nim: String)
    suspend fun getMahasiswaByNim(nim: String): Flow<List<Mahasiswa>>
}

