package com.example.birds.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.birds.R
import com.example.birds.model.VideoData
import com.example.birds.ui.video.VideoDetailActivity
import com.example.birds.ui.video.VideoViewModel

class VideoAdapter(
    private val context: Context,
    private val dataset: List<VideoData>
): RecyclerView.Adapter<VideoAdapter.VideoViewHolder>() {
    private val viewModel = VideoViewModel()


    class VideoViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        val imageView: ImageView = view.findViewById(R.id.item_video_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val adapterLayout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.video_item, parent,false)
        return VideoViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.imageResourceId)

        holder.view.setOnClickListener{
            viewModel.setData(item, context)
            val intent = Intent(context, VideoDetailActivity::class.java).apply {
                putExtra("image", viewModel.image.value)
                putExtra("link", viewModel.link.value)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = dataset.size
}