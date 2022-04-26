package com.example.roomdatabaseexample.utils

import android.content.Context
import android.content.SharedPreferences
import com.example.roomdatabaseexample.Constants

class SharedPreference(val context: Context) {
    fun setValueByKey(key: String?, value: String?){
        val sp: SharedPreferences =context.getSharedPreferences(Constants.share_preference_fileName,Context.MODE_PRIVATE)

        val edt=sp.edit()
         edt.putString(key,value)
         edt.apply()

    }
    fun getValueByKey(key: String?): String?{
        val sp1: SharedPreferences =context.getSharedPreferences(Constants.share_preference_fileName,Context.MODE_PRIVATE)
       return sp1.getString(key,"")
    }
}