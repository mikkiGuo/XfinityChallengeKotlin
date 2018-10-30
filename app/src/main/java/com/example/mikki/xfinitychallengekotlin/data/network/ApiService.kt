package com.example.mikki.xfinitychallengekotlin.data.network

import com.example.mikki.xfinitychallengekotlin.data.model.SimpsonsCharacter
import com.example.mikki.xfinitychallengekotlin.data.model.WireCharacter
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import io.reactivex.Observable
import retrofit2.http.Path

interface ApiService {
    /**
     *  Simpson Character:
     *  http://api.duckduckgo.com/?q=simpsons+characters&format=json
     *  Wire Character:
     *  http://api.duckduckgo.com/?q=the+wire+characters&format=json
     */
    companion object {
        val BASE_URL:String = "http://api.duckduckgo.com/"

        fun create():ApiService{
            val retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
            return retrofit.create(ApiService::class.java);
        }
    }

    /**
     * http://api.duckduckgo.com/?
     * q=simpsons+characters
     * &format=json
     */
    @GET("?q=simpsons+characters&format=json")
    fun getSimpsonCharacters()
            :Observable<SimpsonsCharacter>

    /**
     * Wire Character:
     * http://api.duckduckgo.com/?
     * q=the+wire+characters&format=json
     */
    @GET("?q=the+wire+characters&format=json")
    fun getWireCharacters():Observable<WireCharacter>

}