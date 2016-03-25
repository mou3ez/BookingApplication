package com.example.moezlatrach.bookingapplication.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by moez latrach on 23/03/2016.
 */
public abstract class  Local implements Parcelable {
    protected String nom;
    protected String adresse;
    protected int img;

    public Local() {
    }

    public Local(String nom, String adresse, int img) {
        this.nom = nom;
        this.adresse = adresse;
        this.img = img;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getImg() {
        return img;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setImg(int img) {
        this.img = img;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nom);
        dest.writeString(adresse);
        dest.writeInt(img);
    }
    protected Local(Parcel in)
    {
        nom= in.readString();
        adresse=in.readString();
        img=in.readInt();
    }
    @Override
    public int describeContents() {
        return 0;
    }
}
