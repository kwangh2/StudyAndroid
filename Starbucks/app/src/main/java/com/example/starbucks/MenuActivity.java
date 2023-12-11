package com.example.starbucks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;

import com.example.starbucks.databinding.ActivityMenuBinding;

public class MenuActivity extends AppCompatActivity {
    ActivityMenuBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate(getLayoutInflater());


        setContentView(binding.getRoot());
    }
}