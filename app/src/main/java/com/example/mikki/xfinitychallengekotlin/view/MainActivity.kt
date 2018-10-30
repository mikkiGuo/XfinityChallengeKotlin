package com.example.mikki.xfinitychallengekotlin.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.Toolbar
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.mikki.xfinitychallengekotlin.BuildConfig
import com.example.mikki.xfinitychallengekotlin.R
import com.example.mikki.xfinitychallengekotlin.adapter.ItemListAdapter
import com.example.mikki.xfinitychallengekotlin.data.model.RelatedTopicsItem
import com.example.mikki.xfinitychallengekotlin.presenter.IMainPresenter
import com.example.mikki.xfinitychallengekotlin.presenter.MainPresenter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.frag_item_list.*

class MainActivity : AppCompatActivity() {

    companion object {
        val iMainPresent:IMainPresenter = MainPresenter()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (BuildConfig.FLAVOR.equals("simpsons")) {
            iMainPresent.getSimpsonCharacter()
        } else{
            iMainPresent.getWireCharacter()
        }

        val toolbar:Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        if(savedInstanceState == null){
            val fragment = ItemListFragment()
            supportFragmentManager.beginTransaction()
                    .add(R.id.mainActivity, fragment)
                    .addToBackStack(null)
                    .commit()

            val tabletSize = resources.getBoolean(R.bool.isTablet)

            if(tabletSize){
                val fragment2 = ItemDetailFragment()
                val bundle = Bundle()
                bundle.putString("body", "default")
                bundle.putString("icon", "https://duckduckgo.com/i/8690ca01.jpg")
                fragment2.arguments = bundle
                supportFragmentManager.beginTransaction()
                        .add(R.id.mainActivity2, fragment2)
                        .addToBackStack(null)
                        .commit()
            }
        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu to use in the action bar
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_toolbar, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle presses on the action bar menu items
        when (item.itemId) {
            R.id.phone -> {
                Toast.makeText(this, "phone", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.tablet -> {
                Toast.makeText(this, "tablet", Toast.LENGTH_LONG).show()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }


}
