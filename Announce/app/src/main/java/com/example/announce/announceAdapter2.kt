package com.example.announce

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class announceAdapter2(private val announceList:ArrayList<data>) : RecyclerView.Adapter<announceAdapter2.AnnounceViewHolder>(){
    var onItemClick : ((data)-> Unit)? = null
    class AnnounceViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        val titleView : TextView = itemView.findViewById(R.id.t3)
        val contentView : TextView = itemView.findViewById(R.id.t4)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnnounceViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item2, parent,false)
        return AnnounceViewHolder(view)
    }

    override fun onBindViewHolder(holder: AnnounceViewHolder, position: Int) {

        val announce = announceList[position]
        holder.titleView.text= announce.title
        holder.contentView.text = announce.content
        holder.itemView.setOnClickListener{
            onItemClick?.invoke(announce)
        }
    }

    override fun getItemCount(): Int {
        return announceList.size
    }
}