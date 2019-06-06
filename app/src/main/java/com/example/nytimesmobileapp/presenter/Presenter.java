package com.example.nytimesmobileapp.presenter;

public interface Presenter {
    void onDestroy();
    void onRefreshButtonClick();
    void getData();
}
