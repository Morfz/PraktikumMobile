package com.example.doa.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

const val BASE_URL = "https://doa-doa-api-ahmadramadhan.fly.dev/"

val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface DoaApiService{
    @GET(value = "api")
    suspend fun getDoa() : List<Doa>
}

object DoaApi{
    val retrofitService : DoaApiService by lazy {
        retrofit.create(DoaApiService::class.java)
    }
}