package com.example.project01_jkhtalk.opentalk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_jkhtalk.databinding.ItemOpentalkChatBinding;

import java.util.ArrayList;

public class OpenSubAdapter1 extends RecyclerView.Adapter<OpenSubAdapter1.ViewHolder> {
    ArrayList<OpenSubDTOs.OpenSub1DTO> list;

    public OpenSubAdapter1(ArrayList<OpenSubDTOs.OpenSub1DTO> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        /* LayoutInflater.from(parent.getContext()); 레이아웃 인플레이터 자동 생성 리사이클러뷰 어댑터에서만 가능*/
        ItemOpentalkChatBinding binding = ItemOpentalkChatBinding.inflate(LayoutInflater.from(parent.getContext()), parent , false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemOpentalkChatBinding binding;
        public ViewHolder(@NonNull ItemOpentalkChatBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
