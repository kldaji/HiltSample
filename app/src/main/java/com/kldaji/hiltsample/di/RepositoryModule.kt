package com.kldaji.hiltsample.di

import com.kldaji.hiltsample.data.GithubRepository
import com.kldaji.hiltsample.data.GithubRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun bindGithubRepository(githubRepositoryImpl: GithubRepositoryImpl): GithubRepository
}
