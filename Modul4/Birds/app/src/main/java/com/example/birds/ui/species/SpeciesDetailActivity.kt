package com.example.birds.ui.species

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.birds.databinding.ActivitySpeciesDetailBinding

class SpeciesDetailActivity : AppCompatActivity() {
    private var _binding: ActivitySpeciesDetailBinding? = null
    private val binding get() = _binding!!

    companion object{
        const val EXTRA_IMAGE = "image"
        const val EXTRA_NAME = "name"
        const val EXTRA_DESCRIPTION = "description"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivitySpeciesDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val image = binding.imageSpeciesDetail
        image.setImageResource(intent.getIntExtra(EXTRA_IMAGE, 0))

        val name = binding.nameSpeciesDetail
        name.text = intent.getStringExtra(EXTRA_NAME)

        val description = binding.descSpeciesDetail
        description.text = intent.getStringExtra(EXTRA_DESCRIPTION)
    }
}