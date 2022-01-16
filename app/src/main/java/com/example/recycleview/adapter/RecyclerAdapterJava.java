package com.example.recycleview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.recycleview.R;
import com.example.recycleview.model.MemberJava;
import java.util.ArrayList;

public class RecyclerAdapterJava extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<MemberJava> members;

    public RecyclerAdapterJava(ArrayList<MemberJava> members) {
        this.members = members;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_member_list, parent, false);
        return new MemberViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MemberJava memberJava = members.get(position);

        ((MemberViewHolder) holder).iv_profile.setImageResource(memberJava.profile);
        ((MemberViewHolder) holder).tv_fullname.setText(memberJava.fullname);
    }

    @Override
    public int getItemCount() {
        return members.size();
    }

    class MemberViewHolder extends RecyclerView.ViewHolder {
        View view;
        ImageView iv_profile;
        TextView tv_fullname;

        public MemberViewHolder(View itemView) {
            super(itemView);
            this.view = itemView;
            this.iv_profile = view.findViewById(R.id.iv_profile);
            this.tv_fullname = view.findViewById(R.id.tv_fullname);
        }
    }
}
