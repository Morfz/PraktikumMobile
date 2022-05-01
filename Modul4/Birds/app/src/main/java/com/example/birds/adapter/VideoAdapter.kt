package com.example.birds.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.birds.R
import com.example.birds.model.GalleryData
import com.example.birds.model.VideoData
import com.example.birds.ui.gallery.GalleryDetailActivity
import com.example.birds.ui.gallery.GalleryViewModel
import com.example.birds.ui.news.VideoDetailActivity
import com.example.mobil.ui.news.VideoViewModel

class VideoAdapter(
    private val context: Context,
    private val dataset: List<VideoData>
): RecyclerView.Adapter<VideoAdapter.VideoViewHolder>() {
    private val viewModel = VideoViewModel()


    class VideoViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        val imageView: ImageView = view.findViewById(R.id.item_gallery_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val adapterLayout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.gallery_item, parent,false)
        return VideoViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.imageResourceId)

        holder.view.setOnClickListener{
            viewModel.setData(item)
            val intent = Intent(context, VideoDetailActivity::class.java).apply {
                putExtra("image", viewModel.image.value)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = dataset.size


}