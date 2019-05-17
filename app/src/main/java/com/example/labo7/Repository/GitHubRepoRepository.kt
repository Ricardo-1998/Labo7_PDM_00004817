package com.example.labo7.Repository

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.example.labo7.Database.GithubDAO
import com.example.labo7.Database.GithubRepo

class GitHubRepoRepository(private  val repoDao: GithubDAO){

    @WorkerThread
    suspend fun insert(repo: GithubRepo){
        repoDao.insert(repo)
    }

    fun getAll(): LiveData<List<GithubRepo>> = repoDao.getAllRepos()

    fun nuke() = repoDao.nukeTable()
}