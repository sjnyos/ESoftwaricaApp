package com.machamasisuraj.esoftwaricaapp.api;

import android.content.Context;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitApiCaller  {
    private  String baseUrl;
    private Context mContext;

    public RetrofitApiCaller(String baseUrl, Context mContext) {
        this.baseUrl = baseUrl;
        this.mContext = mContext;
    }
    public void GetEmployees(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://dummy.restapiexample.com/api/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();



    }


}
