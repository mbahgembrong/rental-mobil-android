package com.salsabilla.rental_mobil.data.network

import com.google.gson.GsonBuilder
import com.salsabilla.rental_mobil.utils.AppConstant.URL
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiConfig {
    companion object {
        fun getRetroInstance(): Retrofit {
            val logging = HttpLoggingInterceptor()
            logging.level = (HttpLoggingInterceptor.Level.BODY)
            val client = OkHttpClient.Builder()
            client.addInterceptor(logging)

            var gson = GsonBuilder()
                .setLenient()
                .serializeNulls()
                .create()

            return Retrofit.Builder()
                .baseUrl("${URL}api/")
                .client(client.build())
//                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
        }
    }
}