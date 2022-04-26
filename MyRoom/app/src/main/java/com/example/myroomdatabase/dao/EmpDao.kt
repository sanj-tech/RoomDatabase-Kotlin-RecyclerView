package com.example.myroomdatabase.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.myroomdatabase.entity.empEntity

@Dao
interface EmpDao {
    @Insert
    fun saveEmployeeDetails(empEntity: empEntity)

    @Query("select * from empEntity")
    fun getData():empEntity

}