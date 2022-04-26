package com.example.myroomdatabase.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.myroomdatabase.dao.EmpDao
import com.example.myroomdatabase.entity.empEntity

@Database(entities = [empEntity::class], version = 1, exportSchema = false)
abstract class EmployeeDatabase: RoomDatabase() {

    companion object {
        var instance: EmployeeDatabase? = null

        @Synchronized
        fun getInstance(ctx: Context): EmployeeDatabase {
            if (instance == null)
                instance = Room.databaseBuilder(
                    ctx.applicationContext, EmployeeDatabase::class.java,
                    "empDb"
                ).allowMainThreadQueries()
                    .build()
            return instance!!

        }

    }
    abstract fun empDao():EmpDao
}