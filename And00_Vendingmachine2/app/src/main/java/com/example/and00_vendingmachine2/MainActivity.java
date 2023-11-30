package com.example.and00_vendingmachine2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv_name1 , tv_name2 , tv_name3 , tv_name4;
    TextView tv_cnt1 , tv_cnt2 , tv_cnt3 , tv_cnt4;
    Button btn_order1 , btn_order2,btn_order3,btn_order4;
    TextView tv_money;
    EditText edt_money;
    Button btn_input, btn_output;

    int money; //사용자의 금액을 관리하기위한 변수
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_name1 = findViewById(R.id.tv_name);
        tv_name2 = findViewById(R.id.tv_name2);
        tv_name3 = findViewById(R.id.tv_name3);
        tv_name4 = findViewById(R.id.tv_name4);

        tv_cnt1 = findViewById(R.id.tv_cnt1);
        tv_cnt2 = findViewById(R.id.tv_cnt2);
        tv_cnt3 = findViewById(R.id.tv_cnt3);
        tv_cnt4 = findViewById(R.id.tv_cnt4);

        btn_order1 = findViewById(R.id.btn1);
        btn_order2 = findViewById(R.id.btn2);
        btn_order3 = findViewById(R.id.btn3);
        btn_order4 = findViewById(R.id.btn4);

        tv_money = findViewById(R.id.tv_money);
        edt_money = findViewById(R.id.edt_money);
        btn_input = findViewById(R.id.btn_money);
        btn_output = findViewById(R.id.btn_output);

        btn_input.setOnClickListener(v -> {


        });
    }



}