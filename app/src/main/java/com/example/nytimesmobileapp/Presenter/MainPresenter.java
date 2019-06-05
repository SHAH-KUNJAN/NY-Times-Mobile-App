package com.example.nytimesmobileapp.Presenter;

import com.example.nytimesmobileapp.Intractor.MainIntractor;
import com.example.nytimesmobileapp.Model.TopBooksResponse;
import com.example.nytimesmobileapp.View.MainView;

public class MainPresenter implements presenter, MainIntractor.OnMainIntractorListener {

    private MainView mMainView;
    private MainIntractor mMainIntractor;
    private String mPublishedDate;

    public MainPresenter(MainView mMainView, MainIntractor mMainIntractor, String publishedDate) {
        this.mMainView = mMainView;
        this.mMainIntractor = mMainIntractor;
        this.mPublishedDate = publishedDate;
    }

    @Override
    public void onDestroy() {
        mMainView = null;
    }

    @Override
    public void onRefreshButtonClick() {
        if (mMainView != null) {
            mMainView.showProgress();
        }
        mMainIntractor.getMainIntractor(mPublishedDate, this);
    }

    @Override
    public void getData() {
        mMainIntractor.getMainIntractor(mPublishedDate, this);
    }

    @Override
    public void onFinished(TopBooksResponse mTopBooksResponse) {
        if (mMainView != null) {
            mMainView.setData(mTopBooksResponse);
            mMainView.hideProgress();
        }

    }

    @Override
    public void onFailure(String message) {
        if (mMainView != null) {
            mMainView.onFailure(message);
            mMainView.hideProgress();
        }

    }
}
