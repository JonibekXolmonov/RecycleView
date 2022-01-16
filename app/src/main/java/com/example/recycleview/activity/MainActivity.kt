package com.example.recycleview.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.recycleview.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        findViewById<Button>(R.id.btn_open_recycler_view_kotlin).setOnClickListener {
            openRecyclerViewActivityKotlin()
        }

        findViewById<Button>(R.id.btn_open_recycler_view_java).setOnClickListener {
            openRecyclerViewActivityJava()
        }
    }

    private fun openRecyclerViewActivityKotlin() {
        val intent = Intent(this, RecyclerViewActivity::class.java)
        startActivity(intent)
    }

    private fun openRecyclerViewActivityJava() {
        val intent = Intent(this, RecyclerViewActivityJava::class.java)
        startActivity(intent)
    }

}