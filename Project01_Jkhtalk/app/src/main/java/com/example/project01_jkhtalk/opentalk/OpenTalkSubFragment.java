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
import com.google.android.material.chip.Chip;


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

//        ViewGroup에 자식요소를 넣는것은 addView
//        xml파일에서 사용한 모든 속성들은 메소드 형태로도 존재함.
//        Context 필요함 (화면의 상태 정보를 꼭 알아야 하는 경우)
        String[] chipTexts = {"밀덕" , "등산" , "동화책" , "김태형" , "라이즈" , "명품정보", "송흥민", "레고", "니트", "해외축구" , "시고르자브종" , "이영지"};
        for (int i = 0; i<chipTexts.length; i++){
            Chip chip = getChip(chipTexts[i]);
            binding.chipGrpOpensub.addView(chip);
        }

        return binding.getRoot();
    }

    Chip getChip(String text){
        Chip chip = new Chip(getContext(),null , com.google.android.material.R.style.Widget_MaterialComponents_Chip_Choice); //자바에서도 스타일 호출 가능!
        chip.setText(text);
        chip.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)); //넓이 높이
//        binding.chipGrpOpensub.addView(chip); //칩 추가
        return chip;
    }
}