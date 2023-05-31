package com.example.presle_fsinotes;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Controllerapi {

    private  static  final String baseurl="https://olen-ort.fr/P2023/SIO/PRESLE/projet-php2/src/view/";
    private  static Controllerapi controllerapi ;

    private  static Retrofit retrofit;


    public Controllerapi() {

         retrofit = new Retrofit.Builder().baseUrl(baseurl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


    }
    public static synchronized Controllerapi getInstance(){

        if (controllerapi== null){
            controllerapi = new Controllerapi();
        }
        return controllerapi;


    }
    public Api getapietu(){
        return retrofit.create(Api.class);

    }
    public ApiBilan bilan(){

        return retrofit.create(ApiBilan.class);
    }



}
