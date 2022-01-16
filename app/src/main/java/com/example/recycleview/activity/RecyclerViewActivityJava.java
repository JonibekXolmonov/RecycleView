package com.example.recycleview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.recycleview.R;
import com.example.recycleview.adapter.RecyclerAdapter;
import com.example.recycleview.adapter.RecyclerAdapterJava;
import com.example.recycleview.model.MemberJava;

import java.util.ArrayList;

public class RecyclerViewActivityJava extends AppCompatActivity {

    Context context;
    RecyclerView recyclerView;
    ArrayList<MemberJava> members = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_java);

        initViews();
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recycler_view_java);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 1));
        feedMembers();

        refreshAdapter(members);
    }

    void feedMembers() {
        for (int i = 1; i < 40; i++) {
            members.add(new MemberJava("Member" + i, R.drawable.ic_launcher_background));
        }
    }

    private void refreshAdapter(ArrayList<MemberJava> members) {
        RecyclerAdapterJava adapter = new RecyclerAdapterJava(members);
        recyclerView.setAdapter(adapter);
    }

}