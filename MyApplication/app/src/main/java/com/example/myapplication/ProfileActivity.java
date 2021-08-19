package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity implements  View.OnClickListener{

    private Button paymentMethodButton, settingsButton, contactButton, termsButton, privacyPolicyButton, feedbackButton,logoutButton;
    private ImageButton mapButton, bookmarkButton, tripButton, profileButton;

    public void onClick(View v){
        switch (v.getId()){
            case R.id.paymentMethodButton:
            case R.id.settingsButton:
            case R.id.contactButton:
            case R.id.termsButton:
            case R.id.privacyPolicyButton:
            case R.id.feedbackButton:
                Toast.makeText(ProfileActivity.this, "Feature not Implemented", Toast.LENGTH_SHORT).show();
                break;

            case R.id.mapButton:
                Intent intent = new Intent (ProfileActivity.this, MainMap.class);
                startActivity(intent);
                break;
            case R.id.bookmarkButton:
                intent = new Intent (ProfileActivity.this, BookmarkActivity.class);
                startActivity(intent);
                break;
            case R.id.tripButton:
                intent = new Intent (ProfileActivity.this, CarActivity.class);
                startActivity(intent);
                break;
            case R.id.logoutButton:
                Toast.makeText(ProfileActivity.this, "Logout Successful", Toast.LENGTH_SHORT).show();
                intent = new Intent (ProfileActivity.this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        logoutButton = (Button) findViewById(R.id.logoutButton);
        paymentMethodButton = (Button) findViewById(R.id.paymentMethodButton);
        settingsButton = (Button) findViewById(R.id.settingsButton);
        contactButton = (Button) findViewById(R.id.contactButton);
        termsButton = (Button) findViewById(R.id.termsButton);
        privacyPolicyButton = (Button) findViewById(R.id.privacyPolicyButton);
        feedbackButton = (Button) findViewById(R.id.feedbackButton);
        mapButton = (ImageButton) findViewById(R.id.mapButton);
        bookmarkButton = (ImageButton) findViewById(R.id.bookmarkButton);
        tripButton = (ImageButton) findViewById(R.id.tripButton);
        profileButton = (ImageButton) findViewById(R.id.profileButton);

    }
}