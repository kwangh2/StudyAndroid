package com.example.project02_last.member;

import androidx.activity.result.ActivityResultLauncher;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.project02_last.MainActivity;
import com.example.project02_last.R;
import com.example.project02_last.common.CommonConn;
import com.example.project02_last.databinding.ActivityLoginBinding;
import com.google.gson.Gson;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.user.UserApiClient;
import com.navercorp.nid.NaverIdLoginSDK;
import com.navercorp.nid.oauth.NidOAuthLogin;
import com.navercorp.nid.oauth.OAuthLoginCallback;
import com.navercorp.nid.profile.NidProfileCallback;
import com.navercorp.nid.profile.data.NidProfileResponse;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public class LoginActivity extends AppCompatActivity {
    ActivityLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        NaverIdLoginSDK.initialize(context, {OAUTH_CLIENT_ID}, {OAUTH_CLIENT_SECRET}, {OAUTH_CLIENT_NAME})
        NaverIdLoginSDK.INSTANCE.initialize(this, "jqovl4FN_ZP_kuIRvh5C" , "L4NDkSj0Yz", "Project02_Last");
        ActivityResultLauncher<Intent> oauthLoginCallback;

        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Glide.with(this).load("https://taehyunha.files.wordpress.com/2020/05/cdd521b0d71ce352728ffe8055434b8be509dcf819b0d184e360a2699c2ab4413df86935009322be24d8778aa5ededf8d3fbc860f2931c41261cc214d2dfdd731eb47db6d9eb84aa015c90821384078cca79f92d0af79b36726f447190.gif").into(binding.imgvLogo);

//        new CommonConn(this,"askjd.jkh").addParamMap("param","andData").onExcute((isResult, data) -> {
//            Log.d("테스트", "onCreate: " + isResult + data);
//        });
        binding.btnLogin.setOnClickListener(v -> {
        login(binding.edtId.getText().toString(), binding.edtPw.getText().toString());


        });
        naverlogin();
        binding.imgvKakaoLogin.setOnClickListener(v -> {
            kakaologin(this);
        });
        //집에서실행하면 해쉬키가 다름

    }

    //네이버는 email제공 -> database social,id(email)
    public void naverlogin(){
        binding.buttonOAuthLoginImg.setOAuthLogin(new OAuthLoginCallback() {
            @Override
            public void onSuccess() {
                Log.d("네이버", "onSuccess: " + NaverIdLoginSDK.INSTANCE.getAccessToken());
                new NidOAuthLogin().callProfileApi(new NidProfileCallback<NidProfileResponse>() {
                    @Override
                    public void onSuccess(NidProfileResponse nidProfileResponse) {
                        //social (key) 네이버 아이디 .. 카카오톡 아이디 등등
                        //id (key) <- naver,kakao...

                        login(nidProfileResponse.getProfile().getEmail() , null);

                        Log.d("네이버", "onSuccess: " + nidProfileResponse.getProfile().getEmail());
                        Log.d("네이버", "onSuccess: " + nidProfileResponse.getProfile().getMobile());
                        Log.d("네이버", "onSuccess: " + nidProfileResponse.getProfile().getName());
                        Log.d("네이버", "onSuccess: " + nidProfileResponse.getProfile().getNickname());
                        Log.d("네이버", "onSuccess: " + nidProfileResponse.getProfile().getProfileImage());
                    }

                    @Override
                    public void onFailure(int i, @NonNull String s) {

                    }

                    @Override
                    public void onError(int i, @NonNull String s) {

                    }
                });
            }

            @Override
            public void onFailure(int i, @NonNull String s) {

            }

            @Override
            public void onError(int i, @NonNull String s) {

            }
        });


    }
    private void getHashKey(){
        PackageInfo packageInfo = null;
        try {
            packageInfo = getPackageManager().getPackageInfo(getPackageName(), PackageManager.GET_SIGNATURES);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        if (packageInfo == null)
            Log.e("KeyHash", "KeyHash:null");

        for (Signature signature : packageInfo.signatures) {
            try {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                Log.d("KeyHash", Base64.encodeToString(md.digest(), Base64.DEFAULT));
            } catch (NoSuchAlgorithmException e) {
                Log.e("KeyHash", "Unable to get MessageDigest. signature=" + signature, e);
            }
        }
    }

    //kakao는 key값을 우리에게 제공 x (email, mobile)
    public  void kakaologin(Context context){
        KakaoSdk.INSTANCE.init(this,"e4890a85af87e317af863f3a45ed81d2");
        //카카오톡 설치여부. true-> 설치가 되었으면 앱으로 인증(권장)
        //                 false-> 웹뷰(크롬)을 이용해서 인증
        Function2<OAuthToken, Throwable, Unit> callback = new Function2<OAuthToken, Throwable, Unit>() {
            @Override
            public Unit invoke(OAuthToken oAuthToken, Throwable error) {
                if(error == null){
                    //로그인 성공
                    Log.d("카카오", "invoke: " + oAuthToken.getAccessToken());
                    UserApiClient.getInstance().me( (user, throwable) -> {
                     if(throwable == null){
                         Log.d("카카오", "invoke(정보) : " + user.getKakaoAccount().getProfile().getNickname());
                         Log.d("카카오", "invoke(정보) : " + user.getKakaoAccount().getProfile().getProfileImageUrl());
                     }else{
                         Log.d("카카오", "invoke(오류): " + throwable.getMessage());
                     }


                        return null;
                    });
                }else {
                    //로그인 실패
                    Log.d("카카오", "invoke: " + error.getMessage());
                }
                return null;
            }
        };


        if(UserApiClient.getInstance().isKakaoTalkLoginAvailable(this)){
            Log.d("카카오", "kakaologin: 카카오톡이 설치 되어 있음.");
            UserApiClient.getInstance().loginWithKakaoTalk(context, callback );
        }else{
            Log.d("카카오", "kakaologin: 카카오톡이 설치 안되어 있음.");
            UserApiClient.getInstance().loginWithKakaoAccount(context, callback );
        }
    }

    public void login(String user_id , String user_pw){
        CommonConn conn = new CommonConn(this , "login.me");
        conn.addParamMap("user_id" , user_id);
        if(user_pw==null){
            conn.addParamMap("social" , "y");
        }else{
            conn.addParamMap("user_pw" , user_pw);
        }

        conn.onExcute((isResult, data) -> { //전송처리
            Log.d("로그인", "onCreate: " + data); //data
            MemberVO vo = new Gson().fromJson(data, MemberVO.class);
            if (vo ==null){
                Toast.makeText(this, "아이디 또는 패스워드 틀림", Toast.LENGTH_SHORT).show();
                return;
            }
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
//                finish(); //로그인->Main (뒤로가기 눌렀을때 다시 로그인 화면이 나옴)
        });
    }
}