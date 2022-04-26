package com.example.roomdatabasedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.roomdatabasedemo.entity.StoreList
import com.example.roomdatabasedemo.repository.StoreListRepository
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), RecyclerViewListAdapter.OnItemClick {
    var myStoreList = mutableListOf<StoreList>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()

    }

    private fun initView() {
//        emp.add(Employee("kkkkkk","Abhishek", "pune"))
//       emp.add(Employee("h","Vijay",  "azamagarh1"))
//        emp.add(Employee("hhh","Ajay", "azamagarh2"))
//        emp.add(Employee("kkkkkk","Abhishek", "pune"))
//        emp.add(Employee("h","Vijay",  "azamagarh1"))
//        emp.add(Employee("hhh","Ajay", "azamagarh2"))
//        emp.add(Employee("kkkkkk","Abhishek", "pune"))
//        emp.add(Employee("h","Vijay",  "azamagarh1"))
//        emp.add(Employee("hhh","Ajay", "azamagarh2"))

        myStoreList.add(StoreList("1","steel","khopoli"))
        myStoreList.add(StoreList("2","steel","mumbai"))
        myStoreList.add(StoreList("3","metal","khopoli"))
        myStoreList.add(StoreList("4","steel","pune"))
        myStoreList.add(StoreList("5","steel","pune"))
        myStoreList.add(StoreList("6","steel","pune"))
        myStoreList.add(StoreList("7","steel","pune"))

        StoreListRepository(this).saveStoreList(myStoreList)
        StoreListRepository(this).updateStoreList("5","Hinjewadi")
       myStoreList= StoreListRepository(context = this).getStoreList()

        /*employeeList.add(StoreList("1","Abhishek",  "azamagarh"))
        employeeList.add(StoreList("2","Vijay",  "azamagarh1"))
        employeeList.add(StoreList("3","Ajay", "azamagarh2"))
        employeeList.add(StoreList("4","Sangita", "azamagarh3"))
        employeeList.add(StoreList("5","Rahul", "azamagarh4"))


        StoreListRepository(this).saveStoreList(employeeList)*/
        //StoreListRepository(this).updateStoreList("2","Gurgaon")
        //StoreListRepository(this).deleteStoreList("2")
       // storeList1= StoreListRepository(context = this).getStoreList()

        val recyclerListAdapter = RecyclerViewListAdapter(this, myStoreList)
        recvList.layoutManager = LinearLayoutManager(this)

        recvList.adapter = recyclerListAdapter
        recyclerListAdapter.setOnClickListner(this)


    }

    override fun onClick(position: Int) {
        Toast.makeText(this, myStoreList[position].storeName,Toast.LENGTH_LONG).show()
    }
}