package com.example.roomdatabasedemo.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
class StoreList (var storeId: String?="", var storeName: String?, var storeAddress: String?) {
    @PrimaryKey(autoGenerate = true)
    var columnId: Int = 0
}