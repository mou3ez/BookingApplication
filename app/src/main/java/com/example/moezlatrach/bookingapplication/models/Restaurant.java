package com.example.moezlatrach.bookingapplication.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by moez latrach on 23/03/2016.
 */
public class Restaurant extends Local {

    public Restaurant(String nom, String adresse, int img) {
        super(nom, adresse, img);
    }

    public static final Parcelable.Creator<Restaurant> CREATOR = new Restaurant.Creator<Restaurant>() {

        @Override
        public Restaurant createFromParcel(Parcel source) {
            return new Restaurant(source);
        }

        @Override
        public Restaurant[] newArray(int size) {
            return new Restaurant[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
    }

    private Restaurant(Parcel in) {
        super(in);
    }
}
