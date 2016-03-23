package com.example.moezlatrach.bookingapplication.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.moezlatrach.bookingapplication.models.Restaurant;
import com.example.moezlatrach.bookingapplication.R;

import java.util.List;

/**
 * Created by moez latrach on 23/03/2016.
 */
public class RestauAdapter extends ArrayAdapter<Restaurant> {
    Context context;
    int ressource;
    public RestauAdapter(Context context, int resource, List<Restaurant> restaurants) {
        super(context, resource, restaurants);
        this.context=context;
        this.ressource=resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(ressource,parent,false);
        TextView tvAdresse = (TextView) view.findViewById(R.id.tv_restau_adresse);
        ImageView imgResatu = (ImageView) view.findViewById(R.id.img_restau);
        TextView tvName = (TextView) view.findViewById(R.id.tv_restau_name);

        tvName.setText(getItem(position).getNom());
        tvAdresse.setText(getItem(position).getAdresse());
        imgResatu.setBackgroundResource(getItem(position).getImageRes());


        return view;
    }
}
