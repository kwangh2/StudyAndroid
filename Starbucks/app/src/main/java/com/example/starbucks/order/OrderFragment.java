package com.example.starbucks.order;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.starbucks.R;
import com.example.starbucks.databinding.FragmentOrderBinding;
import com.google.android.material.tabs.TabLayout;


public class OrderFragment extends Fragment {
    FragmentOrderBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentOrderBinding.inflate(inflater,container,false);
        getChildFragmentManager().beginTransaction().replace(R.id.menu_container,new AllMenuFragment()).commit();

        TabLayout tabLayout = (TabLayout)binding.tl;

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                if(position ==0){
                    getChildFragmentManager().beginTransaction().replace(R.id.menu_container,new AllMenuFragment()).commit();
                }else if (position==1){
                    getChildFragmentManager().beginTransaction().replace(R.id.menu_container,new MyMenuFragment()).commit();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        return binding.getRoot();
            }
    }
