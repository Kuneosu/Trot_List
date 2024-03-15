package com.kks.trot_list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.kks.trot_list.databinding.ItemSingRecyclerBinding

class SingRvAdapter(list: MutableList<String>) :
    ListAdapter<String, SingRvAdapter.ViewHolder>(DiffCallback()) {
    private lateinit var binding: ItemSingRecyclerBinding
    private val singList = list


    class ViewHolder(private val binding: ItemSingRecyclerBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(text: String) {
            binding.singName.text = text
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_sing_recycler,
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(singList[position])
    }

    override fun getItemCount() = singList.size
}


class DiffCallback : DiffUtil.ItemCallback<String>() {

    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }
}