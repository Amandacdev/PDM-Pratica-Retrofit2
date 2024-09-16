package com.example.praticaretrofit_cep.model.dados

import retrofit2.http.GET
import retrofit2.http.Path

interface EnderecoServiceIF {

    @GET("{cep}/json/")
    suspend fun getDetailsByCep(
        @Path("cep") cep: String,
    ): Endereco

}