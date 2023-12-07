package com.example.project01_jkhtalk.friend;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project01_jkhtalk.R;
import com.example.project01_jkhtalk.databinding.FragmentFriendBinding;

import java.util.ArrayList;

public class FriendFragment extends Fragment {

    FragmentFriendBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFriendBinding.inflate(inflater, container , false);


        binding.recvFriend.setAdapter(new FriendRecvAdapter(inflater, getFriendList() , getContext()));
        binding.recvFriend.setLayoutManager(new LinearLayoutManager(getContext()));

        return binding.getRoot();
    }

    ArrayList<FriendDTO> getFriendList(){
        ArrayList<FriendDTO> list = new ArrayList<>();
        list.add(new FriendDTO(R.drawable.friend_profile_img , R.drawable.friend_back_img, "홍길동", "ㅠㅠ"));
        list.add(new FriendDTO(R.drawable.friend_profile_img_2 , R.drawable.friend_back_img_2, "한혜훈", "♥ ぁĦ가,서쪽어l서,뜰ㄸĦ까ズl,バr랑하l,♡"));
        list.add(new FriendDTO(R.drawable.friend_profile_img_3 , R.drawable.friend_back_img_3, "김윤혁", ""));
        list.add(new FriendDTO(R.drawable.friend_profile_img_4 , R.drawable.friend_back_img_4, "이희주", "♥ (♡)…‥バr랑ㆅ면원己H믿는거○F^-^"));
        list.add(new FriendDTO(R.drawable.friend_profile_img_5 , R.drawable.friend_back_img_5, "송동민", "♥ Łй □占을 훔쳐간 당신은 도둑＿☆」"));
        list.add(new FriendDTO(R.drawable.friend_profile_img_6 , R.drawable.friend_back_img_6, "홍우일", "♥ ☆‥Шħiŧёđау。♥‥-Ð ┼──└˚ 。Łоνе 。˚…───┼"));
        list.add(new FriendDTO(R.drawable.friend_profile_img_7 , R.drawable.friend_back_img_7, "전상철", ""));
        list.add(new FriendDTO(R.drawable.friend_profile_img_8 , R.drawable.friend_back_img_8, "유경화", "♥ ─────────── Уоυг Му Веｓт Ｆгıепđ〃♡〃"));
        list.add(new FriendDTO(R.drawable.bori , R.drawable.img3, "남주호", "♥ ♣_。НаррУ〃―Ð×ㅎŀ늘만큼 땅만큼 너를バŀㄹБㅎЙ♡"));
        list.add(new FriendDTO(R.drawable.img1 , R.drawable.img4, "하대영", ""));
        list.add(new FriendDTO(R.drawable.img2, R.drawable.img5, "최은주", "♥ ˛ε♡ з¸‥+ НАррч ÐАч+‥ ˛ε♡ з¸"));
        list.add(new FriendDTO(R.drawable.friend_profile_img , R.drawable.friend_back_img, "홍길동", "ㅠㅠ"));
        list.add(new FriendDTO(R.drawable.friend_profile_img_2 , R.drawable.friend_back_img_2, "한혜훈", "♥ ぁĦ가,서쪽어l서,뜰ㄸĦ까ズl,バr랑하l,♡"));
        list.add(new FriendDTO(R.drawable.friend_profile_img_3 , R.drawable.friend_back_img_3, "김윤혁", ""));
        list.add(new FriendDTO(R.drawable.friend_profile_img_4 , R.drawable.friend_back_img_4, "이희주", "♥ (♡)…‥バr랑ㆅ면원己H믿는거○F^-^"));
        list.add(new FriendDTO(R.drawable.friend_profile_img_5 , R.drawable.friend_back_img_5, "송동민", "♥ Łй □占을 훔쳐간 당신은 도둑＿☆」"));
        list.add(new FriendDTO(R.drawable.friend_profile_img_6 , R.drawable.friend_back_img_6, "홍우일", "♥ ☆‥Шħiŧёđау。♥‥-Ð ┼──└˚ 。Łоνе 。˚…───┼"));
        list.add(new FriendDTO(R.drawable.friend_profile_img_7 , R.drawable.friend_back_img_7, "전상철", ""));
        list.add(new FriendDTO(R.drawable.friend_profile_img_8 , R.drawable.friend_back_img_8, "유경화", "♥ ─────────── Уоυг Му Веｓт Ｆгıепđ〃♡〃"));
        list.add(new FriendDTO(R.drawable.bori , R.drawable.img3, "남주호", "♥ ♣_。НаррУ〃―Ð×ㅎŀ늘만큼 땅만큼 너를バŀㄹБㅎЙ♡"));
        list.add(new FriendDTO(R.drawable.img1 , R.drawable.img4, "하대영", ""));
        list.add(new FriendDTO(R.drawable.img2, R.drawable.img5, "최은주", "♥ ˛ε♡ з¸‥+ НАррч ÐАч+‥ ˛ε♡ з¸"));
        binding.tvFriendCnt.setText("친구 " + list.size());
        return list;
    }
}