package com.ambergleam.android.pinkoctopusproject.model;

public class Page {

    private String mCaption;
    private String mImageUrl;

    public Page(String caption, String imageUrl) {
        mCaption = caption;
        mImageUrl = imageUrl;
    }

    public String getCaption() {
        return mCaption;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

}