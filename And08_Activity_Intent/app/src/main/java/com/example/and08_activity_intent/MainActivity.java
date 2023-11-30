package com.example.and08_activity_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //현재는 onCreate 메소드에서 대부분의 코드를 처리해도 무방함
    // 추후 여러 화면 또는 Spring 연동 시 새로고침 등의 처리가 필요하다면 수명주기가 있다는 사실을 인지하고 사용하면됨.

    //모든 개발 툴에서는 디버깅 모드가 제공이됨 -> 이것을 활용하면 프로그램의 전체 구조를 빠르게 파악하거나 오류 수정이 수월함.
    private final String TAG = "액티비티 수명주기";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");

        Intent intent = getIntent(); //LoginActivity에서 보내준 인텐트를 객체로 초기화 시킴
        Log.d(TAG, "onCreate: " + intent.getIntExtra("intw"));
        Log.d(TAG, "onCreate: " + intent.getStringExtra("strkey"));
        Log.d(TAG, "onCreate: " + intent.getIntExtra("dtokey",-1));
        Log.d(TAG, "onCreate: " + intent.getIntExtra("intKey",-1));
        //dto의 필드부분을 전부 바이트형태의 통신 하기 편한 방법으로 일자로 세움 . "loginId" , "값"...
        LoginDTO dto = (LoginDTO) intent.getSerializableExtra("dtokey");
        Log.d(TAG, "onCreate: " + dto.getLoginId() + " : " + dto.getLoginPw());
        ArrayList<LoginDTO> list = (ArrayList<LoginDTO>) intent.getSerializableExtra("listkey");
        Log.d(TAG, "onCreate: "+ list.size()); //명시적인텐트 , 두개의 액티비티가 제어가 가능한 상태.


    }

    //추후에 ActivityLauncher, onActivityResult 등으로 결과를 가지고오는 코드도 진행해야함
    Button call_button , search_button , sms_button;
    EditText call , search, sms;
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
        call_button = findViewById(R.id.call_button);
        search_button = findViewById(R.id.search_button);
        sms_button = findViewById(R.id.sms_button);


        call = findViewById(R.id.call);
        search = findViewById(R.id.search);
        sms = findViewById(R.id.sms);

        //암시적 인텐트 : activity => action(내가 없는 기능)으로 사용함.
        call_button.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL , Uri.parse( "tel:/" + call.getText().toString() ));
            startActivity(intent);
        });

        search_button.setOnClickListener(this);
        sms_button.setOnClickListener(this);
        //onStart에서 find등의 작업을 수행 예정. (setContentView라는 메소드가 실행이 이후 -> onStart())


    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.search_button){
            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
            intent.putExtra(SearchManager.QUERY,search.getText().toString());//putExtra(QUERY,검색어)
            startActivity(intent);
        }else if(v.getId() == R.id.sms_button){
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("smsto:" + Uri.encode("010-1111-1111")));
            intent.putExtra("sms_body", sms.getText().toString());
            startActivity(intent);
        }
    }
}