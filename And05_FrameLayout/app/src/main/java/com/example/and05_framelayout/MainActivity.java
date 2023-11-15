package com.example.and05_framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btn_change ;
    ImageView imgv1, imgv2, imgv3;
    int btnNum=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//activity_main.xml에 있는 내용들을 메모리에 올림.


        btn_change = findViewById(R.id.btn_change);
        imgv1 = findViewById(R.id.imgv1);
        imgv2 = findViewById(R.id.imgv2);
        imgv3 = findViewById(R.id.imgv3);
        //View를 상속받은 모든 위젯들은 (화면에 보이는 모든것들, 레이아웃 포함) 사용자의 클릭을 감지하는 View.OnclickListner를 가지고있다.
//        btn_change.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //여기서 이벤트처리
//
//            }
//        });
//        while(true){
            btn_change.setOnClickListener(v -> {
                //내가 버튼을 누름
                ++btnNum;
                if(btnNum==4){
                    btnNum=1;
                }
                //logd , i ,e ..
                if(btnNum ==1 ){
                    imgv1.setVisibility(View.VISIBLE);
                    imgv2.setVisibility(View.VISIBLE);
                    imgv3.setVisibility(View.VISIBLE);
                }
                if(btnNum ==2 ){
                    imgv3.setVisibility(View.GONE);

                }
                if(btnNum==3){
                    imgv3.setVisibility(View.GONE);
                    imgv2.setVisibility(View.GONE);
                }
                Log.d("JKH LOG", "내가 쓰고싶은 거 String");
                Log.e("JKH LOG", "Error Log",null);
                Log.i("JKH LOG", "뭔가 정보를 표기할때 ");
                //여기서 이벤트 처리
            });
//        }


    }
}