package com.example.starbucks.pay;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.starbucks.R;
import com.example.starbucks.databinding.FragmentPayBinding;


public class PayFragment extends Fragment {
    FragmentPayBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPayBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }
}