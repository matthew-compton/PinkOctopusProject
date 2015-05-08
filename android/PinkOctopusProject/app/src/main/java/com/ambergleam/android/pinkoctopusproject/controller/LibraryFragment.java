package com.ambergleam.android.pinkoctopusproject.controller;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.ambergleam.android.pinkoctopusproject.BaseFragment;
import com.ambergleam.android.pinkoctopusproject.R;
import com.ambergleam.android.pinkoctopusproject.model.Library;
import com.ambergleam.android.pinkoctopusproject.model.Story;
import com.ambergleam.android.pinkoctopusproject.view.SpacesItemDecoration;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class LibraryFragment extends BaseFragment {

    @Inject Library mLibrary;

    @InjectView(R.id.fragment_library_recyclerView) RecyclerView mLibraryRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_library, container, false);
        ButterKnife.inject(this, layout);
        setHasOptionsMenu(true);

        mLibraryRecyclerView.setHasFixedSize(true);
        mLibraryRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mLibraryRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mLibraryRecyclerView.addItemDecoration(new SpacesItemDecoration(getResources().getDimensionPixelSize(R.dimen.padding_normal)));
        mLibraryRecyclerView.setAdapter(new LibraryAdapter());

        return layout;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_library, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_library_settings:
                startActivity(SettingsActivity.newIntent(getActivity()));
                return true;
            case R.id.menu_library_about:
                startActivity(AboutActivity.newIntent(getActivity()));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public class LibraryHolder extends RecyclerView.ViewHolder {

        @InjectView(R.id.view_story_preview) public ImageView mPreviewImageView;
        @InjectView(R.id.view_story_progress) public ProgressBar mProgressBar;
        @InjectView(R.id.view_story_title) public TextView mTitleTextView;
        @InjectView(R.id.view_story_description) public TextView mDescriptionTextView;

        private Story mStory;
        private boolean mIsLoading;

        public LibraryHolder(View view) {
            super(view);
            ButterKnife.inject(this, view);
            view.setOnClickListener(v -> {
                startActivity(StoryActivity.newIntent(getActivity(), mStory));
            });
        }

        public void bindStory(Story story) {
            mStory = story;
            mIsLoading = true;
            mTitleTextView.setText(mStory.getTitle());
            mDescriptionTextView.setText(mStory.getDescription());

            int size = getResources().getDimensionPixelSize(R.dimen.view_story_preview_size);
            Picasso.with(getActivity())
                    .load(mStory.getImageUrl())
                    .resize(size, size)
                    .centerCrop()
                    .into(mPreviewImageView, new Callback() {
                        @Override
                        public void onSuccess() {
                            mIsLoading = false;
                            updateUI();
                        }

                        @Override
                        public void onError() {
                            mIsLoading = false;
                            updateUI();
                        }
                    });
            updateUI();
        }

        private void updateUI() {
            if (mIsLoading) {
                mPreviewImageView.setVisibility(View.GONE);
                mProgressBar.setVisibility(View.VISIBLE);
            } else {
                mProgressBar.setVisibility(View.GONE);
                mPreviewImageView.setVisibility(View.VISIBLE);
            }
        }

    }

    public class LibraryAdapter extends RecyclerView.Adapter<LibraryHolder> {

        @Override
        public LibraryHolder onCreateViewHolder(ViewGroup parent, int position) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_story, parent, false);
            return new LibraryHolder(view);
        }

        @Override
        public void onBindViewHolder(LibraryHolder holder, int position) {
            Story story = mLibrary.get(position);
            holder.bindStory(story);
        }

        @Override
        public int getItemCount() {
            return mLibrary.size();
        }

    }

}