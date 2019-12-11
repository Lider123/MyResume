package com.babaetskv.myresume.ui.viewholder

import android.view.View
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import com.babaetskv.myresume.R
import com.babaetskv.myresume.data.models.Skill
import com.squareup.picasso.Picasso

/**
 * @author Konstantin on 10.12.2019
 */
class SkillViewHolder(itemView: View) : BaseViewHolder<Skill>(itemView) {
    private val imageView = itemView.findViewById<ImageView>(R.id.skill_image)
    private val titleText = itemView.findViewById<TextView>(R.id.skill_name)
    private val ratingBar = itemView.findViewById<RatingBar>(R.id.skill_rating)

    override fun bind(item: Skill) {
        Picasso.get()
            .load(item.imageUrl)
            .error(R.drawable.error)
            .into(imageView)
        titleText.text = item.name
        ratingBar.rating = item.rating
    }
}
