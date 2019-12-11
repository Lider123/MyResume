package com.babaetskv.myresume.adapter

import androidx.recyclerview.widget.RecyclerView
import com.babaetskv.myresume.ui.viewholder.BaseViewHolder

/**
 * @author babaetskv on 11.12.19
 */
abstract class BaseAdapter<T> : RecyclerView.Adapter<BaseViewHolder<T>>() {
    protected abstract val items: List<T>

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: BaseViewHolder<T>, position: Int) {
        val item = items[position]
        holder.bind(item)
    }
}