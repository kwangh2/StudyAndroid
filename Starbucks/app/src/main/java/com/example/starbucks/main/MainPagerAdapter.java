package com.example.starbucks.main;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.starbucks.R;
import com.example.starbucks.databinding.FragmentQuickOrderBinding;

import java.util.ArrayList;

public class MainPagerAdapter extends FragmentStateAdapter {
    ArrayList<Fragment> list;
    public MainPagerAdapter(@NonNull Fragment fragment, ArrayList<Fragment> list) {
        super(fragment);
        this.list = list;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return list.get(position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
