package com.example.presle_fsinotes;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Api {


    @GET("testapi")
    Call<ArrayList<Etudiant>> getData();

    @GET("testapi")
    Call<Etudiant> getapi(@Query("id") int id);

    @FormUrlEncoded
    @POST("testapi.php")
    Call<Etudiant> connexion(@Field("login")String login,@Field("mdp")String mdp );
}
