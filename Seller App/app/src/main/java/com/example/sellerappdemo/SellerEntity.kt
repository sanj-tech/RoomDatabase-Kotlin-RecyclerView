package com.example.sellerappdemo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class SellerEntity(var name:String?="",var id:String) {
    @PrimaryKey(autoGenerate = true)
    var columnId:Int=0
}