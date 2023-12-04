package com.example.and10_fragmentadapter2.melon;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.and10_fragmentadapter2.R;

import java.util.ArrayList;

public class MelonAdapter extends RecyclerView.Adapter {

    LayoutInflater inflater;
    ArrayList<MelonDTO> list;

    public MelonAdapter(LayoutInflater inflater, ArrayList<MelonDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v = inflater.inflate(R.layout.fragment_melon , parent, false);
        MelonViewHolder holder = new MelonViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MelonViewHolder h, int i) {
        h.
    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public class MelonViewHolder extends RecyclerView.ViewHolder{

        public MelonViewHolder(@NonNull View v) {
            super(v);
        }
    }
}
