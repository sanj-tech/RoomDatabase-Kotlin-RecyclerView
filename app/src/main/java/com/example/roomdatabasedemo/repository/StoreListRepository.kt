package com.example.roomdatabasedemo.repository

import android.content.Context
import com.example.roomdatabasedemo.DemoDB
import com.example.roomdatabasedemo.entity.StoreList

class StoreListRepository(context: Context) {
    val storeListDao= DemoDB.getInstance(context).getStoreListDao()

    fun saveStoreList(storeList: List<StoreList>){
        storeListDao.saveStoreList(storeList)
    }


    fun getStoreList():MutableList<StoreList>{
        return storeListDao.getStoreList()
    }

    fun updateStoreList(storeId:String,storeAddress:String){
        storeListDao.updateStoreList(storeId,storeAddress)
    }

    fun deleteStoreList(storeId: String){
        storeListDao.deleteStoreList(storeId)
    }
}