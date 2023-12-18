package com.example.project02_last.common;

import java.util.HashMap;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface CommonService {

    @FormUrlEncoded
    @POST
    Call<String> clientPostMethod(@Url String url, @FieldMap HashMap<String , Object> params);

    @GET("{mapping}")
    Call<String> clientGetMethod(@Path("mapping") String url , @QueryMap HashMap<String , Object> params);

    @Multipart //파일이 전송 될때 필요한 어노테이션(파일이 잇음 -> 멀티파트 포함)
    @POST
    Call<String> clientSendFile(@Url String url , @PartMap HashMap<String, RequestBody> maps , @Part MultipartBody.Part file);//파트맵 필요
                                                                                                //PartMap (HashMap<Stiring, MultiPartBody.part> fileMap) //여러 파일 보낼때
}
