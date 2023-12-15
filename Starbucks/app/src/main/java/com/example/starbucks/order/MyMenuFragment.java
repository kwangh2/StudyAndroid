package com.example.starbucks.order;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.starbucks.R;
import com.example.starbucks.databinding.FragmentMyMenuBinding;

public class MyMenuFragment extends Fragment {
FragmentMyMenuBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMyMenuBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}