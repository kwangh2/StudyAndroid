package com.example.starbucks.order;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.starbucks.databinding.FragmentMyMenuBinding;
import com.suke.widget.SwitchButton;

public class MyMenuFragment extends Fragment {
FragmentMyMenuBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMyMenuBinding.inflate(inflater,container,false);

        SwitchButton switchButton = (com.suke.widget.SwitchButton)binding.switchButton;
        switchButton.setChecked(false);
        switchButton.isChecked();
        switchButton.toggle();     //switch state
        switchButton.toggle(true);//switch without animation
        switchButton.setShadowEffect(true);//disable shadow effect
        switchButton.setEnabled(true);//disable button
        switchButton.setEnableEffect(false);//disable the switch animation

        return binding.getRoot();
    }
}