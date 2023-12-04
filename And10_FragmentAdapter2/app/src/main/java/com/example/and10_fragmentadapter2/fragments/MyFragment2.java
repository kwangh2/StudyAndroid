package com.example.and10_fragmentadapter2.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and10_fragmentadapter2.R;


public class MyFragment2 extends Fragment {

    //1. 필요없는 코드 모두 삭제
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_my2, container, false);


        return v;
    }
}