package com.example.app_nupan.network;

import com.example.app_nupan.data.JoinData;
import com.example.app_nupan.data.JoinResponse;
import com.example.app_nupan.data.LoginData;
import com.example.app_nupan.data.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ServiceApi {

    @POST("/user/login")
    Call<LoginResponse> userLogin(@Body LoginData data);

    @POST("/user/join")
    Call<JoinResponse> userJoin(@Body JoinData data);

//    @POST("/user/find-id")
//    Call<FindIdResponse> findUserId(@Body FindIdData data);


}
