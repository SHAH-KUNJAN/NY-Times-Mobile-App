package com.example.nytimesmobileapp.model;


import com.google.gson.annotations.SerializedName;

public class TopBooksResponse {
    @SerializedName("copyright")
    private String copyright;

    @SerializedName("num_results")
    private int numResults;

    @SerializedName("results")
    private TopBooksResult results;

    @SerializedName("status")
    private String status;

    public String getCopyright() {
        return copyright;
    }

    public int getNumResults() {
        return numResults;
    }

    public TopBooksResult getResults() {
        return results;
    }

    public String getStatus() {
        return status;
    }
}
