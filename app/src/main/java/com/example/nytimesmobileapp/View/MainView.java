package com.example.nytimesmobileapp.View;

import com.example.nytimesmobileapp.Model.TopBooksResponse;

public interface MainView {

    void showProgress();
    void hideProgress();
    void setData(TopBooksResponse mTopBooksResponse);
    void onFailure(String message);
}
