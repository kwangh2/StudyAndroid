package com.example.and10_fragmentadapter2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.and10_fragmentadapter2.fragments.MyFragment;
import com.example.and10_fragmentadapter2.fragments.MyFragment2;
import com.example.and10_fragmentadapter2.fragments.SgFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btn_frag1);
        Button btn2 = findViewById(R.id.btn_frag2);
        Button btn_sg = findViewById(R.id.btn_frag3);
        MyFragment fragment = new MyFragment();

        btn.setOnClickListener(v -> {
            getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();//레이아웃 종류 , 프래그먼트 클래스
        });

        btn2.setOnClickListener(v -> {
            getSupportFragmentManager().beginTransaction().replace(R.id.container,new MyFragment2()).commit();//레이아웃 종류 , 프래그먼트 클래스
        });

        btn_sg.setOnClickListener(v -> {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, new SgFragment()).commit();
        });

    }
}