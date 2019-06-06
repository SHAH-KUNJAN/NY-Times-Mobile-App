package com.example.nytimesmobileapp.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nytimesmobileapp.intractor.ItemClickListener;
import com.example.nytimesmobileapp.model.TopBooksResultList;
import com.example.nytimesmobileapp.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    private List<TopBooksResultList> mList;
    private ItemClickListener mItemClickListener;

    public MainAdapter(List<TopBooksResultList> lists, ItemClickListener mItemClickListener) {
        this.mList = lists;
        this.mItemClickListener = mItemClickListener;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_main_card, viewGroup, false);
        return new MainViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int i) {
        final TopBooksResultList mTopBook = mList.get(i);
        if (mTopBook.getListImage() != null && !mTopBook.getListImage().isEmpty()) {
            Picasso.get().load(mTopBook.getListImage()).into(holder.mBookImg);
        }
        if (mTopBook.getDisplayName() != null && !mTopBook.getDisplayName().isEmpty()) {
            holder.mListTitleName.setText(mTopBook.getDisplayName());
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mItemClickListener.onItemClick(mTopBook.getBooks());
            }
        });

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {

        private ImageView mBookImg;
        private TextView mListTitleName;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            mBookImg = itemView.findViewById(R.id.bookImg);
            mListTitleName = itemView.findViewById(R.id.List_Name);
        }
    }
}
