package com.example.roomdatabaseexample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.roomdatabaseexample.entity.Student
import com.example.roomdatabaseexample.repository.StudentRepository
import com.example.roomdatabaseexample.utils.SharedPreference
import kotlinx.android.synthetic.main.activity_main.*

class DisplayRoomData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {

        btSubmit.setOnClickListener({
            var sp=SharedPreference(this)
            var name = edName.text.toString().trim()
            var address = edAddress.text.toString().trim()

            // for sharedPreference
            sp.setValueByKey(Constants.userName,name)
            sp.setValueByKey(Constants.userAddress,address)

           // for room database
//            var student = Student(name, address)
//
//            StudentRepository(this).saveStudentData(student)
//
//            StudentRepository(this).collectData()

            //display data in textView

//            txtName.text = student.studName
//            txtAddress.text = student.studAddress


// display data in logcat
//            Log.d("name",name)
//            Log.d("address",address)


            //sharedPreference
            txtName.text=sp.getValueByKey(Constants.userName)
            txtAddress.text=sp.getValueByKey(Constants.userAddress)

        })
       /* btUpdate.setOnClickListener({

            var name = edName.text.toString().trim()
            var address = edAddress.text.toString().trim()
            var student = Student(name, address)
            StudentRepository(this).updateData("Bharti", "patel")

            txtName.text = student.studName
            txtAddress.text = student.studAddress


        })*/
    }
}