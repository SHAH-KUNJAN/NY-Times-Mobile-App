package com.example.nytimesmobileapp.Model;

import com.google.gson.annotations.SerializedName;

public class BestSellersNamesResult {

    @SerializedName("display_name")
    private String displayName;

    @SerializedName("list_name")
    private String listName;

    @SerializedName("list_name_encoded")
    private String listNameEncoded;

    @SerializedName("newest_published_date")
    private String newestPublishedDate;

    @SerializedName("oldest_published_date")
    private String oldestPublishedDate;

    @SerializedName("updated")
    private String updated;

    public String getDisplayName() {
        return displayName;
    }

    public String getListName() {
        return listName;
    }

    public String getListNameEncoded() {
        return listNameEncoded;
    }

    public String getNewestPublishedDate() {
        return newestPublishedDate;
    }

    public String getOldestPublishedDate() {
        return oldestPublishedDate;
    }

    public String getUpdated() {
        return updated;
    }
}
