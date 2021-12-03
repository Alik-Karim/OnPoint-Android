package com.example.onpoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    androidx.appcompat.widget.AppCompatButton login_btn;
    TextView register;
    TextView forgotpass;
    TextView username;
    TextView password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        register = findViewById(R.id.daftar);
        register.setOnClickListener(view -> {
            Intent i = new Intent(Login.this, Register.class);
            startActivity(i);
        });

        forgotpass = findViewById(R.id.lupa);
        forgotpass.setOnClickListener(view -> {
            Intent i = new Intent(Login.this, Forgot.class);
            startActivity(i);
        });

        login_btn = findViewById(R.id.login_btn);
        login_btn.setOnClickListener(view -> {
            Intent i = new Intent(Login.this, MainActivity.class);
            startActivity(i);
        });


    }
}