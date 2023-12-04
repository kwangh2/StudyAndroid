package com.example.and10_fragmentadapter2.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.and10_fragmentadapter2.R;


public class SgFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v  = inflater.inflate(R.layout.fragment_sg, container, false);
        Button btn_sg = v.findViewById(R.id.btn_sgfrag);
        btn_sg.setOnClickListener(v2 ->{
            btn_sg.setText("버튼이 클릭되엇습니다!");
        });
        return v;
    }
}