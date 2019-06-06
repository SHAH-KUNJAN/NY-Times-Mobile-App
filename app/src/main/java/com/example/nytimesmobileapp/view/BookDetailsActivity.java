package com.example.nytimesmobileapp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nytimesmobileapp.R;
import com.example.nytimesmobileapp.model.TopBooks;
import com.squareup.picasso.Picasso;

public class BookDetailsActivity extends AppCompatActivity {

    private ImageView mBookImg;
    private TextView mTitle, mAuthor, mRank, mPrice, mDescription;
    private TopBooks mTopBooks;

    public static final String BOOK_EXTRA_DETAILS = "book_extra_details";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);

        mBookImg = findViewById(R.id.bookDetailImg);
        mTitle = findViewById(R.id.bookDetailTitle);
        mAuthor = findViewById(R.id.bookDetailauthor);
        mRank = findViewById(R.id.bookDetailrank);
        mPrice = findViewById(R.id.bookDetailprice);
        mDescription = findViewById(R.id.bookDetaildescription);

        mTopBooks = getIntent().getParcelableExtra(BOOK_EXTRA_DETAILS);

        mRank.setText(String.valueOf(mTopBooks.getRank()));
        mPrice.setText(String.valueOf(mTopBooks.getPrice()));
        if (mTopBooks.getBookImage() != null && !mTopBooks.getBookImage().isEmpty()) {
            Picasso.get().load(mTopBooks.getBookImage()).into(mBookImg);
        }

        if (mTopBooks.getTitle() != null && !mTopBooks.getTitle().isEmpty()) {
            mTitle.setText(mTopBooks.getTitle());
        }
        if (mTopBooks.getAuthor() != null && !mTopBooks.getAuthor().isEmpty()) {
            mAuthor.setText(mTopBooks.getAuthor());
        }
        if (mTopBooks.getDescription() != null && !mTopBooks.getDescription().isEmpty()) {
            mDescription.setText(mTopBooks.getDescription());
        }
    }
}
