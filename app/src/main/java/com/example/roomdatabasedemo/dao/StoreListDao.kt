package com.example.roomdatabasedemo.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.roomdatabasedemo.entity.StoreList
@Dao
interface StoreListDao {
    @Insert
    fun saveStoreList(storeList: List<StoreList>)

    @Query("SELECT * FROM StoreList")
    fun getStoreList() : MutableList<StoreList>

    @Query("UPDATE StoreList SET storeAddress=:storeAddress WHERE storeId=:storeId")
    fun updateStoreList(storeId: String,storeAddress:String)

    @Query("DELETE FROM StoreList WHERE storeId=:storeId")
    fun deleteStoreList(storeId: String)

}