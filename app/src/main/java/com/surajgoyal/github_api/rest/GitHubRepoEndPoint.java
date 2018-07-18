package com.surajgoyal.github_api.rest;

import java.util.List;
import com.surajgoyal.github_api.model.GitHubRepo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface GitHubRepoEndPoint {

    @GET("/users/{user}/repos")
    Call<List<GitHubRepo>> getRepo(@Path("user") String name);


}
