package com.example.roomdatabaseexample

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.roomdatabaseexample.dao.StudentDao
import com.example.roomdatabaseexample.entity.Student

@Database(entities = [Student::class], version = 1, exportSchema = false)
abstract class StudentDatabase : RoomDatabase() {
    companion object {
        var instance: StudentDatabase? = null

        @Synchronized
        fun getInstance(ctx: Context): StudentDatabase {
            if (instance == null)
                instance = Room.databaseBuilder(
                    ctx.applicationContext, StudentDatabase::class.java,
                    "studentDb"
                ).allowMainThreadQueries()
                    .build()
            return instance!!

        }


    }
    abstract fun studentDao():StudentDao
}