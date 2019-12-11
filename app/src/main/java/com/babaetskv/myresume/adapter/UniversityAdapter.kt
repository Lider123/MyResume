package com.babaetskv.myresume.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.babaetskv.myresume.R
import com.babaetskv.myresume.data.models.University
import com.babaetskv.myresume.ui.viewholder.UniversityViewHolder

/**
 * @author babaetskv on 11.12.19
 */
class UniversityAdapter(override val items: List<University>) : BaseAdapter<University>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UniversityViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_university, parent, false)
        return UniversityViewHolder(view)
    }
}
