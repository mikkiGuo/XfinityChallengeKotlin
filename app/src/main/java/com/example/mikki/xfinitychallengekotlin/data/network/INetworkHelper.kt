package com.example.mikki.xfinitychallengekotlin.data.network

import com.example.mikki.xfinitychallengekotlin.data.IDataManager

interface INetworkHelper {

    fun getSimpsonCharacter(listener:IDataManager.MainActivityListener)
    fun getWireCharacter(listener:IDataManager.MainActivityListener)
}