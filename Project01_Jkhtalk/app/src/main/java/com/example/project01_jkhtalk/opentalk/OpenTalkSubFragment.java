package com.example.project01_jkhtalk.opentalk;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project01_jkhtalk.R;
import com.example.project01_jkhtalk.databinding.FragmentOpenTalkMainBinding;
import com.example.project01_jkhtalk.databinding.FragmentOpenTalkSubBinding;


public class OpenTalkSubFragment extends Fragment {
    FragmentOpenTalkSubBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentOpenTalkSubBinding.inflate(inflater,container,false);
        OpenSubDAO dao = new OpenSubDAO();
        binding.recvOpensub1.setAdapter(new OpenSubAdapter1(dao.getOpenSub1List()));
        binding.recvOpensub1.setLayoutManager(new LinearLayoutManager(getContext())); /*방향성 지정*/

        binding.recvOpensub2.setAdapter(new OpenSubAdapter2(dao.getOpenSub2List()));
        binding.recvOpensub2.setLayoutManager(new LinearLayoutManager(getContext()));

        binding.recvOpensub3.setAdapter(new OpenSubAdapter2(dao.getOpenSub3List()));
        binding.recvOpensub3.setLayoutManager(new LinearLayoutManager(getContext()));

        binding.recvOpensub4.setAdapter(new OpenSubAdapter3(dao.getOpenSub4List()));
        binding.recvOpensub4.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL,false));
        return binding.getRoot();
    }
}