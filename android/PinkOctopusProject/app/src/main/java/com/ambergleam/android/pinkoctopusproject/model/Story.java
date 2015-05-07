package com.ambergleam.android.pinkoctopusproject.model;

import java.util.List;

public class Story {

    private String mTitle;
    private String mDescription;
    private String mImageUrl;
    private List<Page> mPageList;

    public Story(String title, String description, String imageUrl, List<Page> pageList) {
        mTitle = title;
        mDescription = description;
        mImageUrl = imageUrl;
        mPageList = pageList;
    }

    public String getTitle() {
        return mTitle;
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