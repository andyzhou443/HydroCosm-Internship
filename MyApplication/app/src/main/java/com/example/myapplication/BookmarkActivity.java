package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class BookmarkActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton mapButton, bookmarkButton, tripButton, profileButton;

    public void onClick(View v){
        switch (v.getId()){
            case R.id.mapButton:
                Intent intent = new Intent (BookmarkActivity.this, MainMap.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                break;
            case R.id.tripButton:
                intent = new Intent (BookmarkActivity.this, CarActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
            case R.id.profileButton:
                intent = new Intent (BookmarkActivity.this, ProfileActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookmark);

        mapButton = (ImageButton) findViewById(R.id.mapButton);
        bookmarkButton = (ImageButton) findViewById(R.id.bookmarkButton);
        tripButton = (ImageButton) findViewById(R.id.tripButton);
        profileButton = (ImageButton) findViewById(R.id.profileButton);
    }
}