package com.example.myroomdatabase

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.myroomdatabase.Repository.EmpRepository
import com.example.myroomdatabase.entity.empEntity
import kotlinx.android.synthetic.main.activity_employee.*

class EmployeeActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super
            .onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee)
        initView()
    }

    private fun initView() {
        btInsert.setOnClickListener({
            var ID=editId.text.toString()
            var name=editName.text.toString()
            var contact=editContact.text.toString()
            var address=editAddress.text.toString()

            var myEmpData=empEntity(ID,name,contact,address)
            EmpRepository(this).saveEmployeeDetails(myEmpData)
            EmpRepository(this).getData()

            txtId.text = myEmpData.empId
            txtname.text = myEmpData.empName
            txtaddress.text = myEmpData.empAddress
            txtcontact.text = myEmpData.empContact

            Log.d("id",ID)
            Log.d("name",name)
            Log.d("address",address)
            Log.d("contact",contact)
        })

    }
}