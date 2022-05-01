package com.example.birds.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.birds.R
import com.example.birds.model.SpeciesData
import com.example.birds.ui.species.SpeciesDetailActivity
import com.example.birds.ui.species.SpeciesViewModel

class SpeciesAdapter(
    private val context: Context,
    private val dataset: List<SpeciesData>
): RecyclerView.Adapter<SpeciesAdapter.HomeViewHolder>() {
    private val viewModel = SpeciesViewModel()

    class HomeViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        val imageView: ImageView = view.findViewById(R.id.species_image)
        val nameText: TextView = view.findViewById(R.id.species_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val adapterLayout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.species_item, parent,false)
        return HomeViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.imageResourceId)
        holder.nameText.text = context.resources.getString(item.nameResourceId)

        holder.view.setOnClickListener{
            viewModel.setData(item, context)
            val intent = Intent(context, SpeciesDetailActivity::class.java).apply {
                putExtra("image", viewModel.image.value)
                putExtra("name", viewModel.name.value)
                putExtra("description", viewModel.description.value)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = dataset.size

}