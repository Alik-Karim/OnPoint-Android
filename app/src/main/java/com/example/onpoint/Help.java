package com.example.onpoint;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class Help extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 pager2;
    FragmentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        tabLayout = findViewById(R.id.mainTabLayout);
        pager2 = findViewById(R.id.view_layout);

        FragmentManager fm = getSupportFragmentManager();
        adapter = new FragmentAdapter(fm, getLifecycle());
        pager2.setAdapter(adapter);

        tabLayout.addTab(tabLayout.newTab().setText("satu"));
        tabLayout.addTab(tabLayout.newTab().setText("dua"));
        tabLayout.addTab(tabLayout.newTab().setText("tiga"));
        tabLayout.addTab(tabLayout.newTab().setText("empat"));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){
            @Override
            public void onTabSelected(TabLayout.Tab tab){
                pager2.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab){


            }

            @Override
            public void onTabReselected(TabLayout.Tab tab){


            }

        });

        pager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position){
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });
    }
}