package com.mohan1614044.day4fragmentaddruntime;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();
        if (findViewById(R.id.fragment_container) != null) {


            if (savedInstanceState != null) {
            return;
            }

            FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
            Home_Fragment home_fragment =new Home_Fragment();
            fragmentTransaction.add(R.id.fragment_container,home_fragment,null);
            fragmentTransaction.commit();
        }
    }
}