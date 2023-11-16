package com.example.and06_etclayoutscroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_text;
    View btm_nav;
    HorizontalScrollView scroll_h;
    ScrollView scroll_v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_text = findViewById(R.id.tv_text);
        tv_text.setText("글자"); //기존 글자를 현재 파라메터의 String 으로 바꿈
        scroll_h = findViewById(R.id.scroll_h);
        scroll_v = findViewById(R.id.scroll_v);
        btm_nav = findViewById(R.id.btm_nav);

        btm_nav.setOnClickListener(v -> {
            Log.d("Scroll위치", "getScrollY" + scroll_v.getScrollY());
            Log.d("Scroll위치", "getScrollX" + scroll_h.getScrollX());
            scroll_v.scrollTo(0,scroll_v.getScrollY()+100);
            scroll_h.smoothScrollTo(scroll_h.getScrollX()+100,0);
        });
        for(int i = 0 ; i <100; i++){
            tv_text.append("오른쪽으로붙이기 ");
        }
        for (int i =0; i<100 ; i++) {

            //int형을 넣으면 res하위에 있는 리소스 아이디로 판단을 함. String 형태로 바꿔서 넣어줘야함.
//        int errorNum =1;
//        tv_text.setText(errorNum); 이러면 에러남 저번에 8진법으로 주소찾는것처럼 찾아벌임
            tv_text.append("붙이기 \n" );
        }


    }
}