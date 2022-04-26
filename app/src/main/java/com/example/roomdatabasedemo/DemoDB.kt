package com.example.roomdatabasedemo

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.roomdatabasedemo.dao.StoreListDao
import com.example.roomdatabasedemo.entity.StoreList

@Database(entities = [StoreList::class],version = 1,exportSchema = false)
abstract class DemoDB: RoomDatabase() {
    companion object {
        private var instance: DemoDB? = null

        @Synchronized
        fun getInstance(ctx: Context): DemoDB {
            if (instance == null)
                instance = Room.databaseBuilder(
                    ctx.applicationContext, DemoDB::class.java,
                    "DemoDB_DB").allowMainThreadQueries()
                    .build()
            return instance!!

        }
    }

    abstract fun getStoreListDao(): StoreListDao


}