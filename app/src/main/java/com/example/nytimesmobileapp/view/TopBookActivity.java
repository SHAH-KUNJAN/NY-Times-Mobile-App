package com.example.nytimesmobileapp.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;

import com.example.nytimesmobileapp.adapter.TopBookAdapter;
import com.example.nytimesmobileapp.intractor.TopBookClickListener;
import com.example.nytimesmobileapp.model.TopBooks;
import com.example.nytimesmobileapp.R;
import com.nex3z.flowlayout.FlowLayout;

import java.util.ArrayList;

public class TopBookActivity extends AppCompatActivity {

    private ArrayList<TopBooks> mBooks = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private TopBookAdapter mTopBookAdapter;

    public static final String BOOK_EXTRA = "book_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_book);

        mBooks = getIntent().getParcelableArrayListExtra(BOOK_EXTRA);
        mRecyclerView = findViewById(R.id.topBookRecyclerview);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        mTopBookAdapter = new TopBookAdapter(mBooks, mTopBookClickListener);
        mTopBookAdapter.notifyDataSetChanged();
        mRecyclerView.setAdapter(mTopBookAdapter);
    }

    TopBookClickListener mTopBookClickListener = new TopBookClickListener() {
        @Override
        public void onClickListener(TopBooks mTopBooks) {
            Intent intent = new Intent(TopBookActivity.this, BookDetailsActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable(BookDetailsActivity.BOOK_EXTRA_DETAILS, mTopBooks);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    };

}
