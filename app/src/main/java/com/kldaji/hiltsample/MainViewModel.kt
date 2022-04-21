package com.kldaji.hiltsample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kldaji.hiltsample.data.GithubRepository
import com.kldaji.hiltsample.data.entity.GithubRepoRes
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val githubRepository: GithubRepository) : ViewModel() {

    private val _githubRepositories = MutableLiveData<List<GithubRepoRes>>()
    val githubRepositories: LiveData<List<GithubRepoRes>> = _githubRepositories

    fun getGithubRepositories(owner: String) {
        if (owner == "") return

        viewModelScope.launch {
            val repos = githubRepository.getRepos(owner)
            _githubRepositories.value = repos
        }
    }
}
