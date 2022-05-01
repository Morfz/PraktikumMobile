package com.example.birds.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.birds.R
import com.example.birds.adapter.GalleryAdapter
import com.example.birds.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment(R.layout.fragment_gallery) {

    private var _binding: FragmentGalleryBinding? = null
    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val view: View = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.galleryRV
        recyclerView.adapter = GalleryAdapter(requireContext(),GalleryViewModel().loadData())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}