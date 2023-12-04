package com.example.and10_fragmentadapter2.melon;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and10_fragmentadapter2.R;

import java.util.ArrayList;

public class melonFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_melon, container, false);
        ArrayList<MelonDTO> list = new ArrayList<>();
        list.add(new MelonDTO(R.drawable.chart_img1 , "Perfect Night" , "LE SSERAFIM"));
        list.add(new MelonDTO(R.drawable.chart_img2 , "Drama" , "aespa"));
        list.add(new MelonDTO(R.drawable.chart_img3 , "Baddie" , "IVE"));
        list.add(new MelonDTO(R.drawable.chart_img4 , "To.X" , "태연"));
        list.add(new MelonDTO(R.drawable.chart_img5 , "사랑은 늘 도망가" , "임영웅"));
        list.add(new MelonDTO(R.drawable.chart_img6 , "Seven" , "정국"));
        return view;
    }
}