package com.babaetskv.myresume

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.babaetskv.myresume.data.models.Skill
import com.babaetskv.myresume.ui.SkillViewHolder

/**
 * @author babaetskv on 11.12.19
 */
class SkillAdapter(private val skills: List<Skill>) : RecyclerView.Adapter<SkillViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SkillViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_skill, parent, false)
        return SkillViewHolder(view)
    }

    override fun getItemCount() = skills.size

    override fun onBindViewHolder(holder: SkillViewHolder, position: Int) {
        val item = skills[position]
        holder.bind(item)
    }
}