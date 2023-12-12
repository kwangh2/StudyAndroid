package com.example.starbucks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.starbucks.databinding.ActivityMainBinding;
import com.example.starbucks.main.MainFragment;
import com.example.starbucks.menu.MenuFragment;
import com.example.starbucks.pay.PayFragment;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new MainFragment()).commit();

        binding.bottomNav.setOnItemSelectedListener(item -> {
            if(item.getItemId() ==R.id.tab1) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, new MainFragment()).commit();
            }else if(item.getItemId() == R.id.tab2){
                getSupportFragmentManager().beginTransaction().replace(R.id.container, new PayFragment()).commit();
            }else if(item.getItemId() == R.id.tab3){
                getSupportFragmentManager().beginTransaction().replace(R.id.container, new MenuFragment()).commit();
            }
            return true;
        });
        setContentView(binding.getRoot());
    }
}