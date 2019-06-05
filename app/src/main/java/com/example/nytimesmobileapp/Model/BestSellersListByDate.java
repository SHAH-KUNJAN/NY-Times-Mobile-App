package com.example.nytimesmobileapp.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BestSellersListByDate {

    @SerializedName("copyright")
    private String copyright;

    @SerializedName("num_results")
    private int numResults;

    @SerializedName("results")
    private List<BestSellersListByDateResults> results;

    @SerializedName("status")
    private String status;

    @SerializedName("last_modified")
    private String lastModified;

    public String getCopyright() {
        return copyright;
    }

    public int getNumResults() {
        return numResults;
    }

    public List<BestSellersListByDateResults> getResults() {
        return results;
    }

    public String getStatus() {
        return status;
    }

    public String getLastModified() {
        return lastModified;
    }
}
