package com.example.nytimesmobileapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BestSellersListByDateResults {

    @SerializedName("bestsellers_date")
    private String bestsellersDate;

    @SerializedName("books")
    private List<Books> books;

    @SerializedName("display_name")
    private String displayName;

    @SerializedName("list_name")
    private String listName;

    @SerializedName("normal_list_ends_at")
    private int normalListEndsAt;

    @SerializedName("published_date")
    private String publishedDate;

    @SerializedName("updated")
    private String updated;

    public String getBestsellersDate() {
        return bestsellersDate;
    }

    public List<Books> getBooks() {
        return books;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getListName() {
        return listName;
    }

    public int getNormalListEndsAt() {
        return normalListEndsAt;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public String getUpdated() {
        return updated;
    }
}
