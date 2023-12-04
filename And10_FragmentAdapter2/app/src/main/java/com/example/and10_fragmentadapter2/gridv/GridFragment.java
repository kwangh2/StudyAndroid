package com.example.and10_fragmentadapter2.gridv;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.and10_fragmentadapter2.R;
import com.example.and10_fragmentadapter2.listv.ListDTO;

import java.util.ArrayList;
import java.util.Random;

public class GridFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_grid, container, false);

        ArrayList<ListDTO> list = new ArrayList<>();
        list.add(new ListDTO(R.drawable.img1, new Random().nextInt(10)+1, "강아지", "여"));
        list.add(new ListDTO(R.drawable.img2, new Random().nextInt(10)+1, "보리", "여"));
        list.add(new ListDTO(R.drawable.img3, new Random().nextInt(10)+1, "귀여운보리", "여"));
        list.add(new ListDTO(R.drawable.img4, new Random().nextInt(10)+1, "귀여운강아지", "여"));
        list.add(new ListDTO(R.drawable.img5, new Random().nextInt(10)+1, "bori", "여"));
        list.add(new ListDTO(R.drawable.img1, new Random().nextInt(10)+1, "강아지", "여"));
        list.add(new ListDTO(R.drawable.img2, new Random().nextInt(10)+1, "보리", "여"));
        list.add(new ListDTO(R.drawable.img3, new Random().nextInt(10)+1, "귀여운보리", "여"));
        list.add(new ListDTO(R.drawable.img4, new Random().nextInt(10)+1, "귀여운강아지", "여"));
        list.add(new ListDTO(R.drawable.img5, new Random().nextInt(10)+1, "bori", "여"));
        list.add(new ListDTO(R.drawable.img1, new Random().nextInt(10)+1, "강아지", "여"));
        list.add(new ListDTO(R.drawable.img2, new Random().nextInt(10)+1, "보리", "여"));
        list.add(new ListDTO(R.drawable.img3, new Random().nextInt(10)+1, "귀여운보리", "여"));
        list.add(new ListDTO(R.drawable.img4, new Random().nextInt(10)+1, "귀여운강아지", "여"));
        list.add(new ListDTO(R.drawable.img5, new Random().nextInt(10)+1, "bori", "여"));

        GridView gridv = v.findViewById(R.id.gridv);
        GridAdapter adapter = new GridAdapter(inflater , list);
        gridv.setAdapter(adapter);

        return v;
    }
}