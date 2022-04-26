package com.example.roomdatabaseexample.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.roomdatabaseexample.entity.Student

@Dao
interface StudentDao {
    @Insert
    fun saveStudentData(student: Student)

    @Query("Select * from Student")
    fun collectData():Student


@Query("UPDATE Student SET studName=:studName where studAddress=:studAddress")
fun updateData(studName: String,studAddress:String)



}