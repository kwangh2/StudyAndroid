package com.example.starbucks.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.starbucks.R;
import com.example.starbucks.databinding.ItemRcyvWhatsnewBinding;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class WhatsnewAdapter extends RecyclerView.Adapter<WhatsnewAdapter.Viewholder> {
    LayoutInflater inflater;
    ArrayList<WhatsnewDTO> list;
    Context context;

    public WhatsnewAdapter(LayoutInflater inflater, ArrayList<WhatsnewDTO> list, Context context) {
        this.inflater = inflater;
        this.list = list;
        this.context = context;
    }

    public WhatsnewAdapter(LayoutInflater inflater, ArrayList<WhatsnewDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRcyvWhatsnewBinding binding = ItemRcyvWhatsnewBinding.inflate(inflater,parent,false);
        return new Viewholder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder h, int i) {
        h.binding.imgvWhatsnew.setImageResource(list.get(i).getImg_new());
        h.binding.tvWhatsnewTitle.setText(list.get(i).getTitle());
        h.binding.tvWhatsnewSub.setText(list.get(i).getSubtitle());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{
        ItemRcyvWhatsnewBinding binding;
        public Viewholder(@NonNull ItemRcyvWhatsnewBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
