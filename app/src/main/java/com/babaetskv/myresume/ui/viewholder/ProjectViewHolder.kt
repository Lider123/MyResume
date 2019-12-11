package com.babaetskv.myresume.ui.viewholder

import android.view.View
import android.widget.TextView
import com.babaetskv.myresume.R
import com.babaetskv.myresume.data.models.Project

/**
 * @author babaetskv on 11.12.19
 */
class ProjectViewHolder(itemView: View) : BaseViewHolder<Project>(itemView) {
    private val projectTitle = itemView.findViewById<TextView>(R.id.project_title)
    private val projectDesription = itemView.findViewById<TextView>(R.id.project_desription)
    private val projectLink = itemView.findViewById<TextView>(R.id.project_link)

    override fun bind(item: Project) {
        projectTitle.text = item.projectName
        projectDesription.text = item.description
        projectLink.text = item.projectUrl
    }
}
