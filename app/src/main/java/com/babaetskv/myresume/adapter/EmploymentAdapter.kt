package com.babaetskv.myresume.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.babaetskv.myresume.R
import com.babaetskv.myresume.data.models.Employment
import com.babaetskv.myresume.ui.viewholder.EmploymentViewHolder

/**
 * @author babaetskv on 11.12.19
 */
class EmploymentAdapter(override val items: List<Employment>) : BaseAdapter<Employment>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmploymentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_employment, parent, false)
        return EmploymentViewHolder(view)
    }
}
