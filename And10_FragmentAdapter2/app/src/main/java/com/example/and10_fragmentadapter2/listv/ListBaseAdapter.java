package com.example.and10_fragmentadapter2.listv;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.and10_fragmentadapter2.R;

import java.util.ArrayList;

//1. 상속을 받는다
public class ListBaseAdapter extends BaseAdapter {
    //baseAdapter의 경우 LayoutInfalter 사용이 바로 x -> 상위 클래스에서 받아옴

    LayoutInflater inflater;
    ArrayList<ListDTO> list;

    public ListBaseAdapter(LayoutInflater inflater, ArrayList<ListDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

   /* public ListBaseAdapter(LayoutInflater inflater) {
        this.inflater = inflater;
    }*/

    //몇개의 아이템이 있는지 : getView(); <-칸에 LayoutInflater 를 이용해서 레이아웃을 붙이는 처리를 함.
    @Override
    public int getCount() {
        return list.size();
    }

    //외부에서 해당 칸의 데이터를 이용해야할떄 사용하는 메소드 (큰 의미는 없기 때문에 position return)
    @Override
    public Object getItem(int position) {
        return position;
    }

    //한칸의 아이템의 식별자
    @Override
    public long getItemId(int position) {
        return position;
    }


    //3. getCount의 return 숫자만큼 반복하면서 아이템을 붙이는 처리를 하는 공간
    //position : getView메소드는 계속해서 반복함 ↑(getCount의 개수 만큼) , 스크롤, index
    //convertView : 내가 붙이고 나서의 View타입을 제공]
    //parent : 칸 (getCount만큼 붙일 ViewGroup(Layout) 종류로 칸을 제공)

    @Override
    public View getView(int i, View v, ViewGroup parent) {
        Log.d("리스트뷰", "getView: " + v + " : i " + i);
//        if(v==null){
//
//        }
        v = inflater.inflate(R.layout.item_listv,parent,false);//어떤 레이아웃을 붙일건지,어디에붙일건지
        ImageView imgvProfile = v.findViewById(R.id.lba_imgv);
        TextView tv_name = v.findViewById(R.id.lba_tv_name);
        Button btn = v.findViewById(R.id.lba_btn);
        imgvProfile.setImageResource(list.get(i).getImgRes());
        tv_name.setText( list.get(i).getName());
        btn.setText(list.get(i).getAge()+"");

        btn.setOnClickListener(v1 ->{
            //이벤트 작성 가능!
        });
        return v;
    }
}
