package com.example.recycleview.activity

import android.content.Context
import android.os.Bundle
import android.widget.GridLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.R
import com.example.recycleview.adapter.RecyclerAdapter
import com.example.recycleview.model.Member

class RecyclerViewActivity : AppCompatActivity() {

    private var context: Context? = null
    private var recyclerView: RecyclerView? = null
    private val members: ArrayList<Member> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        initViews()
    }

    private fun initViews() {
        context = this
        recyclerView = findViewById(R.id.recycler_view)
        recyclerView!!.layoutManager = GridLayoutManager(context, 1)

        feedMembers()

        refreshAdapter(members)
    }

    private fun refreshAdapter(members: ArrayList<Member>) {
        val adapter = RecyclerAdapter(context!!, members)
        recyclerView!!.adapter = adapter
    }

    private fun feedMembers() {
        for (i in 0 until 100) {
            members.add(Member(R.drawable.ic_launcher_background, "Member ${i + 1}"))
        }
    }
}