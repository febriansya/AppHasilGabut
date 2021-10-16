package com.bulleh.sahabatnabiapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bulleh.sahabatnabiapp.R
import com.bulleh.sahabatnabiapp.data.Sahabat
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GridSahabatAdapter(val listSahabat: ArrayList<Sahabat>) :
    RecyclerView.Adapter<GridSahabatAdapter.SahabatViewHolder>() {

    private lateinit var onItemClickCallBack: OnItemClickCallBack

    fun setOnItemClickCallback(onItemClickCallBack: OnItemClickCallBack){
        this.onItemClickCallBack = onItemClickCallBack
    }

    interface OnItemClickCallBack {
        fun onItemClicked(data: Sahabat)
    }


    inner class SahabatViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imagePhoto: ImageView = itemView.findViewById(R.id.image_sahabat)
        var name: TextView = itemView.findViewById(R.id.name_sahabat)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SahabatViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.sahabat_grid, parent, false)
        return SahabatViewHolder(view)
    }

    override fun onBindViewHolder(holder: SahabatViewHolder, position: Int) {
        val sahabat = listSahabat[position]
        Glide.with(holder.itemView.context)
            .load(listSahabat[position].image)
//         .apply(RequestOptions().override(70,70))
            .into(holder.imagePhoto)

        holder.name.text = sahabat.nama

        holder.itemView.setOnClickListener {
            onItemClickCallBack.onItemClicked(listSahabat[holder.absoluteAdapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return listSahabat.size
    }


}