package com.learnwithme.buildscratchapp.tryingdagger2;

import com.learnwithme.buildscratchapp.tryingdagger2.network.GithubService;
import com.squareup.picasso.Picasso;

import dagger.Component;

/**
 * Created by Nithin on 03/05/2017.
 */

@GithubApplicationScope
@Component(modules = {GithubServiceModule.class,PicassoModule.class})
public interface GithubApplicationComponent {
    Picasso getPicasso();
    GithubService getGithubService();
}