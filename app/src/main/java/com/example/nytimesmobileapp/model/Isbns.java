package com.example.nytimesmobileapp.model;

import com.google.gson.annotations.SerializedName;

public class Isbns {

    @SerializedName("isbn10")
    private String isbn10;

    @SerializedName("isbn13")
    private String isbn13;

    public String getIsbn10() {
        return isbn10;
    }

    public String getIsbn13() {
        return isbn13;
    }
}
