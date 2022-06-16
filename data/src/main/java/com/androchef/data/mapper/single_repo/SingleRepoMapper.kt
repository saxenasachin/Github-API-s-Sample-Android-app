package com.androchef.data.mapper.single_repo

import com.androchef.data.mapper.Mapper
import com.androchef.data.models.SingleRepoEntity
import com.androchef.domain.models.repo.GitSingleRepo
import javax.inject.Inject

/**
Created by Sachin Saxena on 16/06/22.
 */
class SingleRepoMapper @Inject constructor() : Mapper<SingleRepoEntity, GitSingleRepo> {
    override fun mapFromEntity(type: SingleRepoEntity): GitSingleRepo {
        return GitSingleRepo(
            repoName = type.repoName,
            defaultBranch = type.defaultBranch,
            forksCount = type.forksCount,
            openIssuesCount = type.openIssuesCount,
            repoDescription = type.repoDescription
        )
    }

    override fun mapToEntity(type: GitSingleRepo): SingleRepoEntity {
        return SingleRepoEntity(
            repoName = type.repoName,
            defaultBranch = type.defaultBranch,
            forksCount = type.forksCount,
            openIssuesCount = type.openIssuesCount,
            repoDescription = type.repoDescription
        )
    }
}