package com.ambergleam.android.pinkoctopusproject.controller;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ambergleam.android.pinkoctopusproject.BaseFragment;
import com.ambergleam.android.pinkoctopusproject.R;
import com.ambergleam.android.pinkoctopusproject.model.Page;
import com.squareup.picasso.Picasso;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class StoryPageFragment extends BaseFragment {

    private static final String ARG_PAGE = "GalleryFragment.PAGE";

    @InjectView(R.id.fragment_story_page_caption) TextView mCaptionTextView;
    @InjectView(R.id.fragment_story_page_image) ImageView mImageView;

    private Page mPage;

    public static StoryPageFragment newInstance(Page galleryImage) {
        StoryPageFragment fragment = new StoryPageFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_PAGE, galleryImage);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
        mPage = (Page) args.getSerializable(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_story_page, container, false);
        ButterKnife.inject(this, view);

        mCaptionTextView.setText(mPage.getCaption());
        Picasso.with(getActivity())
                .load(mPage.getImageUrl())
                .fit()
                .centerCrop()
                .into(mImageView);

        return view;
    }

}