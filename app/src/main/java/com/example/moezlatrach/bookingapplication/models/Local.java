package com.example.moezlatrach.bookingapplication.models;

/**
 * Created by moez latrach on 23/03/2016.
 */
public class Local {
    protected String nom;
    protected String adresse;
    private int imageRes;

    public Local() {
    }

    public Local(String nom, String adresse, int imageRes) {
        this.nom = nom;
        this.adresse = adresse;
        this.imageRes = imageRes;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getImageRes() {
        return imageRes;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setImageRes(int imageRes) {
        this.imageRes = imageRes;
    }
}
