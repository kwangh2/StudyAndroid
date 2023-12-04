package com.example.and10_fragmentadapter2.listv;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.and10_fragmentadapter2.R;

import java.util.ArrayList;
import java.util.Random;


public class ListBaseFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_base, container, false);
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

        ListView listv = view.findViewById(R.id.listv);
        ListBaseAdapter adapter = new ListBaseAdapter(inflater,list);
        listv.setAdapter(adapter);
        return view;
    }
}