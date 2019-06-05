package com.example.nytimesmobileapp.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class TopBooksResultList {

    @SerializedName("display_name")
    private String displayName;

    @SerializedName("list_id")
    private int listId;

    @SerializedName("list_image")
    private String listImage;

    @SerializedName("list_name")
    private String listName;

    @SerializedName("updated")
    private String updated;

    @SerializedName("books")
    private List<TopBooks> books;

    public String getDisplayName() {
        return displayName;
    }

    public int getListId() {
        return listId;
    }

    public String getListImage() {
        return listImage;
    }

    public String getListName() {
        return listName;
    }

    public String getUpdated() {
        return updated;
    }

    public List<TopBooks> getBooks() {
        return books;
    }
}
