package com.ambergleam.android.pinkoctopusproject.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.ambergleam.android.pinkoctopusproject.BaseFragment;
import com.ambergleam.android.pinkoctopusproject.R;
import com.ambergleam.android.pinkoctopusproject.model.Library;

import javax.inject.Inject;

import butterknife.ButterKnife;

public class MainFragment extends BaseFragment {

    @Inject Library mLibrary;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.inject(this, layout);
        setHasOptionsMenu(true);
        return layout;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_main, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_main_settings:
                // TODO
                return true;
            case R.id.menu_main_about:
                // TODO
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}