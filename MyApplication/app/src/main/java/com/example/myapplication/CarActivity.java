package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class CarActivity extends AppCompatActivity implements  View.OnClickListener{

    private ImageButton mapButton, bookmarkButton, tripButton, profileButton;

    public void onClick(View v){
        switch (v.getId()){
            case R.id.bookmarkButton:
                Intent intentTwo = new Intent (CarActivity.this, BookmarkActivity.class);
                startActivity(intentTwo);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                break;
            case R.id.mapButton:
                intentTwo = new Intent (CarActivity.this, MainMap.class);
                startActivity(intentTwo);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                break;
            case R.id.profileButton:
                intentTwo = new Intent (CarActivity.this, ProfileActivity.class);
                startActivity(intentTwo);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
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