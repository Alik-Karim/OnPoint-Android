package com.example.onpoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    TextView register;
    TextView forgotpass;

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
    }
}