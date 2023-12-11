package com.example.starbucks.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.starbucks.databinding.ItemRecvIndividualBinding;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewholder> {
    LayoutInflater inflater;
    ArrayList<MainDTO> list = new ArrayList<>();

    public MainAdapter(LayoutInflater inflater, ArrayList<MainDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @NonNull
    @Override
    public MainViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRecvIndividualBinding binding = ItemRecvIndividualBinding.inflate(inflater, parent,false);
        return new MainViewholder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewholder h, int i) {
        h.binding.imgvIndividual.setImageResource(list.get(i).getIndividual());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MainViewholder extends RecyclerView.ViewHolder {
        ItemRecvIndividualBinding binding;
        public MainViewholder(@NonNull ItemRecvIndividualBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
