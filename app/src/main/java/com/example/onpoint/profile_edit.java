package com.example.onpoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class profile_edit extends AppCompatActivity {

    TextView name_btn;
    TextView email_btn;
    TextView password_btn;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_edit);

        back = findViewById(R.id.back_editprofile);
        back.setOnClickListener(view -> {
            Intent i = new Intent(profile_edit.this, Profile.class);
            startActivity(i);
        });


    }
}