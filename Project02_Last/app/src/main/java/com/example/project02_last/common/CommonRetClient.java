package com.example.project02_last.common;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class CommonRetClient {
    public static Retrofit getRetrofit(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://192.168.0.49/mid/").addConverterFactory(ScalarsConverterFactory.create()).build();
        return retrofit;
    }
}
