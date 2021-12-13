package com.example.onpoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Setting extends AppCompatActivity {

    androidx.appcompat.widget.AppCompatButton account;
    androidx.appcompat.widget.AppCompatButton help;
    androidx.appcompat.widget.AppCompatButton about;
    androidx.appcompat.widget.AppCompatButton logout;

    ImageView order;
    ImageView friends;
    ImageView bell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        account = findViewById(R.id.account_btn);
        account.setOnClickListener(view -> {
            Intent i = new Intent(Setting.this, Profile.class);
            startActivity(i);
        });

        help = findViewById(R.id.help_btn);
        help.setOnClickListener(view -> {
            Intent i = new Intent(Setting.this, Help.class);
            startActivity(i);
        });

        about = findViewById(R.id.about_btn);
        about.setOnClickListener(view -> {
            Intent i = new Intent(Setting.this, Profile.class);
            startActivity(i);
        });

        logout = findViewById(R.id.logout_btn);
        logout.setOnClickListener(view -> {
            Intent i = new Intent(Setting.this, Login.class);
            startActivity(i);
        });

        //bagian bawah//

//        order = findViewById(R.id.order4_bwh);
//        order.setOnClickListener(view -> {
//            Intent i = new Intent(Setting.this, MainActivity.class);
//            startActivity(i);
//        });

//        friends = findViewById(R.id.user4_bwh);
//        friends.setOnClickListener(view -> {
//            Intent i = new Intent(Setting.this, Profile.class);
//            startActivity(i);
//        });
//
//        bell = findViewById(R.id.bell4_bwh);
//        bell.setOnClickListener(view -> {
//            Intent i = new Intent(Setting.this, Profile.class);
//            startActivity(i);
//        });


    }
}