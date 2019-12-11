package com.babaetskv.myresume.ui.viewholder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.babaetskv.myresume.R
import com.babaetskv.myresume.data.models.Project
import com.squareup.picasso.Picasso

/**
 * @author babaetskv on 11.12.19
 */
class ProjectViewHolder(itemView: View) : BaseViewHolder<Project>(itemView) {
    private val projectTitle = itemView.findViewById<TextView>(R.id.project_title)
    private val projectDesription = itemView.findViewById<TextView>(R.id.project_desription)
    private val projectLink = itemView.findViewById<TextView>(R.id.project_link)
    private val projectImage = itemView.findViewById<ImageView>(R.id.project_image)

    override fun bind(item: Project) {
        projectTitle.text = item.projectName
        projectDesription.text = item.description
        projectLink.text = item.projectUrl

        if (item.imageUrl.isNotEmpty()) {
            Picasso.get()
                .load(item.imageUrl)
                .error(R.drawable.error)
                .into(projectImage)
        } else {
            Picasso.get()
                .load(R.drawable.placeholder_image)
                .into(projectImage)
        }
    }
}
