package com.kldaji.hiltsample.di

import com.kldaji.hiltsample.data.GithubRemoteDataSource
import com.kldaji.hiltsample.data.GithubRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {
    @Binds
    abstract fun bindGithubRemoteDataSource(githubRemoteDataSourceImpl: GithubRemoteDataSourceImpl): GithubRemoteDataSource
}
