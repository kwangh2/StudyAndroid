package com.example.starbucks.main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.starbucks.R;
import com.example.starbucks.databinding.FragmentQuickOrderBinding;

import java.util.ArrayList;


public class QuickOrderFragment extends Fragment {
    FragmentQuickOrderBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentQuickOrderBinding.inflate(inflater, container,false);

        return binding.getRoot();
    }
}