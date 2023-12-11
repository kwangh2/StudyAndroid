package com.example.project01_jkhtalk.opentalk;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_jkhtalk.databinding.ItemOpentalkChat2Binding;
import com.example.project01_jkhtalk.databinding.ItemOpentalkChat3Binding;

import java.util.ArrayList;

public class OpenSubAdapter3 extends RecyclerView.Adapter<OpenSubAdapter3.ViewHolder> {
    ArrayList<OpenSubDTOs.OpenSub3DTO> list;

    public OpenSubAdapter3(ArrayList<OpenSubDTOs.OpenSub3DTO> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        /* LayoutInflater.from(parent.getContext()); 레이아웃 인플레이터 자동 생성 리사이클러뷰 어댑터에서만 가능*/
        ItemOpentalkChat3Binding binding = ItemOpentalkChat3Binding.inflate(LayoutInflater.from(parent.getContext()), parent , false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemOpentalkChat3Binding binding;
        public ViewHolder(@NonNull ItemOpentalkChat3Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
