package com.ambergleam.android.pinkoctopusproject.controller;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ambergleam.android.pinkoctopusproject.BaseFragment;
import com.ambergleam.android.pinkoctopusproject.R;
import com.ambergleam.android.pinkoctopusproject.model.Story;
import com.viewpagerindicator.CirclePageIndicator;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class StoryPagerFragment extends BaseFragment {

    private static final String ARG_STORY = "StoryPagerFragment.STORY";

    @InjectView(R.id.fragment_story_pager_viewPager) ViewPager mViewPager;
    @InjectView(R.id.fragment_story_pager_circlePageIndicator) CirclePageIndicator mCirclePageIndicator;

    private StoryPagerAdapter mAdapter;
    private Story mStory;

    public static StoryPagerFragment newInstance(Story story) {
        StoryPagerFragment fragment = new StoryPagerFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_STORY, story);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);

        mStory = (Story) getArguments().getSerializable(ARG_STORY);
        mAdapter = new StoryPagerAdapter(getChildFragmentManager(), mStory);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_story_pager, container, false);
        ButterKnife.inject(this, view);

        mViewPager.setAdapter(mAdapter);
        mCirclePageIndicator.setViewPager(mViewPager);

        return view;
    }

}