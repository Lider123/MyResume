package com.babaetskv.myresume.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.babaetskv.myresume.R
import com.babaetskv.myresume.data.models.Skill
import com.babaetskv.myresume.ui.viewholder.SkillViewHolder

/**
 * @author babaetskv on 11.12.19
 */
class SkillAdapter(override val items: List<Skill>) : BaseAdapter<Skill>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SkillViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_skill, parent, false)
        return SkillViewHolder(view)
    }
}