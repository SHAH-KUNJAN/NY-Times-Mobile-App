package com.example.nytimesmobileapp.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class TopBooks implements Parcelable {

    @SerializedName("age_group")
    private String ageGroup;

    @SerializedName("author")
    private String author;

    @SerializedName("contributor")
    private String contributor;

    @SerializedName("contributor_note")
    private String contributor_note;

    @SerializedName("created_date")
    private String createdDate;

    @SerializedName("description")
    private String description;

    @SerializedName("price")
    private float price;

    @SerializedName("primary_isbn10")
    private String primaryIsbn10;

    @SerializedName("primary_isbn13")
    private String primaryIsbn13;

    @SerializedName("publisher")
    private String publisher;

    @SerializedName("title")
    private String title;

    @SerializedName("rank")
    private int rank;

    @SerializedName("updated_date")
    private String updatedDate;

    @SerializedName("book_image")
    private String bookImage;

    protected TopBooks(Parcel in) {
        ageGroup = in.readString();
        author = in.readString();
        contributor = in.readString();
        contributor_note = in.readString();
        createdDate = in.readString();
        description = in.readString();
        price = in.readFloat();
        primaryIsbn10 = in.readString();
        primaryIsbn13 = in.readString();
        publisher = in.readString();
        title = in.readString();
        rank = in.readInt();
        updatedDate = in.readString();
        bookImage = in.readString();
    }

    public static final Creator<TopBooks> CREATOR = new Creator<TopBooks>() {
        @Override
        public TopBooks createFromParcel(Parcel in) {
            return new TopBooks(in);
        }

        @Override
        public TopBooks[] newArray(int size) {
            return new TopBooks[size];
        }
    };

    public String getAgeGroup() {
        return ageGroup;
    }

    public String getAuthor() {
        return author;
    }

    public String getContributor() {
        return contributor;
    }

    public String getContributor_note() {
        return contributor_note;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }

    public String getPrimaryIsbn10() {
        return primaryIsbn10;
    }

    public String getPrimaryIsbn13() {
        return primaryIsbn13;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getTitle() {
        return title;
    }

    public int getRank() {
        return rank;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public String getBookImage() {
        return bookImage;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(ageGroup);
        parcel.writeString(author);
        parcel.writeString(contributor);
        parcel.writeString(contributor_note);
        parcel.writeString(createdDate);
        parcel.writeString(description);
        parcel.writeFloat(price);
        parcel.writeString(primaryIsbn10);
        parcel.writeString(primaryIsbn13);
        parcel.writeString(publisher);
        parcel.writeString(title);
        parcel.writeInt(rank);
        parcel.writeString(updatedDate);
        parcel.writeString(bookImage);
    }
}
