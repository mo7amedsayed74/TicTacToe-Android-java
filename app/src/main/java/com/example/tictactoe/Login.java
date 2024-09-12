package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


public class Login extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("user") && password.getText().toString().equals("1234")) {
                    Toast.makeText(Login.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Login.this, AddPlayers.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(Login.this, "Login Failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}