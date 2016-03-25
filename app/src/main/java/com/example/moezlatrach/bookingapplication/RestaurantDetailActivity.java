package com.example.moezlatrach.bookingapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.moezlatrach.bookingapplication.models.Restaurant;
import com.example.moezlatrach.bookingapplication.utils.RestaurantContent;

public class RestaurantDetailActivity extends AppCompatActivity {

    ImageView imgRestaurant;
    TextView tvNameRestaurant,tvAdrRestaurant;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        imgRestaurant=(ImageView)findViewById(R.id.imgRestauBig);
        tvNameRestaurant=(TextView)findViewById(R.id.tv_restau_detail_name);
        tvAdrRestaurant=(TextView)findViewById(R.id.tv_restau_detail_adresse);


        Bundle bundle = getIntent().getExtras();
        if(bundle!= null)
        {
            Restaurant restaurant=bundle.getParcelable(MainActivity.Key_POSITION);
            tvNameRestaurant.setText(restaurant.getNom());
            tvAdrRestaurant.setText(restaurant.getAdresse());
            imgRestaurant.setBackgroundResource(restaurant.getImg());

        }
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

}
