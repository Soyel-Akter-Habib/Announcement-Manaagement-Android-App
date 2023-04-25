package com.example.announce

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class EditFragment : Fragment() {
    lateinit var recyclerView2: RecyclerView
    lateinit var announceList2:ArrayList<data>
    lateinit var announceAdapter2 : announceAdapter2





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        recyclerView2 = view?.findViewById(R.id.recView)!!
//        recyclerView2.setHasFixedSize(true)
//        recyclerView2.layoutManager = LinearLayoutManager(activity)
//        announceList2 = ArrayList()
//
//        announceList2.add(data("Co-curricular/Sport/cultural", "Organised by school of computer science and engineering"))
//        announceList2.add(data("Examination/Academic", "Organised by school of computer science and engineering"))
//        announceList2.add(data("Youth Affairs/ Podcast", "Organised by school of computer science and engineering"))
//        announceList2.add(data("Admission / Administration", "Organised by school of computer science and engineering"))
//        announceList2.add(data("Dance Competition", "Organised by school of computer science and engineering"))
//        announceList2.add(data("Co-curricular/Sport/cultural", "Organised by school of computer science and engineering"))
//        announceList2.add(data("Unique competion on Round Table", "Organised by school of computer science and engineering"))
//
//        announceAdapter2 = announceAdapter2(announceList2)
//        recyclerView2.adapter = announceAdapter2
//        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_edit, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView2 = view?.findViewById(R.id.recView)!!
        recyclerView2.setHasFixedSize(true)
        recyclerView2.layoutManager = LinearLayoutManager(activity)
        announceList2 = ArrayList()

        announceList2.add(data("Co-curricular/Sport/cultural", "Organised by school of computer science and engineering"))
        announceList2.add(data("Examination/Academic", "Organised by school of computer science and engineering"))
        announceList2.add(data("Youth Affairs/ Podcast", "Organised by school of computer science and engineering"))
        announceList2.add(data("Admission / Administration", "Organised by school of computer science and engineering"))
        announceList2.add(data("Dance Competition", "Organised by school of computer science and engineering"))
        announceList2.add(data("Co-curricular/Sport/cultural", "Organised by school of computer science and engineering"))
        announceList2.add(data("Unique competion on Round Table", "Organised by school of computer science and engineering"))

        announceAdapter2 = announceAdapter2(announceList2)
        recyclerView2.adapter = announceAdapter2
        //
    }



}