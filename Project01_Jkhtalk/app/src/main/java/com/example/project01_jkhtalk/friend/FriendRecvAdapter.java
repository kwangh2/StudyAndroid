package com.example.project01_jkhtalk.friend;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_jkhtalk.databinding.ItemFriendRecvBinding;

import java.util.ArrayList;

public class FriendRecvAdapter extends RecyclerView.Adapter<FriendRecvAdapter.ViewHolder> {
    LayoutInflater inflater;
    ArrayList<FriendDTO> list;
    Context context;

    public FriendRecvAdapter(LayoutInflater inflater, ArrayList<FriendDTO> list, Context context) {
        this.inflater = inflater;
        this.list = list;
        this.context = context;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemFriendRecvBinding binding = ItemFriendRecvBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.imgvProfile.setImageResource(list.get(i).getProfileImg());
        h.binding.tvName.setText(list.get(i).getName());
        h.binding.tvMag.setText(list.get(i).getMsg());

        h.binding.lnFriend.setOnClickListener(v -> {
            Intent intent = new Intent(context , FriendDetailActivity.class);
            intent.putExtra("dto" , list.get(i));
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    //1.viewHolder ( view ) ->binding 을 사용해보기
    public class ViewHolder extends RecyclerView.ViewHolder{
        ItemFriendRecvBinding binding; //모든위젯 종류를 씀.
        public ViewHolder(@NonNull  ItemFriendRecvBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
    public  class VH extends RecyclerView.ViewHolder {
        public VH(@NonNull View itemView) {
            super(itemView);
        }
    }
}
