package com.learnwithme.buildscratchapp.tryingdagger2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by Nithin on 05/05/2017.
 */

@Scope
@Retention(RetentionPolicy.CLASS)
public @interface GithubApplicationScope {
}
