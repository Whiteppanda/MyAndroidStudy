package com.example.thirdstudyassignment

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.pro_list.*

class MainActivity : AppCompatActivity() {

    var proList : ArrayList<pro> = arrayListOf(pro("1000","A+B"),pro("1001","A-B"),pro("1002","터렛"),pro("1003","피보나치 함수"),pro("1004","어린 왕자"),pro("1005","ACM Craft"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mAdapter = proAdapter(this,proList)
        my_recycler.adapter = mAdapter

        val lm = LinearLayoutManager(this)
        my_recycler.layoutManager = lm
        my_recycler.setHasFixedSize(true)
    }
}