package com.example.stanley.androiddialog;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;


public class NewActivity extends ActionBarActivity

{

    boolean mIsLargeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        mIsLargeLayout = getResources().getBoolean(R.bool.large_layout);
        setContentView(R.layout.activity_new);
        if (savedInstanceState == null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            AlertFragment alertedFragment = new AlertFragment();
            ft.add(R.id.container, alertedFragment);
            ft.commit();

        }
    }
}











