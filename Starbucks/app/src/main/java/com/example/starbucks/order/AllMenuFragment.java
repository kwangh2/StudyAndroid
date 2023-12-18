package com.example.starbucks.order;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.starbucks.R;
import com.example.starbucks.databinding.FragmentAllMenuBinding;
import com.google.android.material.tabs.TabLayout;


public class AllMenuFragment extends Fragment {
    FragmentAllMenuBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAllMenuBinding.inflate(inflater,container,false);


        return binding.getRoot();
    }
}