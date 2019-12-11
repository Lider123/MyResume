package com.babaetskv.myresume.ui.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 * @author babaetskv on 11.12.19
 */
abstract class BaseViewHolder<T>(itemView: View) : RecyclerView.ViewHolder(itemView) {

    abstract fun bind(item: T)
}
