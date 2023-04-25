package com.example.announce

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView


class HomeFragment : Fragment() {
//    lateinit var listview:ListView
//    var list :ArrayList<String> = ArrayList()
//    lateinit var arrayAdapter: ArrayAdapter<String>


//    lateinit var recyclerView:RecyclerView
//    lateinit var announceList:ArrayList<data>
//    lateinit var announceAdapter : announceAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

//        recyclerView = view?.findViewById(R.id.recView) as RecyclerView


        return inflater.inflate(R.layout.fragment_home, container, false)

    }



}