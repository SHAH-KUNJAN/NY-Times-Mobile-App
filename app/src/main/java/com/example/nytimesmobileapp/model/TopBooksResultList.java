package com.example.nytimesmobileapp.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;


public class TopBooksResultList implements Parcelable {

    @SerializedName("display_name")
    private String displayName;

    @SerializedName("list_id")
    private int listId;

    @SerializedName("list_image")
    private String listImage;

    @SerializedName("list_name")
    private String listName;

    @SerializedName("updated")
    private String updated;

    @SerializedName("books")
    private ArrayList<TopBooks> books;

    protected TopBooksResultList(Parcel in) {
        displayName = in.readString();
        listId = in.readInt();
        listImage = in.readString();
        listName = in.readString();
        updated = in.readString();
        books = in.createTypedArrayList(TopBooks.CREATOR);
    }

    public static final Creator<TopBooksResultList> CREATOR = new Creator<TopBooksResultList>() {
        @Override
        public TopBooksResultList createFromParcel(Parcel in) {
            return new TopBooksResultList(in);
        }

        @Override
        public TopBooksResultList[] newArray(int size) {
            return new TopBooksResultList[size];
        }
    };

    public String getDisplayName() {
        return displayName;
    }

    public int getListId() {
        return listId;
    }

    public String getListImage() {
        return listImage;
    }

    public String getListName() {
        return listName;
    }

    public String getUpdated() {
        return updated;
    }

    public ArrayList<TopBooks> getBooks() {
        return books;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(displayName);
        parcel.writeInt(listId);
        parcel.writeString(listImage);
        parcel.writeString(listName);
        parcel.writeString(updated);
        parcel.writeTypedList(books);
    }
}
