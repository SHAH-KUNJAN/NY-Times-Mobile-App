package com.example.nytimesmobileapp.Model;

import com.google.gson.annotations.SerializedName;

public class TopBooks {

    @SerializedName("age_group")
    private String ageGroup;

    @SerializedName("author")
    private String author;

    @SerializedName("contributor")
    private String contributor;

    @SerializedName("contributor_note")
    private String contributor_note;

    @SerializedName("created_date")
    private String createdDate;

    @SerializedName("description")
    private String description;

    @SerializedName("price")
    private int price;

    @SerializedName("primary_isbn10")
    private String primaryIsbn10;

    @SerializedName("primary_isbn13")
    private String primaryIsbn13;

    @SerializedName("publisher")
    private String publisher;

    @SerializedName("title")
    private String title;

    @SerializedName("rank")
    private int rank;

    @SerializedName("updated_date")
    private String updatedDate;

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

    public String getCreatedDate() {
        return createdDate;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public String getPrimaryIsbn10() {
        return primaryIsbn10;
    }

    public String getPrimaryIsbn13() {
        return primaryIsbn13;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getTitle() {
        return title;
    }

    public int getRank() {
        return rank;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }
}
