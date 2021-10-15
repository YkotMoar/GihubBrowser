package com.ykotmoar.githubbrowser.data.repository.repo

import com.ykotmoar.githubbrowser.data.repository.repo.local.RepoLocalDataSource
import com.ykotmoar.githubbrowser.data.repository.repo.remote.RepoRemoteDataSource
import com.ykotmoar.githubbrowser.domain.repository.RepoRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RepoRepositoryImpl @Inject constructor(
    private val repoRemoteDataSource: RepoRemoteDataSource,
    private val repoLocalDataSource: RepoLocalDataSource,
): RepoRepository {
}