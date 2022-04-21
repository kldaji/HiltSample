package com.kldaji.hiltsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.kldaji.hiltsample.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel by viewModels<MainViewModel>()
    private lateinit var githubRepoAdapter: GithubRepoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSubmitButtonClickListener()
        setGithubRepoAdapter()
        setGithubRepositoriesObserver()
    }

    private fun setSubmitButtonClickListener() {
        binding.btnLoad.setOnClickListener {
            val owner = binding.etOwner.text.toString()
            viewModel.getGithubRepositories(owner)
        }
    }

    private fun setGithubRepoAdapter() {
        githubRepoAdapter = GithubRepoAdapter()
        binding.rv.adapter = githubRepoAdapter
    }

    private fun setGithubRepositoriesObserver() {
        viewModel.githubRepositories.observe(this) {
            githubRepoAdapter.submitList(it)
        }
    }
}
