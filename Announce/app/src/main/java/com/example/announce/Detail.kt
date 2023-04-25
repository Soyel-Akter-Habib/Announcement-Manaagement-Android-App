package com.example.announce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Detail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val announcement = intent.getParcelableExtra<data>("announcement")
        if(announcement!=null){
            val textview1 : TextView = findViewById(R.id.title1)
            val textview2 :TextView = findViewById(R.id.content1)

            textview1.text = announcement.title
            textview2.text = announcement.content
        }
    }
}