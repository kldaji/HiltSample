package com.kldaji.hiltsample.data

import com.kldaji.hiltsample.data.entity.GithubRepoRes
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubService {
    @GET("users/{owner}/repos")
    suspend fun getRepos(
        @Path("owner") owner: String
    ) : List<GithubRepoRes>
}
