package com.example.birds.ui.video

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.birds.databinding.ActivityVideoDetailBinding
import com.example.birds.ui.species.SpeciesDetailActivity
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener

class VideoDetailActivity : AppCompatActivity() {
    private var _binding: ActivityVideoDetailBinding? = null
    private val binding get() = _binding!!

    companion object{
        const val EXTRA_LINK = "link"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityVideoDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val name = binding.youtubePlayerView
        getLifecycle().addObserver(name)

        name.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                val videoId = intent.getStringExtra(EXTRA_LINK) //change according to your need
                if (videoId != null) {
                    youTubePlayer.loadVideo(videoId, 0F)
                }
            }
        })
    }


}