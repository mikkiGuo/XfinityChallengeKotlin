package com.example.mikki.xfinitychallengekotlin.data

import com.example.mikki.xfinitychallengekotlin.data.model.RelatedTopicsItem
import com.example.mikki.xfinitychallengekotlin.data.model.SimpsonsCharacter
import com.example.mikki.xfinitychallengekotlin.data.model.WireCharacter
import com.example.mikki.xfinitychallengekotlin.data.network.INetworkHelper

interface IDataManager:INetworkHelper {

    interface MainActivityListener{
        fun passSimpsonToUI(data:List<RelatedTopicsItem?>?)
        fun passWireToUI(data:List<RelatedTopicsItem?>?)
    }
}