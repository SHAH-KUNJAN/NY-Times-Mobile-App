package com.example.nytimesmobileapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BestSellersNames {

    @SerializedName("copyright")
    private String copyright;

    @SerializedName("num_results")
    private int numResults;

    @SerializedName("results")
    private List<BestSellersNamesResult> results;

    @SerializedName("status")
    private String status;

    public String getCopyright() {
        return copyright;
    }

    public int getNumResults() {
        return numResults;
    }

    public List<BestSellersNamesResult> getResults() {
        return results;
    }

    public String getStatus() {
        return status;
    }
}
