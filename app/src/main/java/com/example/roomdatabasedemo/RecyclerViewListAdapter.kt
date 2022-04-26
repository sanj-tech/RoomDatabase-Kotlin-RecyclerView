package com.example.roomdatabasedemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.roomdatabasedemo.entity.StoreList

class RecyclerViewListAdapter(var context: Context, var myList: MutableList<StoreList>) : RecyclerView.Adapter<RecyclerViewListAdapter.empViewHolder>() {
    lateinit var onItemClick:OnItemClick

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): empViewHolder {
        var view=LayoutInflater.from(context).inflate(R.layout.custom_layout,parent,false)
    return empViewHolder(view)
    }

    override fun onBindViewHolder(holder: empViewHolder, position: Int) {
        holder.storeId.text=myList[position].storeId
        holder.storeName.text=myList[position].storeName
        holder.storeAddress.text=myList[position].storeAddress

        holder.itemView.setOnClickListener {
            onItemClick.onClick(position)
        }
    }

    override fun getItemCount(): Int {
      return myList.size
    }



    class empViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var storeId=itemView.findViewById<TextView>(R.id.txtId)
        var storeName=itemView.findViewById<TextView>(R.id.txtName)
        var storeAddress=itemView.findViewById<TextView>(R.id.txtAddress)

    }
    interface OnItemClick{
        fun onClick(position:Int)
    }

    fun setOnClickListner(onItemClick: OnItemClick) {
        this.onItemClick=onItemClick
    }


}