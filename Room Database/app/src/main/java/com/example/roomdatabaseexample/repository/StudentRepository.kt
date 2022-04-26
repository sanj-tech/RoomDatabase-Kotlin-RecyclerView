package com.example.roomdatabaseexample.repository

import android.content.Context
import com.example.roomdatabaseexample.StudentDatabase
import com.example.roomdatabaseexample.entity.Student

class StudentRepository(context: Context) {
    var studentDao=StudentDatabase.getInstance(context).studentDao()

    fun saveStudentData(student: Student){
        studentDao.saveStudentData(student)
    }

    fun collectData():Student {
        return studentDao.collectData()
    }
    fun updateData(studName: String,studAddress:String){
        studentDao.updateData(studName,studAddress )
    }

}