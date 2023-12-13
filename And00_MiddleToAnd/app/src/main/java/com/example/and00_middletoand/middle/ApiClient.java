package com.example.and00_middletoand.middle;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class ApiClient {

    public static Retrofit getApiClient(){

        Retrofit retrofit = new Retrofit.Builder()  //Retrofit.Builer 로 초기화 시켜야함 (Retrofit)
        .baseUrl("http://192.168.0.49/mid/") //내 톰캣에서 프로젝트까지 (index.html 또는 주소가 base)
                .addConverterFactory(ScalarsConverterFactory.create()) //String json 사용이 가능해짐
                .build();
        return retrofit;
    }
}
