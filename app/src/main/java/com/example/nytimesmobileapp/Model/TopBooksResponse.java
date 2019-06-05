package com.example.nytimesmobileapp.Model;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TopBooksResponse {
    @SerializedName("copyright")
    private String copyright;

    @SerializedName("num_results")
    private int numResults;

    @SerializedName("results")
    private List<TopBooksResult> results;

    @SerializedName("status")
    private String status;

    public String getCopyright() {
        return copyright;
    }

    public int getNumResults() {
        return numResults;
    }

    public List<TopBooksResult> getResults() {
        return results;
    }

    public String getStatus() {
        return status;
    }
}
