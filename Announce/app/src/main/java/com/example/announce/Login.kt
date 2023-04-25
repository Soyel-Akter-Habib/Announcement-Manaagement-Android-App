package com.example.announce

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        var loginBackBtn = findViewById<ImageView>(R.id.loginBackBtn)

        loginBackBtn.setOnClickListener{
            super.finish()
        }
    }

    fun loginToSignUp(view: View) {
        startActivity(Intent(this,Signup::class.java))
    }

    fun loginSubmit(view: View) {
        Toast.makeText(this,"Logged In Successfully !",Toast.LENGTH_SHORT).show()
        startActivity(Intent(this,UserDashboard::class.java))
    }


}