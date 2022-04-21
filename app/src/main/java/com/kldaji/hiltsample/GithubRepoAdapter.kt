package com.kldaji.hiltsample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.kldaji.hiltsample.data.entity.GithubRepoRes
import com.kldaji.hiltsample.databinding.ItemGithubRepoBinding

class GithubRepoAdapter :
    ListAdapter<GithubRepoRes, GithubRepoAdapter.GithubRepoViewHolder>(diffUtil) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GithubRepoViewHolder {
        return GithubRepoViewHolder(ItemGithubRepoBinding.inflate(LayoutInflater.from(parent.context),
            parent,
            false))
    }

    override fun onBindViewHolder(holder: GithubRepoViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class GithubRepoViewHolder(private val binding: ItemGithubRepoBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: GithubRepoRes) {
            binding.githubRepoRes = item
        }
    }

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<GithubRepoRes>() {
            override fun areItemsTheSame(oldItem: GithubRepoRes, newItem: GithubRepoRes): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(
                oldItem: GithubRepoRes,
                newItem: GithubRepoRes,
            ): Boolean {
                return oldItem.id == newItem.id
            }
        }
    }
}
