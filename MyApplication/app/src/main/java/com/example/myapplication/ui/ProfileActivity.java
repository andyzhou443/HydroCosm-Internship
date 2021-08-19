package com.example.myapplication.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.myapplication.R;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        PaymentMethodButton = (Button) findViewById(R.id.paymentMethodButton);
        settingsButton = (Button) findViewById(R.id.settingsButton);
        contactButton = (Button) findViewById(R.id.contactButton);
        PaymentMethodButton = (Button) findViewById(R.id.paymentMethodButton);
        settingsButton = (Button) findViewById(R.id.settingsButton);
        contactButton = (Button) findViewById(R.id.contactButton);
    }
}