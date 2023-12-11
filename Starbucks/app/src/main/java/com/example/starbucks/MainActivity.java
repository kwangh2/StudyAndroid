package com.example.starbucks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.starbucks.databinding.ActivityMainBinding;
import com.example.starbucks.main.MainFragment;
import com.example.starbucks.menu.MenuFragment;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new MainFragment()).commit();
        setContentView(binding.getRoot());
    }
}