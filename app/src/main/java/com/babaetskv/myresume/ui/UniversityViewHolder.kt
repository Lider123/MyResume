package com.babaetskv.myresume.ui

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.babaetskv.myresume.R
import com.babaetskv.myresume.data.models.University

/**
 * @author babaetskv on 11.12.19
 */
class UniversityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val universityTitle = itemView.findViewById<TextView>(R.id.university_name)
    private val universityTime = itemView.findViewById<TextView>(R.id.university_time)
    private val universityDescription = itemView.findViewById<TextView>(R.id.university_description)

    fun bind(university: University) {
        universityTitle.text = university.universityName
        universityTime.text = "%s-%s".format(university.yearFrom, university.yearUntil)
        universityDescription.text = university.description
    }
}
