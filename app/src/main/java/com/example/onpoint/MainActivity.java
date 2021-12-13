package com.example.onpoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    com.google.android.material.floatingactionbutton.FloatingActionButton float_button;

    ImageView profile;
    ImageView friends;
    ImageView bell;
    ImageView setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profile = findViewById(R.id.profil);
        profile.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, Profile.class);
            startActivity(i);
        });

        float_button = findViewById(R.id.floating_btn);
        float_button.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, AddActivity.class);
            startActivity(i);
        });

//        friends = findViewById(R.id.user1_bwh);
//        friends.setOnClickListener(view -> {
//            Intent i = new Intent(MainActivity.this, AddActivity.class);
//            startActivity(i);
//        });
//
//        bell = findViewById(R.id.bell1_bwh);
//        bell.setOnClickListener(view -> {
//            Intent i = new Intent(MainActivity.this, AddActivity.class);
//            startActivity(i);
//        });

//        setting = findViewById(R.id.setting1_bwh);
//        setting.setOnClickListener(view -> {
//            Intent i = new Intent(MainActivity.this, Setting.class);
//            startActivity(i);
//        });

    }
}