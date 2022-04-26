package com.example.sharedpreferencedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
       bt_login.setOnClickListener({
           var sharePref=getSharedPreferences("demoPref", MODE_PRIVATE)
          var name= et_Name.text.toString()
           var pass=et_Password.text.toString()
           Toast.makeText(this,"$name $pass",Toast.LENGTH_SHORT).show()
        sharePref.edit().putString("name",name).apply()
           sharePref.edit().putString("password",pass).apply()

           txt_name.text=name
           txt_pass.text=pass

       })
    }
}