package com.example.nytimesmobileapp.network;

import com.example.nytimesmobileapp.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static Retrofit mretrofit;

    public static Retrofit getClient() {
        if (mretrofit == null) {
            mretrofit = new Retrofit.Builder()
                    .baseUrl(Constants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return mretrofit;
    }
}
