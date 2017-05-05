package com.learnwithme.buildscratchapp.tryingdagger2;

import android.app.Activity;
import android.app.Application;

import com.learnwithme.buildscratchapp.tryingdagger2.network.GithubService;
import com.squareup.picasso.Picasso;

import timber.log.Timber;

/**
 * Created by Nithin on 03/05/2017.
 */

public class GithubApplication extends Application {

    private GithubApplicationComponent component;

    public static GithubApplication get(Activity activity) {
        return (GithubApplication) activity.getApplication();
    }

    private GithubService githubService;
    private Picasso picasso;

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());

        component = DaggerGithubApplicationComponent.builder()
                .contextModule(new ContextModule(this))
                .build();

        githubService = component.getGithubService();
        picasso = component.getPicasso();
    }

    public GithubApplicationComponent component() {
        return component;
    }
}
