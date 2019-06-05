package com.example.nytimesmobileapp.Retrofit;

import android.support.annotation.NonNull;

import com.example.nytimesmobileapp.Model.BestSellersHistory;
import com.example.nytimesmobileapp.Model.BestSellersList;
import com.example.nytimesmobileapp.Model.BestSellersListByDate;
import com.example.nytimesmobileapp.Model.BestSellersNames;
import com.example.nytimesmobileapp.Model.BookReviews;
import com.example.nytimesmobileapp.Model.TopBooksResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("lists.json")
    Call<BestSellersList> getBestSellersList(@Query("api-key") String apiKey, @Query("list") String list, @Query("bestsellers-date") String bestsellersDate, @Query("published-date") String publishedDate, @Query("offset") int offset);

    @GET("reviews.json")
    Call<BookReviews> getBookReviews(@Query("api-key") String apiKey, @Query("isbn") int isbn, @Query("title") String title, @Query("author") String author);

    @GET("lists/{date}/{list}.json")
    Call<BestSellersListByDate> getBestSellersListByDate(@Path("date") String date, @Path("list") String list, @Query("api-key") String apiKey, @Query("offset") int offset);

    @GET("lists/best-sellers/history.json")
    Call<BestSellersHistory> getBestSellersHistory(@Query("api-key") String apiKey, @Query("age-group") String ageGroup, @Query("author") String author, @Query("contributor") String contributor, @Query("isbn") String isbn, @Query("offset") int offset, @Query("price") String price, @Query("publisher") String publisher, @Query("title") String title);

    @GET("lists/names.json")
    Call<BestSellersNames> getBestSellersNames(@Query("api-key") String apiKey);

    @GET("lists/overview.json")
    Call<TopBooksResponse> getTopBooks(@Query("api-key") String apiKey, @Query("published-date") String publishedDate);



}
