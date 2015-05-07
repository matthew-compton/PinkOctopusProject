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
        addFakeStories();
    }

    private void addFakeStories() {
        mStoryList.add(new Story("Octave 1", "The Pink Octopus", "http://images.clipartpanda.com/cute-baby-octopus-clipart-cartoon_octopus_0515-0908-2422-4351_smu.jpg", null));
        mStoryList.add(new Story("Octave 2", "The Pink Octopus", "http://images.clipartpanda.com/cute-baby-octopus-clipart-cartoon_octopus_0515-0908-2422-4351_smu.jpg", null));
        mStoryList.add(new Story("Octave 3", "The Pink Octopus", "http://images.clipartpanda.com/cute-baby-octopus-clipart-cartoon_octopus_0515-0908-2422-4351_smu.jpg", null));
    }

    public Story get(int position) {
        return mStoryList.get(position);
    }

    public int size() {
        return mStoryList.size();
    }

}