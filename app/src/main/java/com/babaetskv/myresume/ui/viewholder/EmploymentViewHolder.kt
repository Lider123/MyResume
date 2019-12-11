package com.babaetskv.myresume.ui.viewholder

import android.view.View
import android.widget.TextView
import com.babaetskv.myresume.R
import com.babaetskv.myresume.data.models.Employment

/**
 * @author babaetskv on 11.12.19
 */
class EmploymentViewHolder(itemView: View) : BaseViewHolder<Employment>(itemView) {
    private val companyTitle = itemView.findViewById<TextView>(R.id.company_name)
    private val companySite = itemView.findViewById<TextView>(R.id.company_site)
    private val companyTime = itemView.findViewById<TextView>(R.id.company_time)
    private val employmentDescription = itemView.findViewById<TextView>(R.id.employment_description)

    override fun bind(item: Employment) {
        companyTitle.text = item.companyName
        companySite.text = item.companySite
        companyTime.text = "%s-%s".format(item.yearFrom, item.yearUntil)
        employmentDescription.text = item.description
    }
}