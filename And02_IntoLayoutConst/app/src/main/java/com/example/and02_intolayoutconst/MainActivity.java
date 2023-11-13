package com.example.and02_intolayoutconst;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //일단 코드로 디자인 해보기(xml에 나오는 모든 위젯은 클래스 형태로 존재함.)
        Button button = new Button(this );//Context는 6장 이후에 심화되는 내용. 현재는 this 를 사용한다
        button.setText("자바 코드로 디자인");


        ConstraintLayout layout =  new ConstraintLayout(this);
        layout.addView(button);

        setContentView(layout);

        //java 코드에서 res 하위 layout파일을 선택 후 연결
        //setContentView(R.layout.activity_main);
    }
}