package com.example.starbucks.order;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.starbucks.R;
import com.example.starbucks.databinding.FragmentOrderBinding;
import com.google.android.material.bottomsheet.BottomSheetDialog;


public class OrderFragment extends Fragment {
    FragmentOrderBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentOrderBinding.inflate(inflater,container,false);
        getChildFragmentManager().beginTransaction().replace(R.id.menu_container,new AllMenuFragment()).commit();
        return binding.getRoot();

    }
}