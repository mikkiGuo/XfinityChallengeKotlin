package com.example.mikki.xfinitychallengekotlin.data

import com.example.mikki.xfinitychallengekotlin.data.network.INetworkHelper
import com.example.mikki.xfinitychallengekotlin.data.network.NetworkHelper

class DataManager:IDataManager {
    override fun getSimpsonCharacter(listener: IDataManager.MainActivityListener) {
        iNetworkHelper.getSimpsonCharacter(listener)

    }

    override fun getWireCharacter(listener: IDataManager.MainActivityListener) {
        iNetworkHelper.getWireCharacter(listener)

    }

    companion object {
        val iNetworkHelper = NetworkHelper()
    }
}