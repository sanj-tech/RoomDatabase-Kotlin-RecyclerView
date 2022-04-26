package com.example.roomdatabaseexample.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Student(var studName:String?,var studAddress:String?) {
    @PrimaryKey(autoGenerate = true)
    var colId:Int=0
}