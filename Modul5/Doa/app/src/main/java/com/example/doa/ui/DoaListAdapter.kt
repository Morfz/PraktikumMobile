package com.example.doa.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.doa.databinding.ListViewItemBinding
import com.example.doa.network.Doa

class DoaListAdapter(val clickListener: DoaListener) :
    ListAdapter<Doa, DoaListAdapter.DoaViewHolder>(DiffCallback) {

    class DoaViewHolder(
        var binding: ListViewItemBinding
    ) : RecyclerView.ViewHolder(binding.root){
        fun bind(clickListener: DoaListener, doa: Doa) {
            binding.doa = doa
            binding.clickListener = clickListener
            binding.executePendingBindings()
        }
    }

    companion object DiffCallback : DiffUtil.ItemCallback<Doa>() {

        override fun areItemsTheSame(oldItem: Doa, newItem: Doa): Boolean {
            return oldItem.doa == newItem.doa
        }

        override fun areContentsTheSame(oldItem: Doa, newItem: Doa): Boolean {
            return oldItem.latin == newItem.latin && oldItem.artinya == newItem.artinya
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoaViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return DoaViewHolder(
            ListViewItemBinding.inflate(layoutInflater, parent, false)
        )
    }

    override fun onBindViewHolder(holder: DoaViewHolder, position: Int) {
        val doa = getItem(position)
        holder.bind(clickListener, doa)
    }
}

class DoaListener(val clickListener: (doa: Doa) -> Unit) {
    fun onClick(doa: Doa) = clickListener(doa)
}