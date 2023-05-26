package com.example.presle_fsinotes;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiBilan {

    @GET("apiBilan")
    Call<Bilan> getbilan(@Query("id") Integer id);



}
