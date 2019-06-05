package com.example.nytimesmobileapp.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nytimesmobileapp.Adapter.MainAdapter;
import com.example.nytimesmobileapp.Intractor.MainIntractorClass;
import com.example.nytimesmobileapp.Model.TopBooksResponse;
import com.example.nytimesmobileapp.Presenter.MainPresenter;
import com.example.nytimesmobileapp.Presenter.presenter;
import com.example.nytimesmobileapp.R;

public class MainActivity extends AppCompatActivity implements MainView {
    private ProgressBar mProgressBar;
    private RecyclerView mRecyclerView;
    private presenter mPresenter;
    private TextView mCopyRights;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*  Toolbar mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);*/
        mCopyRights = findViewById(R.id.copyright);
        mProgressBar = findViewById(R.id.progressBar);
        mRecyclerView = findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // publishDate =  null means current otherwise you can pass the date.
        mPresenter = new MainPresenter(this, new MainIntractorClass(), "");
        mPresenter.getData();
    }

    @Override
    public void showProgress() {
        mProgressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        mProgressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void setData(TopBooksResponse mTopBooksResponse) {
        mCopyRights.setText(mTopBooksResponse.getCopyright());
        MainAdapter mMainAdapter = new MainAdapter(mTopBooksResponse.getResults().getLists());
        mRecyclerView.setAdapter(mMainAdapter);
    }

    @Override
    public void onFailure(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.refresh_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_refresh)
            mPresenter.onRefreshButtonClick();
        return super.onOptionsItemSelected(item);
    }
}
