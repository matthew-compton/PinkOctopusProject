package com.ambergleam.android.pinkoctopusproject.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Library implements Serializable {

    protected List<Story> mStoryList;

    @Inject
    public Library() {
        mStoryList = new ArrayList<>();
    }

    public Story get(int position) {
        return mStoryList.get(position);
    }

    public int size() {
        return mStoryList.size();
    }

}