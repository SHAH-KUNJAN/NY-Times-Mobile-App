package com.example.nytimesmobileapp.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nytimesmobileapp.adapter.MainAdapter;
import com.example.nytimesmobileapp.intractor.ItemClickListener;
import com.example.nytimesmobileapp.intractor.MainIntractorClass;
import com.example.nytimesmobileapp.model.TopBooks;
import com.example.nytimesmobileapp.model.TopBooksResponse;
import com.example.nytimesmobileapp.model.TopBooksResultList;
import com.example.nytimesmobileapp.presenter.MainPresenter;
import com.example.nytimesmobileapp.presenter.Presenter;
import com.example.nytimesmobileapp.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {
    private ProgressBar mProgressBar;
    private RecyclerView mRecyclerView;
    private Presenter mPresenter;
    private TextView mCopyRights;
    private MainAdapter mMainAdapter;
    private List<TopBooksResultList> mTopBooks = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCopyRights = findViewById(R.id.copyright);
        mProgressBar = findViewById(R.id.progressBar);
        mRecyclerView = findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mMainAdapter = new MainAdapter(mTopBooks, mItemClickListener);
        mRecyclerView.setAdapter(mMainAdapter);
        // publishDate =  null means current otherwise you can pass the date.
        mPresenter = new MainPresenter(this, new MainIntractorClass(), "");
        mPresenter.getData();
    }

    private ItemClickListener mItemClickListener = new ItemClickListener() {
        @Override
        public void onItemClick(ArrayList<TopBooks> topBooks) {
            Intent intent = new Intent(MainActivity.this, TopBookActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList(TopBookActivity.BOOK_EXTRA, topBooks);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    };

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
        mTopBooks.clear();
        mTopBooks.addAll(mTopBooksResponse.getResults().getLists());
        mMainAdapter.notifyDataSetChanged();
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
