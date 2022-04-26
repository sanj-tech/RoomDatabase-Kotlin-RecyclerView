package com.example.sellerappdemo

import android.content.Context

class SellerRepository(context: Context) {
    var sellerDao = SellerDB?.getInstance(context).sellerDao()

    fun saveData(sellerList: List<SellerEntity>){
        sellerDao.saveData(sellerList)
    }


    fun updateInfo(name:String,id:String){
        sellerDao.updateInfo(name,id)
    }

    fun getData():MutableList<SellerEntity> {
        return sellerDao.getData()
    }
}