package com.example.sellerappdemo

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface SellerDao {
    @Insert
    fun saveData(sellerList: List<SellerEntity>)

    @Query("select * from SellerEntity")
    fun getData() : MutableList<SellerEntity>


    @Query("UPDATE SellerEntity SET name=:name where id=:id")
            fun updateInfo(name:String,id:String)


}