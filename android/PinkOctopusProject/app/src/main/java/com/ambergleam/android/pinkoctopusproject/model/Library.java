package com.ambergleam.android.pinkoctopusproject.model;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Library {

    private List<Story> mStoryList;

    @Inject
    public Library() {
        mStoryList = new ArrayList<>();
    }

    public List<Story> getStoryList() {
        return mStoryList;
    }

}