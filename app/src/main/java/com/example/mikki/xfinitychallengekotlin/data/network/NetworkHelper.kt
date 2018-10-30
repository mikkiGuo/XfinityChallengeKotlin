package com.example.mikki.xfinitychallengekotlin.data.network

import android.util.Log
import com.example.mikki.xfinitychallengekotlin.data.IDataManager
import com.example.mikki.xfinitychallengekotlin.data.model.RelatedTopicsItem
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class NetworkHelper:INetworkHelper {

    var disposable:Disposable? = null
    val apiService by lazy {
        ApiService.create()
    }

    override fun getSimpsonCharacter(listener:IDataManager.MainActivityListener) {
        disposable = apiService.getSimpsonCharacters()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    result -> Log.d("MyTag", result.toString())
                    listener.passSimpsonToUI(result.relatedTopics)
                }, {
                    error -> Log.d("MyTag", error.message)
                })
    }

    override fun getWireCharacter(listener: IDataManager.MainActivityListener) {
        disposable = apiService.getWireCharacters()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    result ->
                    Log.d("MyTag", result.toString())
                    listener.passWireToUI(result.relatedTopics)
                },{
                    result -> Log.d("MyTag", result.toString())
                })
    }
}