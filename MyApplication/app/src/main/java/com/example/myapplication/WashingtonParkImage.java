package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class WashingtonParkImage extends AppCompatActivity {

    private ImageButton mapButton, bookmarkButton, tripButton, profileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_washington_park_image);

        mapButton = (ImageButton) findViewById(R.id.mapButton);
        bookmarkButton = (ImageButton) findViewById(R.id.bookmarkButton);
        tripButton = (ImageButton) findViewById(R.id.tripButton);
        profileButton = (ImageButton) findViewById(R.id.profileButton);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.mapButton:
                Intent intent = new Intent (WashingtonParkImage.this, MainMap.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                break;
            case R.id.bookmarkButton:
                intent = new Intent (WashingtonParkImage.this, BookmarkActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
            case R.id.tripButton:
                intent = new Intent (WashingtonParkImage.this, CarActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
            case R.id.profileButton:
                intent = new Intent (WashingtonParkImage.this, ProfileActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;

        }
    }
}