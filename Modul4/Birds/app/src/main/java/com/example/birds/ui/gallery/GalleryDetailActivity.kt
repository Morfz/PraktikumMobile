package com.example.birds.ui.gallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Gallery
import androidx.lifecycle.ViewModelProvider
import com.example.birds.databinding.ActivityGalleryDetailBinding

class GalleryDetailActivity : AppCompatActivity() {
    private var _binding: ActivityGalleryDetailBinding? = null
    private val binding get() = _binding!!

    companion object{
        const val EXTRA_IMAGE = "image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityGalleryDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val image = binding.detailImage
        image.setImageResource(intent.getIntExtra(EXTRA_IMAGE, 0))
    }
}