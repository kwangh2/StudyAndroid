package com.example.project01_jkhtalk.chat;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project01_jkhtalk.MainActivity;
import com.example.project01_jkhtalk.R;
import com.example.project01_jkhtalk.databinding.ActivityMainBinding;
import com.example.project01_jkhtalk.databinding.FragmentChatBinding;

public class ChatFragment extends Fragment {
     FragmentChatBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentChatBinding.inflate(inflater, container , false);
        binding.recvChat.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();
    }
}