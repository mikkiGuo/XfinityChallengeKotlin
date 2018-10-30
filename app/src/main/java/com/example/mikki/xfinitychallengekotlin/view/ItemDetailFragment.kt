package com.example.mikki.xfinitychallengekotlin.view

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mikki.xfinitychallengekotlin.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.frag_item_detail.view.*

class ItemDetailFragment:Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.frag_item_detail, container, false)


        val bundleFrom = arguments
        var icon = bundleFrom!!.getString("icon")
        var body = bundleFrom!!.getString("body")

        view.tv_body.text = body
        Picasso.get().load(icon).into(view.img_icon)

        return view
    }
}