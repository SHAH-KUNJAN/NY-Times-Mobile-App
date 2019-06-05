package com.example.nytimesmobileapp.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BestSellersList {
    @SerializedName("status")
    private String status;

    @SerializedName("copyright")
    private String copyright;

    @SerializedName("num_results")
    private int numResults;

    @SerializedName("last_modified")
    private String lastModified;

    @SerializedName("results")
    private List<BestSellersListResults> results;

    public String getStatus() {
        return status;
    }

    public String getCopyright() {
        return copyright;
    }

    public int getNumResults() {
        return numResults;
    }

    public String getLastModified() {
        return lastModified;
    }

    public List<BestSellersListResults> getResults() {
        return results;
    }
}
