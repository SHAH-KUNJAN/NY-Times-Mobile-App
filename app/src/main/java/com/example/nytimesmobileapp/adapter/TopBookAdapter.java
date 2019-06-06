package com.example.nytimesmobileapp.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nytimesmobileapp.R;
import com.example.nytimesmobileapp.intractor.TopBookClickListener;
import com.example.nytimesmobileapp.model.TopBooks;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class TopBookAdapter extends RecyclerView.Adapter<TopBookAdapter.TopBookViewHolder> {

    private TopBookClickListener mTopBookClickListener;
    private ArrayList<TopBooks> mBooks;

    public TopBookAdapter(ArrayList<TopBooks> mBooks, TopBookClickListener mTopBookClickListener) {
        this.mBooks = mBooks;
        this.mTopBookClickListener = mTopBookClickListener;
    }

    @NonNull
    @Override
    public TopBookViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_top_book_card, viewGroup, false);
        return new TopBookViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull TopBookViewHolder holder, int i) {
        final TopBooks mTopBooks = mBooks.get(i);
        if (mTopBooks.getTitle() != null && !mTopBooks.getTitle().isEmpty()) {
            holder.mTopBookName.setText(mTopBooks.getTitle());
        }
        if (mTopBooks.getBookImage() != null && !mTopBooks.getBookImage().isEmpty()) {
            Picasso.get().load(mTopBooks.getBookImage()).into(holder.mTopBookImg);
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTopBookClickListener.onClickListener(mTopBooks);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mBooks.size();
    }

    public class TopBookViewHolder extends RecyclerView.ViewHolder {

        private ImageView mTopBookImg;
        private TextView mTopBookName;

        public TopBookViewHolder(@NonNull View itemView) {
            super(itemView);
            mTopBookImg = itemView.findViewById(R.id.topBookImg);
            mTopBookName = itemView.findViewById(R.id.topBookName);
        }
    }


}
