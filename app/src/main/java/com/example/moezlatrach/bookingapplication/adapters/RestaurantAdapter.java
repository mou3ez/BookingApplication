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
public class RestaurantAdapter extends ArrayAdapter<Restaurant> {
    Context context;
    int resource;

    public RestaurantAdapter(Context context, int resource, List<Restaurant> restaurants) {
        super(context, resource, restaurants);
        this.context = context;
        this.resource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        RestaurantHolder holder = new RestaurantHolder();
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(resource, parent, false);

            holder.tvName = (TextView) view.findViewById(R.id.tv_restau_name);
            holder.tvAdresse = (TextView) view.findViewById(R.id.tv_restau_adresse);
            holder.imgRestau = (ImageView) view.findViewById(R.id.img_restau);
            view.setTag(holder);
        }
        else {
            holder= (RestaurantHolder)view.getTag();
        }
        holder.tvName.setText(getItem(position).getNom());
        holder.tvAdresse.setText(getItem(position).getAdresse());
        holder.imgRestau.setBackgroundResource(getItem(position).getImg());

        return view;
    }

    class RestaurantHolder {
        TextView tvAdresse;
        ImageView imgRestau;
        TextView tvName;
    }
}
