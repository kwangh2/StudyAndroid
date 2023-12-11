package com.example.starbucks.main;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.starbucks.databinding.ItemRecvBeverageBinding;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.Viewholder> {
    LayoutInflater inflater;

    public MainAdapter(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRecvBeverageBinding binding = ItemRecvBeverageBinding.inflate(inflater , parent , false);
        Log.d("어댑터", "onCreateViewHolder: asd");
        return new Viewholder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder h, int i) {
    }

    @Override
    public int getItemCount() {
        return 10;
    }


    public class Viewholder extends RecyclerView.ViewHolder{
        ItemRecvBeverageBinding binding;
        public Viewholder(@NonNull ItemRecvBeverageBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
