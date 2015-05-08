package com.ambergleam.android.pinkoctopusproject.controller;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ambergleam.android.pinkoctopusproject.model.Page;
import com.ambergleam.android.pinkoctopusproject.model.Story;

public class StoryPagerAdapter extends FragmentPagerAdapter {

    private Story mStory;

    public StoryPagerAdapter(FragmentManager fragmentManager, Story story) {
        super(fragmentManager);
        mStory = story;
    }

    @Override
    public Fragment getItem(int position) {
        Page page = mStory.getPageList().get(position);
        return StoryPageFragment.newInstance(page);
    }

    @Override
    public int getCount() {
        return mStory.getPageList().size();
    }

}