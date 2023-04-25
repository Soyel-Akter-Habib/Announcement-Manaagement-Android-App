package com.example.announce

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.VideoView

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        var videoView :VideoView
        videoView = findViewById(R.id.videoView)
        videoView.setVideoPath("android.resource://" + packageName + "/" + R.raw.splash)
        videoView.start()
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
            finish()
        },6000)
    }
}