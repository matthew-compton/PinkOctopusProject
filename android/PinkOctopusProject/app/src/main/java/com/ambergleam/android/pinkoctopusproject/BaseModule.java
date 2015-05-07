package com.ambergleam.android.pinkoctopusproject;

import com.ambergleam.android.pinkoctopusproject.controller.MainActivity;
import com.ambergleam.android.pinkoctopusproject.controller.MainFragment;
import com.ambergleam.android.pinkoctopusproject.model.Library;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        injects = {
                MainActivity.class,
                MainFragment.class
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