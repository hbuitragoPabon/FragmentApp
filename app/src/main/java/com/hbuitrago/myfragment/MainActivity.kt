package com.hbuitrago.myfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tabAdapter: TabsAdapter
        tabAdapter = TabsAdapter(supportFragmentManager)
        tabAdapter.addFragments(Fragment1(),"Photos")
        tabAdapter.addFragments(Fragment2(),"Folowers")
        tabAdapter.addFragments(Fragment3(),"Follows")

        viewPager.adapter = tabAdapter
        tabLayout.setupWithViewPager(viewPager)


    }
}
