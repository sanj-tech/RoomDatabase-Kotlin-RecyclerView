package com.example.roomdatabaseexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.roomdatabaseexample.utils.SharedPreference
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        initView()
    }

    private fun initView() {
        var sp=getSharedPreferences("mypref", MODE_PRIVATE)
        txtWelcome.text=sp.getString("name","")
    }
}