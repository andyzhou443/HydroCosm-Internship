package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CarActivity extends AppCompatActivity implements  View.OnClickListener{

    private ImageButton mapButton, bookmarkButton, tripButton, profileButton;

    public void onClick(View v){
        switch (v.getId()){
            case R.id.bookmarkButton:
                Intent intent = new Intent (CarActivity.this, BookmarkActivity.class);
                startActivity(intent);
                break;
            case R.id.mapButton:
                intent = new Intent (CarActivity.this, MainMap.class);
                startActivity(intent);
                break;
            case R.id.profileButton:
                intent = new Intent (CarActivity.this, ProfileActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);


        mapButton = (ImageButton) findViewById(R.id.mapButton);
        bookmarkButton = (ImageButton) findViewById(R.id.bookmarkButton);
        tripButton = (ImageButton) findViewById(R.id.tripButton);
        profileButton = (ImageButton) findViewById(R.id.profileButton);
    }
}