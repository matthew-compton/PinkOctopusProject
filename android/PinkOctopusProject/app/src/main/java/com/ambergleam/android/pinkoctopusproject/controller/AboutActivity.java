package com.ambergleam.android.pinkoctopusproject.controller;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.ambergleam.android.pinkoctopusproject.BaseActivity;


public class AboutActivity extends BaseActivity {

    public static Intent newIntent(Context context) {
        return new Intent(context, AboutActivity.class);
    }

    @Override
    protected Fragment createFragment() {
        return new AboutFragment();
    }

    @Override
    protected boolean isUpButtonEnabled() {
        return true;
    }

    @Override
    protected boolean isToolbarEnabled() {
        return true;
    }

}