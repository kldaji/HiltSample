package com.kldaji.hiltsample.data

import com.kldaji.hiltsample.data.entity.GithubRepoRes
import javax.inject.Inject

interface GithubRemoteDataSource {
    suspend fun getRepos(owner: String): List<GithubRepoRes>
}

class GithubRemoteDataSourceImpl @Inject constructor(private val githubService: GithubService) :
    GithubRemoteDataSource {
    override suspend fun getRepos(owner: String): List<GithubRepoRes> {
        return githubService.getRepos(owner)
    }

}
