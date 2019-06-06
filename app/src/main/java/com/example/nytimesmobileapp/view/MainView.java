package com.example.nytimesmobileapp.view;

import com.example.nytimesmobileapp.model.TopBooksResponse;

public interface MainView {

    void showProgress();
    void hideProgress();
    void setData(TopBooksResponse mTopBooksResponse);
    void onFailure(String message);
}
