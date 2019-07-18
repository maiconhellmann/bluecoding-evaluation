package com.maiconhellmann.bluecodingevaluation.di

import com.maiconhellmann.bluecodingevaluation.BuildConfig
import com.maiconhellmann.bluecodingevaluation.data.api.EmployeeApi
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/*
 * This file is part of BlueCodingEvaluation.
 * 
 * Created by maiconhellmann on 17/07/2019
 * 
 * (c) 2019 
 */

val remoteDataSourceModule = module {
    factory { providesOkHttpClient() }

    single { createWebService<EmployeeApi>(
        okHttpClient = get(),
        url =  BuildConfig.BASE_URL
    ) }
}

fun providesOkHttpClient(): OkHttpClient {
    return OkHttpClient.Builder()
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .build()
}

inline fun <reified T> createWebService(
    okHttpClient: OkHttpClient,
    url: String
): T {
    return Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .baseUrl(url)
        .client(okHttpClient)
        .build()
        .create(T::class.java)
}