package com.ambergleam.android.pinkoctopusproject;

import com.ambergleam.android.pinkoctopusproject.controller.AboutActivity;
import com.ambergleam.android.pinkoctopusproject.controller.AboutFragment;
import com.ambergleam.android.pinkoctopusproject.controller.LibraryActivity;
import com.ambergleam.android.pinkoctopusproject.controller.LibraryFragment;
import com.ambergleam.android.pinkoctopusproject.controller.SettingsActivity;
import com.ambergleam.android.pinkoctopusproject.controller.SettingsFragment;
import com.ambergleam.android.pinkoctopusproject.model.Library;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        injects = {
                LibraryActivity.class,
                LibraryFragment.class,
                AboutActivity.class,
                AboutFragment.class,
                SettingsActivity.class,
                SettingsFragment.class
        },
        complete = true)
public class BaseModule {

    private final BaseApplication mApplication;

    public BaseModule(BaseApplication application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    public Library provideLibrary() {
        return new Library();
    }

}