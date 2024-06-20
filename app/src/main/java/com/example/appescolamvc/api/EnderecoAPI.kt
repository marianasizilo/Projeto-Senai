package com.example.appescolamvc.api

import retrofit2.Call
import retrofit2.http.GET

interface EnderecoAPI {

    @GET("aluno/listar")
    fun getAlunos(): Call<List<Aluno>>
}