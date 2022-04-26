package com.example.sellerappdemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sellerdetail_layout.*

class SelerDetailActivity: AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sellerdetail_layout)
        initView()
    }

    private fun initView() {
        var intent=getIntent()
       var extraName= intent.getStringExtra("name")
        //var extrapic=intent.getIntExtra("pic",0)
        var extraId=intent.getStringExtra("id")

        detailtextsellerId.text=extraId
        detailtxtSellerName.text=extraName
        //detaailsellerimageView.setImageResource(extrapic)


    }
}