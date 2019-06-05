package com.example.nytimesmobileapp.Intractor;

import com.example.nytimesmobileapp.Model.TopBooksResponse;

public interface MainIntractor {

    interface OnMainIntractorListener {
        void onFinished(TopBooksResponse mTopBooksResponse);

        void onFailure(String message);
    }

    void getMainIntractor(String publishedDate, OnMainIntractorListener callback);
}
