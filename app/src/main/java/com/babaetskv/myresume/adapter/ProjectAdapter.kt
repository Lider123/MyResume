package com.babaetskv.myresume.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.babaetskv.myresume.R
import com.babaetskv.myresume.data.models.Project
import com.babaetskv.myresume.ui.viewholder.ProjectViewHolder

/**
 * @author babaetskv on 11.12.19
 */
class ProjectAdapter(override val items: List<Project>) : BaseAdapter<Project>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_project, parent, false)
        return ProjectViewHolder(view)
    }
}
