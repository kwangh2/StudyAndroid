package com.example.and09_layoutinflater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    Button btn_inflate;
    LinearLayout ll_layout;
    RelativeLayout rl_layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_inflate = findViewById(R.id.btn_inflate);
        ll_layout = findViewById(R.id.ll_layout);
        rl_layout = findViewById(R.id.rl_layout);

        LayoutInflater inflater = getLayoutInflater();

        btn_inflate.setOnClickListener(v -> {
            View viewsub1 = inflater.inflate(R.layout.sub_layout1,ll_layout,true);
            Button btn_sub1 = viewsub1.findViewById(R.id.btn_sub1);

            inflater.inflate(R.layout.sub_layout2,rl_layout,true);
        });
    }
}