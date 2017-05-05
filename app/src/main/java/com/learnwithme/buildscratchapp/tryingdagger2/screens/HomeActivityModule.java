package com.learnwithme.buildscratchapp.tryingdagger2.screens;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Nithin on 05/05/2017.
 */

@Module
public class HomeActivityModule {
    private final HomeActivity homeActivity;

    public HomeActivityModule(HomeActivity homeActivity) {
        this.homeActivity = homeActivity;
    }

    @Provides
    @HomeActivityScope
    public HomeActivity homeActivity() {
        return homeActivity;
    }
}
