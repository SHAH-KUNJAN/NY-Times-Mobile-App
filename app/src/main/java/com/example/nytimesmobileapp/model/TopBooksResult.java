package com.example.nytimesmobileapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TopBooksResult {

    @SerializedName("bestsellers_date")
    private String bestsellersDate;

    @SerializedName("published_date")
    private String publishedDate;

    @SerializedName("lists")
    private List<TopBooksResultList> lists;

    public String getBestsellersDate() {
        return bestsellersDate;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public List<TopBooksResultList> getLists() {
        return lists;
    }
}
