package com.example.project01_jkhtalk.opentalk;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_jkhtalk.databinding.ItemOpentalkChat2Binding;
import com.example.project01_jkhtalk.databinding.ItemOpentalkChatBinding;

import java.util.ArrayList;

public class OpenSubAdapter2 extends RecyclerView.Adapter<OpenSubAdapter2.ViewHolder> {
    ArrayList<OpenSubDTOs.OpenSub2DTO> list;

    public OpenSubAdapter2(ArrayList<OpenSubDTOs.OpenSub2DTO> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        /* LayoutInflater.from(parent.getContext()); 레이아웃 인플레이터 자동 생성 리사이클러뷰 어댑터에서만 가능*/
        ItemOpentalkChat2Binding binding = ItemOpentalkChat2Binding.inflate(LayoutInflater.from(parent.getContext()), parent , false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.imgvProfile.setImageResource(list.get(i).getImgTitle());

        h.binding.tvJoin.setText(list.get(i).getChatCnt() + "명 참여중");
        h.binding.tvRecentMsg.setText(list.get(i).getRecentChat());
        String tag = "";
        for(int j = 0 ; j<list.get(i).getTagArr().length; j++){
            tag += list.get(i).getTagArr()[j];
        }
        h.binding.tvTag.setText(String.join(list.get(i).getTagArr()[i]));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemOpentalkChat2Binding binding;
        public ViewHolder(@NonNull ItemOpentalkChat2Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
