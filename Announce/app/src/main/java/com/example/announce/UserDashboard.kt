package com.example.announce

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class UserDashboard : AppCompatActivity() {
    lateinit var bottomNavigationView: BottomNavigationView
//    lateinit var homeFragment : HomeFragment
//    lateinit var editFragment:EditFragment
//    lateinit var addFragment:AddFragment


//    lateinit var listview: ListView
//    var list :ArrayList<String> = ArrayList()
//    lateinit var arrayAdapter: ArrayAdapter<String>

    lateinit var recyclerView: RecyclerView
    lateinit var announceList:ArrayList<data>
    lateinit var announceAdapter : announceAdapter




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_dashboard)

        recyclerView = findViewById(R.id.recView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        announceList = ArrayList()

        val sharedPreferences:SharedPreferences? = getSharedPreferences("sharedPrefs",Context.MODE_PRIVATE)
        val savedTitle:String? = sharedPreferences?.getString("titleKey",null)
        val savedContent: String? = sharedPreferences?.getString("titleKey",null)

//        announceList.add(data(savedTitle,savedContent))



        announceList.add(data("Co-curricular/Sport/cultural", "Organised by school of computer science and engineering"))
        announceList.add(data("Examination/Academic", "Organised by school of computer science and engineering"))
        announceList.add(data("Youth Affairs/ Podcast", "Organised by school of computer science and engineering"))
        announceList.add(data("Admission / Administration", "Organised by school of computer science and engineering"))
        announceList.add(data("Dance Competition", "Organised by school of computer science and engineering"))
        announceList.add(data("Co-curricular/Sport/cultural", "Organised by school of computer science and engineering"))
        announceList.add(data("Unique competion on Round Table", "Organised by school of computer science and engineering"))

        announceAdapter = announceAdapter(announceList)
        recyclerView.adapter = announceAdapter

        announceAdapter.onItemClick = {
            val intent = Intent(this,Detail::class.java)
            intent.putExtra("announcement",it)
            startActivity(intent)
        }





        // listView Code Start here -->

//        listview = findViewById(R.id.listview)
//        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,list)




        // Back Press Call-->

        var actionbar = supportActionBar
        //set back click
        actionbar?.setDisplayHomeAsUpEnabled(true)
        actionbar?.setDisplayHomeAsUpEnabled(true)

//
//        bottomNavigationView  = findViewById(R.id.bottomNav)
//        supportFragmentManager.beginTransaction().replace(R.id.container,homeFragment).commit()
//        bottomNavigationView.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener { menu })



//        loadFragment(HomeFragment())
        bottomNavigationView = findViewById(R.id.bottomNav)
        bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.navHome -> {
                    startActivity(Intent(this,UserDashboard::class.java))
                    true
                }
                R.id.navAdd -> {
                    loadFragment(AddFragment())
                    true
                }
                R.id.navEdit -> {
                    loadFragment(EditFragment())
                    true
                }
                else -> throw IllegalStateException("Invalid Selection")

            }
        }
    }



    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.commit()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }




}