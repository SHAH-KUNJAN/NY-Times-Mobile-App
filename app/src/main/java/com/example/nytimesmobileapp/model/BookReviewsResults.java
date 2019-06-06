package com.example.nytimesmobileapp.model;

import com.google.gson.annotations.SerializedName;

public class BookReviewsResults {

    @SerializedName("book_author")
    private String bookAuthor;

    @SerializedName("book_title")
    private String bookTitle;

    @SerializedName("byline")
    private String byline;

    @SerializedName("isbn13")
    private String[] isbn13;

    @SerializedName("publication_dt")
    private String publication_dt;

    @SerializedName("summary")
    private String summary;

    @SerializedName("url")
    private String url;

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getByline() {
        return byline;
    }

    public String[] getIsbn13() {
        return isbn13;
    }

    public String getPublication_dt() {
        return publication_dt;
    }

    public String getSummary() {
        return summary;
    }

    public String getUrl() {
        return url;
    }
}
