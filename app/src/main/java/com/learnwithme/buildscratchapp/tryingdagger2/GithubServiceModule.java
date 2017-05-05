package com.learnwithme.buildscratchapp.tryingdagger2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.learnwithme.buildscratchapp.tryingdagger2.network.DateTimeConverter;
import com.learnwithme.buildscratchapp.tryingdagger2.network.GithubService;

import org.joda.time.DateTime;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Nithin on 03/05/2017.
 */

@Module(includes = NetworkModule.class)
public class GithubServiceModule {
    @Provides
    @GithubApplicationScope
    public GithubService githubService(Retrofit githubRetrofit) {
        return githubRetrofit.create(GithubService.class);
    }

    @Provides
    @GithubApplicationScope
    public Gson gson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(DateTime.class, new DateTimeConverter());
        return gsonBuilder.create();
    }

    @Provides
    @GithubApplicationScope
    public Retrofit retrofit(OkHttpClient okHttpClient, Gson gson) {
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient)
                .baseUrl("https://api.github.com/")
                .build();
    }
}
