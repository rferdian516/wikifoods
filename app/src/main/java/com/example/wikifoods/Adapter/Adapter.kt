package com.example.wikifoods.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.wikifoods.R

class Adapter(private val listFood: ArrayList<Food>) :
    RecyclerView.Adapter<Adapter.AdapterViewHolder>() {
    private lateinit var onItemClickCallback: Adapter.OnItemClickCallback

    //viewHolder
    inner class AdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var btnLike: ImageButton = itemView.findViewById(R.id.btn_like)
        var btnLike2: ImageButton = itemView.findViewById(R.id.btn_like2)
    }

    //Callback
    fun setOnItemClickCallback(onItemClickCallback: Adapter.OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    //onClickitem
    interface OnItemClickCallback {
        fun onItemClicked(data: Food)
    }

    //3 komponen penting adapter
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): AdapterViewHolder {
        val view: View =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.item_card, viewGroup, false)
        return AdapterViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterViewHolder, position: Int) {
        val food = listFood[position]
        Glide.with(holder.itemView.context)
            .load(food.photo)
            .apply(RequestOptions().override(50, 50))
            .into(holder.imgPhoto)
        holder.tvName.text = food.name
        holder.tvDetail.text = food.detail
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listFood[holder.adapterPosition]) }

        holder.btnLike.setOnClickListener {
            holder.btnLike.visibility = View.INVISIBLE
            holder.btnLike2.visibility = View.VISIBLE
            Toast.makeText(
                holder.itemView.context,
                "Favorite " + listFood[holder.adapterPosition].name,
                Toast.LENGTH_SHORT
            ).show()
        }

        holder.btnLike2.setOnClickListener {
            holder.btnLike.visibility = View.VISIBLE
            holder.btnLike2.visibility = View.INVISIBLE
            Toast.makeText(
                holder.itemView.context,
                "Menghapus " + listFood[holder.adapterPosition].name + " dari favorit",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    override fun getItemCount(): Int {
        return listFood.size
    }

}