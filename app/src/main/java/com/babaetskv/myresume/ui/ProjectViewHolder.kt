package com.babaetskv.myresume.ui

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.babaetskv.myresume.R
import com.babaetskv.myresume.data.models.Project

/**
 * @author babaetskv on 11.12.19
 */
class ProjectViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val projectTitle = itemView.findViewById<TextView>(R.id.project_title)
    private val projectDesription = itemView.findViewById<TextView>(R.id.project_desription)
    private val projectLink = itemView.findViewById<TextView>(R.id.project_link)

    fun bind(project: Project) {
        projectTitle.text = project.projectName
        projectDesription.text = project.description
        projectLink.text = project.projectUrl
    }
}
