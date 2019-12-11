package com.babaetskv.myresume.ui.viewholder

import android.view.View
import android.widget.TextView
import com.babaetskv.myresume.R
import com.babaetskv.myresume.data.models.University

/**
 * @author babaetskv on 11.12.19
 */
class UniversityViewHolder(itemView: View) : BaseViewHolder<University>(itemView) {
    private val universityTitle = itemView.findViewById<TextView>(R.id.university_name)
    private val universityTime = itemView.findViewById<TextView>(R.id.university_time)
    private val universityDescription = itemView.findViewById<TextView>(R.id.university_description)

    override fun bind(item: University) {
        universityTitle.text = item.universityName
        universityTime.text = "%s-%s".format(item.yearFrom, item.yearUntil)
        universityDescription.text = item.description
    }
}
