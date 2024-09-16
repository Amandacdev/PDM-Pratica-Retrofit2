package com.example.praticaretrofit_cep.model.dados

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "http://viacep.com.br/ws/"

    val enderecoServiceIF: EnderecoServiceIF by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(EnderecoServiceIF::class.java)
    }
}