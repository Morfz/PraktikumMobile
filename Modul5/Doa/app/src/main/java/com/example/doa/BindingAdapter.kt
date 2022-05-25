package com.example.doa

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.doa.network.Doa
import com.example.doa.ui.DoaApiStatus
import com.example.doa.ui.DoaListAdapter

@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView, data: List<Doa>?) {
    val adapter = recyclerView.adapter as DoaListAdapter
    adapter.submitList(data)
}

@BindingAdapter("apiStatus")
fun bindStatus(statusImageView: ImageView, status: DoaApiStatus?) {
    when(status) {
        DoaApiStatus.LOADING -> {
            statusImageView.visibility = View.VISIBLE
            statusImageView.setImageResource(R.drawable.loading_animation)
        }
        DoaApiStatus.DONE -> {
            statusImageView.visibility = View.GONE
        }
        DoaApiStatus.ERROR -> {
            statusImageView.visibility = View.VISIBLE
            statusImageView.setImageResource(R.drawable.ic_connection_error)
        }
    }
}