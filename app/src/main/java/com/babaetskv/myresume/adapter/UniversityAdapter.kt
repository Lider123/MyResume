package com.babaetskv.myresume.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.babaetskv.myresume.R
import com.babaetskv.myresume.data.models.University
import com.babaetskv.myresume.ui.UniversityViewHolder

/**
 * @author babaetskv on 11.12.19
 */
class UniversityAdapter(private val education: List<University>) : RecyclerView.Adapter<UniversityViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UniversityViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_university, parent, false)
        return UniversityViewHolder(view)
    }

    override fun getItemCount() = education.size

    override fun onBindViewHolder(holder: UniversityViewHolder, position: Int) {
        val item = education[position]
        holder.bind(item)
    }
}
