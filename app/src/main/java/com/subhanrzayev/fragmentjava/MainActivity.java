package com.subhanrzayev.fragmentjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    FragmentManager fragmentManager;
    FirstFragment firstFragment;
    SecondFragment secondFragment;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstFragment = new FirstFragment();
        secondFragment = new SecondFragment();

        fragmentManager  = getSupportFragmentManager();


    }


    public void goToFirst(View view) {
        fragmentManager.beginTransaction()
                .replace(R.id.frame_layout,firstFragment).commit();



    }

    public void goToSecond(View view) {
        fragmentManager.beginTransaction()
                .replace(R.id.frame_layout,secondFragment).commit();

    }



}