package com.learnwithme.buildscratchapp.tryingdagger2.network;


import com.learnwithme.buildscratchapp.tryingdagger2.models.GithubRepo;
import com.learnwithme.buildscratchapp.tryingdagger2.models.GithubUser;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Nithin on 03/05/2017.
 */

public interface GithubService {
    @GET("users/{username}/repos")
    Call<List<GithubRepo>> getReposForUser(@Path("username") String username);

    @GET("repositories")
    Call<List<GithubRepo>> getAllRepos();

    @GET("users/{username}")
    Call<GithubUser> getUser(@Path("username") String username);
}
