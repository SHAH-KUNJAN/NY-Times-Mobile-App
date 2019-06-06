package com.example.nytimesmobileapp.intractor;

import com.example.nytimesmobileapp.Constants;
import com.example.nytimesmobileapp.model.TopBooksResponse;
import com.example.nytimesmobileapp.network.ApiClient;
import com.example.nytimesmobileapp.network.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainIntractorClass implements MainIntractor {
    private ApiInterface mApiInterface;

    @Override
    public void getMainIntractor(String publishedDate, final OnMainIntractorListener callback) {
        mApiInterface = ApiClient.getClient().create(ApiInterface.class);
        mApiInterface.getTopBooks(Constants.apiKey, publishedDate).enqueue(new Callback<TopBooksResponse>() {
            @Override
            public void onResponse(Call<TopBooksResponse> call, Response<TopBooksResponse> response) {
                if (response.code() == 429) {
                    callback.onFailure("Too many requests. You reached your per minute or per day rate limit");
                } else if (response.code() == 401) {
                    callback.onFailure("Unauthorized request. Make sure api-key is set.");
                } else {
                    callback.onFinished(response.body());
                }
            }

            @Override
            public void onFailure(Call<TopBooksResponse> call, Throwable t) {
                callback.onFailure(t.getMessage());
            }
        });
    }
}
