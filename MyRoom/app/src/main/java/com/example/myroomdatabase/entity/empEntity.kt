package com.example.myroomdatabase.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class empEntity (var empId:String,var empName:String,var empContact:String,var empAddress:String){
    @PrimaryKey(autoGenerate = true)
    var columnId:Int=0
}