package com.example.starbucks.order;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.starbucks.databinding.ItemRecvBeverageBinding;

import java.util.List;

public class AllMenuAdapter extends RecyclerView.Adapter<AllMenuAdapter.ViewHolder> {
    LayoutInflater inflater;
    List<BeverageCategoryDTO> list;
    Context context;
    public AllMenuAdapter(LayoutInflater inflater, List<BeverageCategoryDTO> list, Context context) {
        this.inflater = inflater;
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRecvBeverageBinding binding;
        binding = ItemRecvBeverageBinding.inflate(inflater,parent,false);
        return new ViewHolder(binding);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {

        h.binding.tvCategory.setText(list.get(i).getName());
        h.binding.tvSubtitle.setText(list.get(i).getSubtitle());
        h.binding.imgvBeverage.setImageResource(list.get(i).getImg_menu());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
    ItemRecvBeverageBinding binding;
        public ViewHolder(@NonNull ItemRecvBeverageBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
