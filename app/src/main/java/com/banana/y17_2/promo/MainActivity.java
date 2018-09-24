package com.banana.y17_2.promo;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewPager viewPager = findViewById(R.id.vwPgr);
        final FragmentsAdapter adapter = new FragmentsAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }
}
