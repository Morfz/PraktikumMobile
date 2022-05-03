package com.example.birds.ui.video

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.birds.databinding.ActivityVideoDetailBinding

class VideoDetailActivity : AppCompatActivity() {
    private var _binding: ActivityVideoDetailBinding? = null
    private val binding get() = _binding!!

    companion object{
        const val EXTRA_IMAGE = "image"
        const val EXTRA_NAME = "name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityVideoDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

//        val image = binding.imageVideoDetail
//        image.setImageResource(intent.getIntExtra(EXTRA_IMAGE, 0))

        val name = binding.youtubePlayer
        setOf(videoId) = intent.getStringExtra(EXTRA_NAME)
    }


}