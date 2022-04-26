package com.example.myroomdatabase.Repository

import android.content.Context
import com.example.myroomdatabase.db.EmployeeDatabase
import com.example.myroomdatabase.entity.empEntity

class EmpRepository(context: Context) {
    var empDao=EmployeeDatabase.getInstance(context).empDao()

    fun saveEmployeeDetails(empEntity: empEntity){
      empDao.saveEmployeeDetails(empEntity)
    }
    fun getData():empEntity{
        return empDao.getData()
    }

}