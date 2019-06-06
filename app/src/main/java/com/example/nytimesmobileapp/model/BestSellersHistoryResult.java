package com.example.nytimesmobileapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BestSellersHistoryResult {

    @SerializedName("age_group")
    private String ageGroup;

    @SerializedName("author")
    private String author;

    @SerializedName("contributor")
    private String contributor;

    @SerializedName("contributor_note")
    private String contributor_note;

    @SerializedName("description")
    private String description;

    @SerializedName("price")
    private int price;

    @SerializedName("publisher")
    private String publisher;

    @SerializedName("title")
    private String title;

    @SerializedName("isbns")
    private List<Isbns> isbns;

    @SerializedName("reviews")
    private List<BestSellersHistoryResultReviews> reviews;

    @SerializedName("ranks_history")
    private List<RankHistory> ranksHistory;

    public String getAgeGroup() {
        return ageGroup;
    }

    public String getAuthor() {
        return author;
    }

    public String getContributor() {
        return contributor;
    }

    public String getContributor_note() {
        return contributor_note;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getTitle() {
        return title;
    }

    public List<Isbns> getIsbns() {
        return isbns;
    }

    public List<BestSellersHistoryResultReviews> getReviews() {
        return reviews;
    }

    public List<RankHistory> getRanksHistory() {
        return ranksHistory;
    }
}
