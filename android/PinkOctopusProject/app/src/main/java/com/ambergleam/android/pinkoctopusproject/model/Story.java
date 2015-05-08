package com.ambergleam.android.pinkoctopusproject.model;

import java.io.Serializable;
import java.util.List;

public class Story implements Serializable {

    private String mTitle;
    private String mDescription;
    private String mImageUrl;
    private List<Page> mPageList;

    public Story() {
    }

    public Story(String title, String description, String imageUrl, List<Page> pageList) {
        mTitle = title;
        mDescription = description;
        mImageUrl = imageUrl;
        mPageList = pageList;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }

    public List<Page> getPageList() {
        return mPageList;
    }

    public void setPageList(List<Page> pageList) {
        mPageList = pageList;
    }

}