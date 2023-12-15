package com.example.starbucks.main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.starbucks.R;
import com.example.starbucks.databinding.FragmentPayBinding;
import com.example.starbucks.databinding.FragmentQuickOrderBinding;

import java.util.ArrayList;


public class QuickOrderFragment extends Fragment {
    FragmentQuickOrderBinding binding;
    QuickOrderDTO dto;

    public QuickOrderFragment(QuickOrderDTO dto) {
        this.dto = dto;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentQuickOrderBinding.inflate(inflater, container,false);
        QuickOrderAdapter adapter = new QuickOrderAdapter();
        binding.tvQuickorderMenu.setText(dto.getMenu());
        binding.tvQuickorderOption.setText(dto.getOption());
        binding.tvVpQoLocation.setText(dto.getShop());
        binding.imgvMenuimg.setImageResource(dto.getMenuimg());
        return binding.getRoot();
    }
}