package com.ykotmoar.githubbrowser.di

import com.ykotmoar.githubbrowser.data.repository.repo.RepoRepositoryImpl
import com.ykotmoar.githubbrowser.data.repository.repo.local.RepoLocalDataSource
import com.ykotmoar.githubbrowser.data.repository.repo.local.RepoLocalDataSourceImpl
import com.ykotmoar.githubbrowser.data.repository.repo.remote.RepoRemoteDataSource
import com.ykotmoar.githubbrowser.data.repository.repo.remote.RepoRemoteDataSourceImpl
import com.ykotmoar.githubbrowser.domain.repository.RepoRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideRepoRemoteDataSource(): RepoRemoteDataSource {
        return RepoRemoteDataSourceImpl()
    }

    @Provides
    @Singleton
    fun provideRepoLocalDataSource(): RepoLocalDataSource {
        return RepoLocalDataSourceImpl()
    }

    @Provides
    @Singleton
    fun provideRepoRepository(
        repoRemoteDataSource: RepoRemoteDataSource,
        repoLocalDataSource: RepoLocalDataSource,
    ): RepoRepository {
        return RepoRepositoryImpl(repoRemoteDataSource, repoLocalDataSource)
    }
}