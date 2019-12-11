package com.babaetskv.myresume.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.babaetskv.myresume.R
import com.babaetskv.myresume.data.models.Employment
import com.babaetskv.myresume.ui.EmploymentViewHolder

/**
 * @author babaetskv on 11.12.19
 */
class EmploymentAdapter(private val employment: List<Employment>) : RecyclerView.Adapter<EmploymentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmploymentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_employment, parent, false)
        return EmploymentViewHolder(view)
    }

    override fun getItemCount() = employment.size

    override fun onBindViewHolder(holder: EmploymentViewHolder, position: Int) {
        val item = employment[position]
        holder.bind(item)
    }
}
