package com.example.announce

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.textfield.TextInputEditText


class AddFragment : Fragment() {

  lateinit var btnSubmit :Button
  lateinit var titleEdit:EditText
  lateinit var contentEdit:EditText
//  lateinit var bundle: Bundle




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {




        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        super.onViewCreated(view, savedInstanceState)

        btnSubmit = view?.findViewById(R.id.btnSubmit)!!
        titleEdit = view?.findViewById<TextInputEditText>(R.id.title)!!
        contentEdit = view?.findViewById<TextInputEditText>(R.id.content)!!

        btnSubmit.setOnClickListener{
            sendDataToFragment()
        }
    }

    private fun sendDataToFragment(){

//        var title:String
//        var content:String
//        title = titleEdit.text.toString()
//        content = contentEdit.text.toString()
//
//        bundle.putString("title",title)
//        bundle.putString("content",content)



//        val sharedPreferences :SharedPreferences? =activity?.getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
//        val editor:SharedPreferences.Editor? = sharedPreferences!!.edit()
//        editor.apply {
//            this!!.putString("titleKey",title)
//            this!!.putString("contentKey",content)
//        }!!.apply()

//        val transaction = activity?.supportFragmentManager?.beginTransaction()
//        transaction?.replace(R.id.container,HomeFragment())
//
//        transaction?.commit()
        val intent:Intent = Intent(activity,UserDashboard::class.java)
        Toast.makeText(activity,"Data Added Successfully",Toast.LENGTH_SHORT).show()
        activity?.startActivity(intent)


    }


}