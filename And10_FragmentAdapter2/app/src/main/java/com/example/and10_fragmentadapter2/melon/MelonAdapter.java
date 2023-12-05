package com.example.and10_fragmentadapter2.melon;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.and10_fragmentadapter2.R;

import java.util.ArrayList;

public class MelonAdapter extends RecyclerView.Adapter<MelonAdapter.MelonViewHolder> {
    LayoutInflater inflater;
    ArrayList<MelonDTO> list;

    public MelonAdapter(LayoutInflater inflater) {
        this.inflater = inflater;
        this.list = list;
    }



    @NonNull
    @Override
    public MelonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.fragment_melon,parent,false);
        MelonViewHolder holder = new MelonViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MelonViewHolder h, int i) {
        h.imgv_chart.setImageResource(list.get(i).getImg_cover());
        h.tv_singer.setText(list.get(i).getSingerName());
        h.tv_songname.setText(list.get(i).getSongName());
        h.tv_chartNum.setText(i+"");
    }


    @Override
    public int getItemCount() {
        return 10;
    }


    public class MelonViewHolder extends RecyclerView.ViewHolder {
        ImageView imgv_chart;
        TextView tv_songname;
        TextView tv_chartNum;
        TextView tv_singer;
        public MelonViewHolder(@NonNull View v) {
            super(v);
            imgv_chart = v.findViewById(R.id.img_cover);
            tv_songname = v.findViewById(R.id.songName);
            tv_chartNum = v.findViewById(R.id.chartNum);
            tv_singer = v.findViewById(R.id.SingerName);
        }
    }
}
