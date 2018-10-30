package com.example.mikki.xfinitychallengekotlin.adapter

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.mikki.xfinitychallengekotlin.R
import com.example.mikki.xfinitychallengekotlin.data.model.RelatedTopicsItem
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_layout.view.*

class ItemListAdapter(
        var mylist:MutableList<RelatedTopicsItem>,
        var listener: ItemListListener
): RecyclerView.Adapter<ItemListAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ItemListAdapter.ViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater.inflate(R.layout.item_layout, parent, false))
    }

    override fun getItemCount(): Int {
       return mylist.size
    }

    override fun onBindViewHolder(holder: ItemListAdapter.ViewHolder, position: Int) {
        var item = mylist[position]
        holder.bind(item, listener)
    }


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bind(item:RelatedTopicsItem, listener:ItemListAdapter.ItemListListener){
            var name = item.text?.split("-")?.get(0)
            Log.d("MyTag", "Adapter: " + name)
            itemView.tv_textfield.text = name

            var icon_url = item.icon?.uRL
            if(!icon_url!!.isEmpty()){
                //Glide.with(itemView.context).load(item.icon).into(itemView.img_placeholder)
                Picasso.get().load(icon_url).into(itemView.img_placeholder)
            }

            itemView.setOnClickListener{
                listener.onItemClickedHandler(item)
            }
        }

    }

    interface ItemListListener{
        fun onItemClickedHandler(item:RelatedTopicsItem)
    }

}