package com.example.nytimesmobileapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BestSellersListResults {

    @SerializedName("amazon_product_url")
    private String amazonProductUrl;

    @SerializedName("asterisk")
    private int asterisk;

    @SerializedName("bestsellers_date")
    private String bestsellersDate;

    @SerializedName("book_details")
    private List<BookDetails> bookDetails;

    @SerializedName("dagger")
    private int dagger;

    @SerializedName("display_name")
    private String displayName;

    @SerializedName("isbns")
    private List<Isbns> isbns;

    @SerializedName("list_name")
    private String listName;

    @SerializedName("published_date")
    private String publishedDate;

    @SerializedName("rank")
    private int rank;

    @SerializedName("rank_last_week")
    private int rankLastWeek;

    @SerializedName("reviews")
    private List<Reviews> reviews;

    @SerializedName("weeks_on_list")
    private int weeksOnList;

    public String getAmazonProductUrl() {
        return amazonProductUrl;
    }

    public int getAsterisk() {
        return asterisk;
    }

    public String getBestsellersDate() {
        return bestsellersDate;
    }

    public List<BookDetails> getBookDetails() {
        return bookDetails;
    }

    public int getDagger() {
        return dagger;
    }

    public String getDisplayName() {
        return displayName;
    }

    public List<Isbns> getIsbns() {
        return isbns;
    }

    public String getListName() {
        return listName;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public int getRank() {
        return rank;
    }

    public int getRankLastWeek() {
        return rankLastWeek;
    }

    public List<Reviews> getReviews() {
        return reviews;
    }

    public int getWeeksOnList() {
        return weeksOnList;
    }
}
