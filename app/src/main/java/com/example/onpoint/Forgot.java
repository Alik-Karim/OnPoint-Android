package com.example.onpoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Forgot extends AppCompatActivity {

    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);

        back = findViewById(R.id.kembali);
        back.setOnClickListener(view -> {
            Intent i = new Intent(Forgot.this, Login.class);
            startActivity(i);
        });
    }
}