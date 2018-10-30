package com.example.mikki.xfinitychallengekotlin.view

import com.example.mikki.xfinitychallengekotlin.data.model.RelatedTopicsItem
import com.example.mikki.xfinitychallengekotlin.data.model.SimpsonsCharacter

interface IMainView {

    fun passToRv(data:List<RelatedTopicsItem?>?)
}