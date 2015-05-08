package com.ambergleam.android.pinkoctopusproject.model;

import java.util.ArrayList;
import java.util.List;

public class StoryMock extends Story {

    public StoryMock() {
        super();
        setTitle("Title");
        setDescription("Description");
        setImageUrl("http://images.clipartpanda.com/cute-baby-octopus-clipart-cartoon_octopus_0515-0908-2422-4351_smu.jpg");
        setPageList(createPageList());
    }

    private List<Page> createPageList() {
        List<Page> pageList = new ArrayList<>();
        pageList.add(new PageMock());
        pageList.add(new PageMock());
        pageList.add(new PageMock());
        pageList.add(new PageMock());
        return pageList;
    }

}