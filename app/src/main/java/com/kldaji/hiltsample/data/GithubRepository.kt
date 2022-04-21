package com.kldaji.hiltsample.data

import com.kldaji.hiltsample.data.entity.GithubRepoRes
import javax.inject.Inject

interface GithubRepository {
    suspend fun getRepos(owner: String): List<GithubRepoRes>
}

class GithubRepositoryImpl @Inject constructor(private val githubRemoteDataSource: GithubRemoteDataSource): GithubRepository {
    override suspend fun getRepos(owner: String): List<GithubRepoRes> {
        return githubRemoteDataSource.getRepos(owner)
    }
}

