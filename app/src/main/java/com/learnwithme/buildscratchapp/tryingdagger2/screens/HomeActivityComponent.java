package com.learnwithme.buildscratchapp.tryingdagger2.screens;

import com.learnwithme.buildscratchapp.tryingdagger2.GithubApplicationComponent;

import dagger.Component;

/**
 * Created by Nithin on 05/05/2017.
 */

@HomeActivityScope
@Component(modules = HomeActivityModule.class, dependencies = GithubApplicationComponent.class)
public interface HomeActivityComponent {
    void injectHomeActivity(HomeActivity homeActivity);
}
