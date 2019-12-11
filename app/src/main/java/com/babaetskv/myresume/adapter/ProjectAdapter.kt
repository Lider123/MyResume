package com.babaetskv.myresume.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.babaetskv.myresume.R
import com.babaetskv.myresume.data.models.Project
import com.babaetskv.myresume.ui.ProjectViewHolder

/**
 * @author babaetskv on 11.12.19
 */
class ProjectAdapter(private val projects: List<Project>) : RecyclerView.Adapter<ProjectViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_project, parent, false)
        return ProjectViewHolder(view)
    }

    override fun getItemCount() = projects.size

    override fun onBindViewHolder(holder: ProjectViewHolder, position: Int) {
        val item = projects[position]
        holder.bind(item)
    }
}
