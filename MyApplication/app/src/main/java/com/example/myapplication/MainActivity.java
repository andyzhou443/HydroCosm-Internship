package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    private EditText editTextTextUsername;
    private EditText editTextTextPassword;
    private Button signInButton;
    private Button signUpButton;
    private Button administratorSignInButton;
    public String Username = "JoeC", Password = "HydroCosm";

    public void onClick(View v){
        switch (v.getId()){
            case R.id.signUpButton:
            case R.id.administratorSignInButton:
                Toast.makeText(MainActivity.this, "Feature not Implemented", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextTextUsername = (EditText) findViewById(R.id.editTextTextUsername);
        editTextTextPassword = (EditText) findViewById(R.id.editTextTextPassword);
        signInButton = (Button) findViewById(R.id.signInButton);

        signUpButton = (Button) findViewById(R.id.signUpButton);
        signUpButton.setOnClickListener(this);
        administratorSignInButton = (Button) findViewById(R.id.administratorSignInButton);
        administratorSignInButton.setOnClickListener(this);

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(editTextTextUsername.getText().toString(), editTextTextPassword.getText().toString()); //turns user text to strings
            }
        });

    }

    private void validate (String userName, String userPassword){
        if ((userName.equals("JoeC")) && (userPassword.equals("HydroCosm"))){
            Intent intent = new Intent (MainActivity.this, MainMap.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
        }
    }



}