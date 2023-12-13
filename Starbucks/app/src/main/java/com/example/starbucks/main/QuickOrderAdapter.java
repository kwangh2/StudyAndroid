package com.example.starbucks.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.starbucks.databinding.ItemVpQuickorderBinding;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class QuickOrderAdapter extends RecyclerView.Adapter<QuickOrderAdapter.ViewHolder> {
    LayoutInflater inflater;
    ArrayList<QuickOrderDTO> list;
    Context context;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemVpQuickorderBinding binding = ItemVpQuickorderBinding.inflate(inflater,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.tvQuickorderMenu.setText(list.get(i).getMenu());
        h.binding.tvQuickorderOption.setText(list.get(i).getOption());
        h.binding.tvVpQoLocation.setText(list.get(i).getShop());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemVpQuickorderBinding binding;
        public ViewHolder(@NonNull ItemVpQuickorderBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
