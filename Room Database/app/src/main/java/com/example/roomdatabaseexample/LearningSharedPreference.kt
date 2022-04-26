package com.example.roomdatabaseexample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_learning_sharedpreference.*
import kotlinx.android.synthetic.main.activity_learning_sharedpreference.view.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class LearningSharedPreference: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learning_sharedpreference)
initView()

    }

    private fun initView() {

        btLogin.setOnClickListener({

            var name1 = edtNames.text.toString().trim()
            var password1 = edtPasswords1.text.toString().trim()

            var sp=getSharedPreferences("mypref", MODE_PRIVATE)

            sp.edit().putString("name",name1).apply()
            sp.edit().putString("password",password1).apply()

            sp.edit().putBoolean("login",true).apply()

            var intent=Intent(this,WelcomeActivity::class.java)
            startActivity(intent)
        })

    }
}