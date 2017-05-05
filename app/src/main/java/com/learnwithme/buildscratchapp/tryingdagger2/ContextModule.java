package com.learnwithme.buildscratchapp.tryingdagger2;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Nithin on 03/05/2017.
 */

@Module
public class ContextModule {
    private final Context context;

    public ContextModule(Context context) {
        this.context = context;
    }

    @Provides
    @GithubApplicationScope
    @ApplicationContext
    public Context context() {
        return context;
    }
}
