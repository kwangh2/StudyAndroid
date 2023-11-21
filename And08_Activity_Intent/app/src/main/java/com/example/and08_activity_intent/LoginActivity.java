package com.example.and08_activity_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText edt_id;
    EditText edt_pw;
    Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edt_id = findViewById(R.id.edt_id);
        edt_pw = findViewById(R.id.edt_pw);
        btn_login = findViewById(R.id.btn_login);

        TextView signin = findViewById(R.id.tv_join);
        signin.setOnClickListener(v -> {
            Intent intent = new Intent(this,sign.class);
            startActivity(intent);

        });
        Toast.makeText(this, "나는 컨텍스트", Toast.LENGTH_SHORT).show();

        btn_login.setOnClickListener(v -> {
            //Context : 모든 액티비티는 Context 자체
            //Context 라는 것은 앱의 현재 상태나 환경에 대한 모든 정보를 제공하고 접근할수있는 인터페이스임 (Static
            //화면 전환 , 토스트창을 보여주는 등의 디자인 관련된 기능을 사용하기 위해서는 내가 현재 액티비티를 만드시 알려줘야 할 의무가 있음.

            //Intent 초기화 시 필요한 정보 : 화면 전환시, 1. 현재 앱의 상태(현재 화면 ..등) 2. 실행이 되어야 할 화면 (Activity)의 클래스 위치



            if (edt_id.getText().toString().equals("admin") && edt_pw.getText().toString().equals("admin1234")) {
                Log.d("로그인", "로그인 성공");
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }else{
                Log.d("로그인", "로그인 실패");
                Log.d("로그인", "pw: "+ edt_pw.getText());
                Log.d("로그인", "id: "+ edt_id.getText());
            }
        });
    }
}