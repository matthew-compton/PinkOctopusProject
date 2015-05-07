package com.ambergleam.android.pinkoctopusproject.controller;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.ambergleam.android.pinkoctopusproject.BaseActivity;


public class SettingsActivity extends BaseActivity {

    public static Intent newIntent(Context context) {
        return new Intent(context, SettingsActivity.class);
    }
    @Override
    protected Fragment createFragment() {
        return new SettingsFragment();
    }

    @Override
    protected boolean isUpButtonEnabled() {
        return true;
    }

}