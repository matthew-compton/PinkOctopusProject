package com.ambergleam.android.pinkoctopusproject.model;

import java.util.List;

public class Story {

    private String mName;
    private String mDescription;
    private String mImageUrl;
    private List<Page> mPageList;

    public Story(String name, String description, String imageUrl, List<Page> pageList) {
        mName = name;
        mDescription = description;
        mImageUrl = imageUrl;
        mPageList = pageList;
    }

    public String getName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public List<Page> getPageList() {
        return mPageList;
    }

}