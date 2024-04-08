package com.example.pinterestclone.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pinterestclone.PostItem
import com.example.pinterestclone.R
import com.makeramen.roundedimageview.RoundedImageView

class PinterestAdapter internal constructor(
    private val context: Context,
    private val postItems: List<PostItem>
) :
    RecyclerView.Adapter<PinterestAdapter.ListViewHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val postImageView: RoundedImageView = itemView.findViewById(R.id.imagePost)

        fun setPostImage(postItem: PostItem) {
            postImageView.setImageResource(postItem.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val itemView = inflater.inflate(R.layout.item_pinterest, parent, false)
        return ListViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.setPostImage(postItems[position])
    }

    override fun getItemCount(): Int {
        return postItems.size
    }
}