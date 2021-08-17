package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    ////initialize
    //SignInButton.setOnClickListener(this); // used for the toast message
    ////initialize
    //signUpButton.setOnClickListener(this); // used for the toast message
    ////initialize
    //AdministratorSignInButton.setOnClickListener(this); // used for the toast message

    private EditText editTextTextUsername, editTextTextPassword;
    private Button signInButton, signUpButton, administratorSignInButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextTextUsername = findViewById(R.id.editTextTextUsername);
        editTextTextPassword = findViewById(R.id.editTextTextPassword);
        signInButton = findViewById(R.id.signInButton);
        signUpButton = findViewById(R.id.signUpButton);
        administratorSignInButton = findViewById(R.id.administratorSignInButton);

    }


    public void signIn(View v) {
        Button signInButton = findViewById(R.id.signInButton);
        if (editTextTextUsername.toString() == "JoeC" && editTextTextPassword.toString() == "HydroCosm" ) {
            Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();

            }
        else {
            Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
        }
    }

}