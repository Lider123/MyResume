package com.babaetskv.myresume.data

import com.babaetskv.myresume.data.models.Employee
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

/**
 * @author babaetskv on 11.12.19
 */
interface IApi {
    @GET("employee")
    fun getEmployee(): Call<Employee>

    companion object {
        private const val BASE_URL = "https://lider123.pythonanywhere.com/"

        fun createService(): IApi {
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(Gson()))
                .build()
            return retrofit.create(IApi::class.java)
        }
    }
}