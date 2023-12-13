package com.example.project02_last.common;

import android.app.ProgressDialog;
import android.content.Context;
import android.telecom.Call;
import android.util.Log;


import com.example.project02_last.R;

import java.util.HashMap;

import retrofit2.Callback;
import retrofit2.Response;


public class CommonConn {
    //재사용 : URL , Param, Method??
    //다이얼로그 : 데이터를 로딩중인 경우 알려줌.(조작x), Context
    private final String TAG = "CommonConn";
    private String url;
    private HashMap<String, Object> paramMap;
    private ProgressDialog dialog;
    private Context context; //Toast, 다이얼로그 같은 경우 화면 위에 나와야함( 현재 화면이 어떤 상태인지, 무엇인지.. Context)

    public CommonConn(Context context, String url) {
        this.url = url;
        this.context = context;
        this.paramMap = new HashMap<>();
    }

    public CommonConn addParamMap(String key, Object value) {
        if (key == null) return this;
        paramMap.put(key, value);
        return this; //addParamMap(key,value).addParamMap(....)
    }

    //전송 실행 전 해야할 코드를 넣어줄 메소드 (onPre)
    private void onPreExcute() {
        if (context != null && dialog == null) {
            dialog = new ProgressDialog(context);
            dialog.setProgress(ProgressDialog.STYLE_SPINNER);
            dialog.setTitle(context.getString(R.string.app_name));
            dialog.setMessage("현재 데이터 로딩중");
            dialog.setCancelable(false);
            dialog.show();
        }
    }

    public void onExcute(JkhCallBack callBack) {
        onPreExcute();

        CommonService service = CommonRetClient.getRetrofit().create(CommonService.class);
        service.clientPostMethod(url, paramMap).enqueue(new Callback<String>() {
            @Override
            public void onResponse(retrofit2.Call<String> call, Response<String> response) {
                Log.d(TAG, "onResponse: " + response.body());
                Log.d(TAG, "onResponse: " + response.errorBody());
                if (response.errorBody() == null) {
                    //옵저버 패턴 순서  3: 호출 -> MainActivity new in....
                    callBack.onResult(true, response.body());
                } else {
                    callBack.onResult(false, response.body());
                }
            }

            @Override
            public void onFailure(retrofit2.Call<String> call, Throwable t) {
                Log.d(TAG, "onFailure: " + t.getMessage());
                callBack.onResult(false, t.getMessage());
            }
        });
        onPostExcute();
    }


    private void onPostExcute() {
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();//다이얼로그 안보이게 처리
        }
    }


    //옵저버 패턴의 순서 1. 응답을 위한 메소드를 가진 인터페이스를 하나 만든다.
    public interface JkhCallBack {
        public void onResult(boolean isResult, String data); //MainActivity에서 new 로 생성후 -> CommonConn. - onResult().
    }
}
