package com.ambergleam.android.pinkoctopusproject.controller;

import android.support.v4.app.Fragment;

import com.ambergleam.android.pinkoctopusproject.BaseActivity;


public class MainActivity extends BaseActivity {

    @Override
    protected Fragment createFragment() {
        return new MainFragment();
    }

    @Override
    protected boolean isUpButtonEnabled() {
        return false;
    }

}