package com.example.nytimesmobileapp.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Books {

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

    @SerializedName("primary_isbn10")
    private String primaryIsbn10;

    @SerializedName("primary_isbn13")
    private String primaryIsbn13;

    @SerializedName("publisher")
    private String publisher;

    @SerializedName("title")
    private String title;

    @SerializedName("amazon_product_url")
    private String amazonProductUrl;

    @SerializedName("article_chapter_link")
    private String articleChapterLink;

    @SerializedName("asterisk")
    private int asterisk;

    @SerializedName("book_image")
    private String bookImage;

    @SerializedName("book_review_link")
    private String bookReviewLink;

    @SerializedName("dagger")
    private int dagger;

    @SerializedName("first_chapter_link")
    private String firstChapterLink;

    @SerializedName("isbns")
    private List<Isbns> isbns;

    @SerializedName("rank")
    private int rank;

    @SerializedName("rank_last_week")
    private int rankLastWeek;

    @SerializedName("sunday_review_link")
    private String sundayReviewLink;

    @SerializedName("weeks_on_list")
    private String weeksOnList;

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

    public String getAmazonProductUrl() {
        return amazonProductUrl;
    }

    public String getArticleChapterLink() {
        return articleChapterLink;
    }

    public int getAsterisk() {
        return asterisk;
    }

    public String getBookImage() {
        return bookImage;
    }

    public String getBookReviewLink() {
        return bookReviewLink;
    }

    public int getDagger() {
        return dagger;
    }

    public String getFirstChapterLink() {
        return firstChapterLink;
    }

    public List<Isbns> getIsbns() {
        return isbns;
    }

    public int getRank() {
        return rank;
    }

    public int getRankLastWeek() {
        return rankLastWeek;
    }

    public String getSundayReviewLink() {
        return sundayReviewLink;
    }

    public String getWeeksOnList() {
        return weeksOnList;
    }
}
