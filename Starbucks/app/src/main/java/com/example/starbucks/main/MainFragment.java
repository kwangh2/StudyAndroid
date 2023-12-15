package com.example.starbucks.main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.starbucks.R;
import com.example.starbucks.databinding.ActivityMainBinding;
import com.example.starbucks.databinding.FragmentMainBinding;
import com.example.starbucks.databinding.FragmentQuickOrderBinding;
import com.example.starbucks.databinding.ItemRecvBeverageBinding;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    FragmentMainBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(inflater, container, false);
        MainPagerAdapter adapter = new MainPagerAdapter(this, getFragmentList());
        binding.pagerQuickOrder.setAdapter(adapter);
        ViewPager2 pager2 = binding.pagerQuickOrder;
        pager2.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
        pager2.setClipToPadding(false);
        pager2.setClipChildren(false);
        pager2.setOffscreenPageLimit(1);
        pager2.setPadding(100, 0, 200, 0);
        pager2.setPageTransformer(new MarginPageTransformer(100));
        pager2.setAdapter(new MainPagerAdapter(this, getFragmentList()));
        WhatsnewAdapter nAdapter = new WhatsnewAdapter(inflater,getNewList(),getContext());
        binding.rcyvWhatsNew.setAdapter(nAdapter);
        binding.rcyvWhatsNew.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));

        return binding.getRoot();

    }

    ArrayList<Fragment> getFragmentList() {
        ArrayList<Fragment> list = new ArrayList<>();

        list.add(new QuickOrderFragment(new QuickOrderDTO("자몽 허니 블랙 티" ,"ICED | Venti","광주신안DT" , R.drawable.menu_ghbt )));
        list.add(new QuickOrderFragment(new QuickOrderDTO("돌체 콜드브루" ,"ICED | Venti","광주신안DT" , R.drawable.menu_dolcecb )));
        list.add(new QuickOrderFragment(new QuickOrderDTO("유자 민트 티" ,"ICED | Venti","광주신안DT" , R.drawable.menu_minttea )));
        return list;
    }


    ArrayList<WhatsnewDTO> getNewList(){
        ArrayList<WhatsnewDTO> list = new ArrayList<>();
        list.add(new WhatsnewDTO(R.drawable.img_6,"스타벅스 더북한강R점에서 함께하는 12월 유기견 입양 캠페인" , "-"));
        list.add(new WhatsnewDTO(R.drawable.img_7,"CARRY the MERRY 기부의날" , "최대 기부금 5억원 적립에 동참해 주세요"));
        list.add(new WhatsnewDTO(R.drawable.img_8,"스타벅스 윈터 버디 위크" , "윈터 버디 위크에서 특별한 혜택과 상품을"));
        return list;
    };
    ArrayList<MainDTO> getMenuList(){
        ArrayList<MainDTO> list =  new ArrayList<>();
        list.add(new MainDTO("유자 민트티" ,R.drawable.menu_minttea ,"HOT | Venti", "광주신안DT"));
        list.add(new MainDTO("돌체 콜드 브루" ,R.drawable.menu_dolcecb, "ICED | Venti", "광주신안DT"));
        list.add(new MainDTO("아이스 자몽 허니 블랙 티" ,R.drawable.menu_ghbt, "ICED | Trenta", "광주신안DT"));
        list.add(new MainDTO("아이스 자몽 허니 블랙 티" ,R.drawable.menu_hibiscus, "ICED | Trenta", "광주신안DT"));
        return list;
    }
}