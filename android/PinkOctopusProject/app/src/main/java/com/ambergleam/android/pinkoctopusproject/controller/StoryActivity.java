package com.ambergleam.android.pinkoctopusproject.controller;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.ambergleam.android.pinkoctopusproject.BaseActivity;
import com.ambergleam.android.pinkoctopusproject.model.Story;

public class StoryActivity extends BaseActivity {

    private static String EXTRA_STORY = "StoryActivity.Story";

    public static Intent newIntent(Context context, Story story) {
        Intent intent = new Intent(context, StoryActivity.class);
        intent.putExtra(EXTRA_STORY, story);
        return intent;
    }

    @Override
    protected Fragment createFragment() {
        Intent intent = getIntent();
        Story story = (Story) intent.getSerializableExtra(EXTRA_STORY);
        return StoryPagerFragment.newInstance(story);
    }

    @Override
    protected boolean isUpButtonEnabled() {
        return false;
    }

    @Override
    protected boolean isToolbarEnabled() {
        return false;
    }

}