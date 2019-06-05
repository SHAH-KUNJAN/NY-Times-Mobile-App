package com.example.nytimesmobileapp.Retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static final String BASE_URL = "https://api.nytimes.com/svc/books/v3/";
    public static Retrofit mretrofit;

    public static Retrofit getClient() {
        if (mretrofit == null) {
            mretrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return mretrofit;
    }
}
