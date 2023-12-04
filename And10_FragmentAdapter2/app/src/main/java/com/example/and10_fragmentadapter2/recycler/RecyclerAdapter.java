package com.example.and10_fragmentadapter2.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.and10_fragmentadapter2.R;
import com.example.and10_fragmentadapter2.listv.ListDTO;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.JkhViewHolder> {


    //onCreateViewHolder : 내가 만들어둔 Viewholder를 직접 만들어서 return을 해줌.
    //1회성으로 생성이 완료되면 다시 메소드를 실행x
    //layoutInflater 가 필요하다 ※
    LayoutInflater inflater;
    ArrayList<ListDTO> list;

    public RecyclerAdapter(LayoutInflater inflater, ArrayList<ListDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }



    @NonNull
    @Override
    public JkhViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_listv , parent , false);

        JkhViewHolder  holder = new JkhViewHolder(v);
        return holder;
    }

    //onBindViewHolder : onCreateViewHolder에서 만들어둔 ViewHolder를 다시 우리한테 줌. ( 데이터 바인딩처리)
    @Override
    public void onBindViewHolder(@NonNull JkhViewHolder h, int i) {
        h.imgv_profile.setImageResource(list.get(i).getImgRes());
        h.tv_name.setText(list.get(i).getName());
        h.btn.setText(list.get(i).getAge()+"");
    }


    //몇개의 칸이 필요한지를 써주는 구간. : list.size();
    @Override
    public int getItemCount() {
        return list.size();
    }

    //1.ViewHolder라는 클래스를 내부에 만들어준다. (뷰들을 묶어놓기 위한 DTO)
    // extends RecyclerView.ViewHolder 를 해줌
    // View itemview : View v = LayoutInflater.inflate(..);
    public class JkhViewHolder extends RecyclerView.ViewHolder {
        ImageView imgv_profile;
        TextView tv_name;
        Button btn;
        public JkhViewHolder(@NonNull View v) {
            super(v);
            imgv_profile = v.findViewById(R.id.lba_imgv);
            tv_name = v.findViewById(R.id.lba_tv_name);
            btn = v.findViewById(R.id.lba_btn);
        }
    }
}
