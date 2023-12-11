package com.example.starbucks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.starbucks.databinding.ActivityMainBinding;
import com.example.starbucks.databinding.ActivityMenuBinding;
import com.example.starbucks.main.MainFragment;
import com.example.starbucks.menu.MenuFragment;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.bottomNav.setOnItemSelectedListener(item -> {
            if(item.getItemId() == R.id.tab1){
                changeFragment(new MainFragment());
            }else if(item.getItemId() == R.id.tab1){
                changeFragment(new MenuFragment());
            }
            return true;
        });
    }
        public void changeFragment(Fragment fragment){
            getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
        }

}