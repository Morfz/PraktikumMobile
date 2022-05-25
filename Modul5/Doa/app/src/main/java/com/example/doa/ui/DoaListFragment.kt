package com.example.doa.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.doa.R
import com.example.doa.databinding.FragmentDoaListBinding

class DoaListFragment : Fragment() {

    private val viewModel: DoaViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentDoaListBinding.inflate(inflater)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        binding.recyclerView.adapter = DoaListAdapter(DoaListener { doa ->
            viewModel.onDoaClicked(doa)
            findNavController()
                .navigate(R.id.action_doaListFragment_to_doaDetailFragment)
        })

        // Inflate the layout for this fragment
        return binding.root
    }
}