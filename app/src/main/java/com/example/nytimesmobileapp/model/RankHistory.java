package com.example.nytimesmobileapp.model;

import com.google.gson.annotations.SerializedName;

public class RankHistory {

    @SerializedName("primary_isbn10")
    private String primaryIsbn10;

    @SerializedName("primary_isbn13")
    private String primaryIsbn13;

    @SerializedName("asterisk")
    private int asterisk;

    @SerializedName("dagger")
    private int dagger;

    @SerializedName("weeks_on_list")
    private int weeksOnList;

    @SerializedName("rank_last_week")
    private int rankLastWeek;

    @SerializedName("rank")
    private int rank;

    @SerializedName("published_date")
    private String publishedDate;

    @SerializedName("bestsellers_date")
    private String bestsellersDate;

    @SerializedName("display_name")
    private String displayName;

    @SerializedName("list_name")
    private String listName;

    public String getPrimaryIsbn10() {
        return primaryIsbn10;
    }

    public String getPrimaryIsbn13() {
        return primaryIsbn13;
    }

    public int getAsterisk() {
        return asterisk;
    }

    public int getDagger() {
        return dagger;
    }

    public int getWeeksOnList() {
        return weeksOnList;
    }

    public int getRankLastWeek() {
        return rankLastWeek;
    }

    public int getRank() {
        return rank;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public String getBestsellersDate() {
        return bestsellersDate;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getListName() {
        return listName;
    }
}
