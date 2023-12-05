package com.example.and10_fragmentadapter2.exam;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.and10_fragmentadapter2.R;

public class ExamAdapter extends RecyclerView.Adapter<ExamAdapter.ViewHolder> {
    LayoutInflater inflater;

    public ExamAdapter(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.fragment_melon,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    //1. ViewHolder클래스를 상속받아 구현된 CustomerViewHolder를 만듬
    public  class ViewHolder extends RecyclerView.ViewHolder{
        ImageView jkh;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
