package com.example.mikki.xfinitychallengekotlin.presenter

import android.util.Log
import com.example.mikki.xfinitychallengekotlin.data.DataManager
import com.example.mikki.xfinitychallengekotlin.data.IDataManager
import com.example.mikki.xfinitychallengekotlin.data.model.RelatedTopicsItem
import com.example.mikki.xfinitychallengekotlin.data.model.SimpsonsCharacter
import com.example.mikki.xfinitychallengekotlin.data.model.WireCharacter
import com.example.mikki.xfinitychallengekotlin.view.IMainView
import com.example.mikki.xfinitychallengekotlin.view.ItemListFragment
import com.example.mikki.xfinitychallengekotlin.view.MainActivity

class MainPresenter:IMainPresenter, IDataManager.MainActivityListener {
    override fun passSimpsonToUI(data: List<RelatedTopicsItem?>?) {
        Log.d("MyTag", "MainPresenter.." + data.toString())
        iItemListFragView.passToRv(data)
    }

    override fun passWireToUI(data: List<RelatedTopicsItem?>?) {
        iItemListFragView.passToRv(data)
    }

    override fun getSimpsonCharacter() {
        iDataManager.getSimpsonCharacter(this)
    }

    override fun getWireCharacter() {
        iDataManager.getWireCharacter(this)
    }

    companion object {
        val iDataManager:IDataManager = DataManager()
        val iItemListFragView:IMainView = ItemListFragment()
    }
}