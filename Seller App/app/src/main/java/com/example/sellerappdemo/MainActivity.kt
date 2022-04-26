package com.example.sellerappdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), SellerAdapter.MyInterface {
   // var sellerList:MutableList<SellerEntity> = mutableListOf()
    var sellerList = mutableListOf<SellerEntity>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
//sellerList.add(SellerModel(R.drawable.ic_launcher_foreground,"1","Priya"))
        sellerList.add(SellerEntity("priya","1"))
        sellerList.add(SellerEntity("Riya","2"))
        sellerList.add(SellerEntity("Ankush","3"))
        sellerList.add(SellerEntity("Amit","4"))
        sellerList.add(SellerEntity("Ajay","5"))
        sellerList.add(SellerEntity("Rohan","6"))
        sellerList.add(SellerEntity("priya","7"))
       // sellerList.add(SellerEntity("priya","2"))

        SellerRepository(this).saveData(sellerList)
        //SellerRepository(this).updateInfo("Sanj","1")

        sellerList= SellerRepository(context = this).getData()




//        sellerList.add(SellerModel(R.drawable.ic_launcher_foreground,"3","Priya"))
//
//        sellerList.add(SellerModel(R.drawable.ic_launcher_foreground,"4","Priya"))
//        sellerList.add(SellerModel(R.drawable.ic_launcher_foreground,"5","Priya"))
//
//        sellerList.add(SellerModel(R.drawable.ic_launcher_foreground,"6","Priya"))
//
//        sellerList.add(SellerModel(R.drawable.ic_launcher_foreground,"7","Priya"))
//
//        sellerList.add(SellerModel(R.drawable.ic_launcher_foreground,"8","Priya"))

    sellerRv.layoutManager=LinearLayoutManager(this)
        var adapter=SellerAdapter(this,sellerList)
        sellerRv.adapter=adapter
adapter.clickListener(this)

    }

    override fun onClick(position: Int) {
        Toast.makeText(this,"clicked",Toast.LENGTH_LONG).show()
        var intent=Intent(this,SelerDetailActivity::class.java)
        intent.putExtra("name",sellerList[position].name)
        intent.putExtra("id",sellerList[position].id)
       // intent.putExtra("pic",sellerList[position].sellerPic)


        startActivity(intent)
    }
}