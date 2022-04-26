package com.example.sellerappdemo

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [SellerEntity::class], version = 1, exportSchema = true)
abstract class SellerDB: RoomDatabase() {
    companion object {
        var instance: SellerDB? = null

        @Synchronized
        fun getInstance(context: Context): SellerDB {
            if (instance == null)
                instance = Room.databaseBuilder(
                    context.applicationContext, SellerDB::class.java,
                    "studentDb"
                ).allowMainThreadQueries()
                    .build()
            return instance!!
        }
    }
    abstract fun sellerDao():SellerDao
}