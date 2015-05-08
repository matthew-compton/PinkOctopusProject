package com.ambergleam.android.pinkoctopusproject.model;

import java.io.Serializable;

public class Page implements Serializable {

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