package com.example.starbucks.main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.starbucks.R;
import com.example.starbucks.databinding.ActivityMainBinding;
import com.example.starbucks.databinding.FragmentMainBinding;
import com.example.starbucks.databinding.ItemRecvBeverageBinding;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    FragmentMainBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(inflater, container, false);
        //MainAdapter adapter = new MainAdapter(inflater);
        binding.rcyvMain.setAdapter(new MainAdapter(inflater));
        binding.rcyvMain.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();
    }
}