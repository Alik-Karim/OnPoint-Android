package com.example.onpoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Profile extends AppCompatActivity {

    ImageView edit_btn;
    ImageView order;
    ImageView friends;
    ImageView bell;
    ImageView setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        edit_btn = findViewById(R.id.edit_profile);
        edit_btn.setOnClickListener(view -> {
            Intent i = new Intent(Profile.this, profile_edit.class);
            startActivity(i);
        });

        order = findViewById(R.id.order_bwh);
        order.setOnClickListener(view -> {
            Intent i = new Intent(Profile.this, MainActivity.class);
            startActivity(i);
        });

//        friends = findViewById(R.id.user_bwh);
//        friends.setOnClickListener(view -> {
//            Intent i = new Intent(Profile.this, profile_edit.class);
//            startActivity(i);
//        });
//
//        bell = findViewById(R.id.bell_bwh);
//        bell.setOnClickListener(view -> {
//            Intent i = new Intent(Profile.this, profile_edit.class);
//            startActivity(i);
//        });

        setting = findViewById(R.id.setting_bwh);
        setting.setOnClickListener(view -> {
            Intent i = new Intent(Profile.this, Setting.class);
            startActivity(i);
        });

    }
}