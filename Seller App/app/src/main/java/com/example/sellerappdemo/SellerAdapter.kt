package com.example.sellerappdemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.seller_custom_layout.view.*

class SellerAdapter(var context: Context,var sellerList: MutableList<SellerEntity>): RecyclerView.Adapter<SellerAdapter.SellerViewHolder>() {
    lateinit var myInterface: SellerAdapter.MyInterface
   // lateinit var getItem:OnClickListener

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SellerViewHolder {
       var view=LayoutInflater.from(context).inflate(R.layout.seller_custom_layout,parent,false)
    return SellerViewHolder(view)
    }

    override fun onBindViewHolder(holder: SellerViewHolder, position: Int) {
        holder.id.text=sellerList[position].name
        holder.name.text=sellerList[position].id
        //holder.img.setImageResource(sellerList[position].sellerPic)
        holder.itemView.setOnClickListener({
            myInterface.onClick(position)
        })
    }

    override fun getItemCount(): Int {
       return sellerList.size
    }

    class SellerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var img=itemView.findViewById<ImageView>(R.id.sellerimageView)
        var id=itemView.findViewById<TextView>(R.id.textsellerId)
        var name=itemView.findViewById<TextView>(R.id.txtSellerName)

    }
    interface MyInterface{
        fun onClick(position: Int)
    }
    fun clickListener(myInterface: MyInterface){
        this.myInterface=myInterface
    }


}