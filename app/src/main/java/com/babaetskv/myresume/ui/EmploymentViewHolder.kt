package com.babaetskv.myresume.ui

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.babaetskv.myresume.R
import com.babaetskv.myresume.data.models.Employment

/**
 * @author babaetskv on 11.12.19
 */
class EmploymentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val companyTitle = itemView.findViewById<TextView>(R.id.company_name)
    private val companySite = itemView.findViewById<TextView>(R.id.company_site)
    private val companyTime = itemView.findViewById<TextView>(R.id.company_time)
    private val employmentDescription = itemView.findViewById<TextView>(R.id.employment_description)

    fun bind(employment: Employment) {
        companyTitle.text = employment.companyName
        companySite.text = employment.companySite
        companyTime.text = "%s-%s".format(employment.yearFrom, employment.yearUntil)
        employmentDescription.text = employment.description
    }
}