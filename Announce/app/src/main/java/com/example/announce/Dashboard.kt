package com.example.announce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class Dashboard : AppCompatActivity() {

    lateinit var listview: ListView
    var list :ArrayList<String> = ArrayList()
    lateinit var arrayAdapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        listview = findViewById(R.id.listview)
        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,list)

    }
}