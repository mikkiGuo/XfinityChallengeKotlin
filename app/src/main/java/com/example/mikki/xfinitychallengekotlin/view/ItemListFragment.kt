package com.example.mikki.xfinitychallengekotlin.view


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mikki.xfinitychallengekotlin.BuildConfig
import com.example.mikki.xfinitychallengekotlin.R
import com.example.mikki.xfinitychallengekotlin.adapter.ItemListAdapter
import com.example.mikki.xfinitychallengekotlin.data.model.RelatedTopicsItem
import kotlinx.android.synthetic.main.frag_item_list.*
import kotlinx.android.synthetic.main.frag_item_list.view.*

class ItemListFragment: Fragment(), IMainView {

    companion object {
        var mylist:MutableList<RelatedTopicsItem> = mutableListOf()
        lateinit var adapter: ItemListAdapter
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.frag_item_list, container, false)
        if (BuildConfig.FLAVOR.equals("simpsons")) {
            view.tv_title.text = "Simpson Character List"
        }else{
            view.tv_title.text = "Wire Character List"
        }
        view.rv_item_list.layoutManager = LinearLayoutManager(context)
        adapter = ItemListAdapter(mylist, object : ItemListAdapter.ItemListListener{
            override fun onItemClickedHandler(item: RelatedTopicsItem) {
                val fragment = ItemDetailFragment()
                val bundle = Bundle()
                bundle.putString("body", item.text)
                bundle.putString("icon", item.icon?.uRL.toString())
                fragment.arguments = bundle
                val tabletSize = resources.getBoolean(R.bool.isTablet)
                if(tabletSize){
                    fragmentManager!!.beginTransaction()
                            .replace(R.id.mainActivity2, fragment).commit()
                    
                }else{
                    fragmentManager!!.beginTransaction()
                            .replace(R.id.mainActivity, fragment).commit()
                }

            }
        })
        view.rv_item_list.adapter = adapter
        return view
    }

    override fun passToRv(data: List<RelatedTopicsItem?>?) {
        Log.d("MyTag", "MainActivity \n" + data?.get(0))

        Log.d("MyTag", "\n\n+++++++++++++++++++++++++++++++++++++++++++++++\n\n")

        for(item in data!!){
            mylist.add(item!!)
        }
        Log.d("MyTag", "mylist == " + mylist[0].text)
        adapter.notifyDataSetChanged()

    }
}