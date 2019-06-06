package com.example.nytimesmobileapp.intractor;

import com.example.nytimesmobileapp.model.TopBooksResponse;

public interface MainIntractor {

    interface OnMainIntractorListener {
        void onFinished(TopBooksResponse mTopBooksResponse);

        void onFailure(String message);
    }

    void getMainIntractor(String publishedDate, OnMainIntractorListener callback);
}
